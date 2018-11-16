package com.example.hamid.mvvm;

import android.util.Log;
import android.view.View;

public class User {
    private static final String TAG = "User";
    private final String firstName;
    private final String lastName;
    private final String matn;
    public User(String firstName, String lastName, String matn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matn = matn;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public String getEdittext() {
        return this.matn;
    }


        public void onSaveClick(View view, String task) {
            Log.i(TAG, "Action" + task);
        }

}