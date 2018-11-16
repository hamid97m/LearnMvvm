package com.example.hamid.mvvm.ui.mainactivity2;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamid.mvvm.R;
import com.example.hamid.mvvm.databinding.MainActivity2FragmentBinding;

import java.util.Objects;

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
        binding.setViewmodel(mViewModel);

        return binding.getRoot();

    }


}
