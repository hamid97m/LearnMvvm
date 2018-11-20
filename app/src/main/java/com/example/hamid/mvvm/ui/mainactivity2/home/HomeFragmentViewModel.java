package com.example.hamid.mvvm.ui.mainactivity2.home;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.example.hamid.mvvm.R;

import java.util.ArrayList;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

public class HomeFragmentViewModel extends ViewModel {
    private static final String TAG = "HomeFragmentViewModel";

    private  MutableLiveData<String> firstName;
    private  MutableLiveData<String> lastName;
    private  MutableLiveData<String> edittext;
    private MutableLiveData<ArrayList<PostModel>> posts;
    int i = 0;

    public MutableLiveData<String> getFirstName() {
        if (firstName==null){
            firstName=new MutableLiveData<>();
        }
        return this.firstName;
    }


    public MutableLiveData<String> getLastName() {
        if (lastName==null){
            lastName=new MutableLiveData<>();
        }
        return this.lastName;
    }



    public MutableLiveData<String> getEdittext() {
        if (edittext==null){
            edittext=new MutableLiveData<>();
        }
        return this.edittext;
    }


    public void onSaveClick(View view, String text) {
        Log.i(TAG, "onSaveClick: "+text);
        edittext.setValue(text);
        firstName.setValue(text);
        lastName.setValue(text);
        Log.i(TAG, "onSaveClick: " + edittext.getValue());
        Bundle bundle = new Bundle();
        bundle.putString("name", edittext.getValue());
        Navigation.findNavController(view).navigate(R.id.action_mainActivity2Fragment_to_detailFragment, bundle);


    }


    public MutableLiveData<ArrayList<PostModel>> getPosts() {
        if (posts == null) {
            posts = new MutableLiveData<>();
            makefakedata();

        }
        return posts;
    }


    private void makefakedata() {
        ArrayList<PostModel> postss = new ArrayList<>();


        Handler handler = new Handler();
        int delay = 1000; //milliseconds


        handler.postDelayed(new Runnable() {
            public void run() {
                String text = "salam " + i;
                PostModel postModel = new PostModel();
                postModel.setTitle("" + i);
                postModel.setContent("salam");
                postss.add(postModel);
                i = i + 1;
                posts.setValue(postss);
                Log.i(TAG, "run: ");
                handler.postDelayed(this, delay);
            }
        }, delay);


    }


}
