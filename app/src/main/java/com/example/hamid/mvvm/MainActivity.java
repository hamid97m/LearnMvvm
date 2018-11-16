package com.example.hamid.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

import com.example.hamid.mvvm.ui.mainactivity2.MainActivity2Fragment;
import com.example.hamid.mvvm.ui.mainactivity2.MainActivity2ViewModel;

import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    private MainActivity2ViewModel mViewModel;
    private EditText editText;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.framelayout, MainActivity2Fragment.newInstance())
                    .commitNow();
        }





    }




    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(this, R.id.activity_nav).navigateUp();
    }


}
