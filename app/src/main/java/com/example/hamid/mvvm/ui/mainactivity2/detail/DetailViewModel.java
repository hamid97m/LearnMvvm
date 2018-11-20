package com.example.hamid.mvvm.ui.mainactivity2.detail;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.hamid.mvvm.R;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

public class DetailViewModel extends ViewModel {
    private MutableLiveData<String> firstName;
    private MutableLiveData<String> lastName;
    private MutableLiveData<String> edittext;
    private static final String TAG = "DetailViewModel";

    public MutableLiveData<String> getFirstName() {
        if (firstName == null) {
            firstName = new MutableLiveData<>();
        }
        return this.firstName;
    }


    public MutableLiveData<String> getLastName() {
        if (lastName == null) {
            lastName = new MutableLiveData<>();
        }
        return this.lastName;
    }


    public MutableLiveData<String> getEdittext() {
        if (edittext == null) {
            edittext = new MutableLiveData<>();
        }
        return this.edittext;
    }


    public void onSaveClick(View view, String text) {
        Log.i(TAG, "onSaveClick: " + text);
        edittext.setValue(text);
        firstName.setValue(text);
        lastName.setValue(text);
        Bundle bundle = new Bundle();
        bundle.putString("name", edittext.getValue());
        Navigation.findNavController(view).navigate(R.id.action_detailFragment_self, bundle);

    }

}
