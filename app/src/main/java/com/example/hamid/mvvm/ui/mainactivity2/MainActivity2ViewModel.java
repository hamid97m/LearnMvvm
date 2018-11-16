package com.example.hamid.mvvm.ui.mainactivity2;

import android.util.Log;
import android.view.View;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivity2ViewModel extends ViewModel {
    private static final String TAG = "MainActivity2ViewModel";

    private final MutableLiveData<String> firstName=new MutableLiveData<>();
    private final MutableLiveData<String> lastName=new MutableLiveData<>();
    private final MutableLiveData<String> edittext=new MutableLiveData<>();

    public MutableLiveData<String> getFirstName() {
        return this.firstName;
    }
    public MutableLiveData<String> getLastName() {
        return this.lastName;
    }



    public MutableLiveData<String> getEdittext() {
        return this.edittext;
    }


    public void onSaveClick(View view, String task) {
        Log.i(TAG, "onSaveClick: "+task);
        lastName.setValue("sag");
    }


}
