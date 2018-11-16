package com.example.hamid.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

import com.example.hamid.mvvm.databinding.ActivityMainBinding;
import com.example.hamid.mvvm.ui.mainactivity2.MainActivity2ViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private MainActivity2ViewModel mViewModel;
    private static final String TAG = "MainActivitymvvm";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mViewModel = ViewModelProviders.of(this).get(MainActivity2ViewModel.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(mViewModel);
        binding.setLifecycleOwner(this);









        mViewModel.getLastName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.i(TAG, "onChanged: "+s);
                mViewModel.getEdittext().setValue("salam");

            }

        });


    }
}
