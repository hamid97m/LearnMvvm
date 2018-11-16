package com.example.hamid.mvvm.ui.mainactivity2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamid.mvvm.databinding.MainActivity2FragmentBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity2Fragment extends Fragment {

    private MainActivity2ViewModel mViewModel;
    private static final String TAG = "MainActivity2Fragment";

    public static MainActivity2Fragment newInstance() {
        return new MainActivity2Fragment();
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        MainActivity2FragmentBinding binding = MainActivity2FragmentBinding.inflate(inflater, container, false);

        binding.setLifecycleOwner(this);
        mViewModel = ViewModelProviders.of(this).get(MainActivity2ViewModel.class);
        Log.i(TAG, "onCreateView: "+mViewModel.getEdittext().getValue()+"   "+mViewModel.getLastName().getValue());
        binding.setViewmodel(mViewModel);


        return binding.getRoot();

    }


}
