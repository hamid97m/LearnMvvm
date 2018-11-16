package com.example.hamid.mvvm.ui.mainactivity2;

import android.util.Log;
import android.view.View;

import com.example.hamid.mvvm.R;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

public class MainActivity2ViewModel extends ViewModel {
    private static final String TAG = "MainActivity2ViewModel";

    private  MutableLiveData<String> firstName;
    private  MutableLiveData<String> lastName;
    private  MutableLiveData<String> edittext;

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
        edittext.postValue(text);
        firstName.postValue(text);
        lastName.postValue(text);
        Navigation.findNavController(view).navigate(R.id.mainActivity2Fragment);

    }


    public void onUsernameTextChanged(CharSequence s) {
        Log.d("tag", "onTextChanged " + s);
    }

}
