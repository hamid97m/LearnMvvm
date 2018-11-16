package com.example.hamid.mvvm;

import android.os.Bundle;
import android.widget.EditText;

import com.example.hamid.mvvm.ui.mainactivity2.MainActivity2ViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity {


    private MainActivity2ViewModel mViewModel;
    private EditText editText;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }




    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(this, R.id.activity_nav).navigateUp();
    }


}
