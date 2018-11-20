package com.example.hamid.mvvm.ui.mainactivity2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamid.mvvm.databinding.MainActivity2FragmentBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class HomeFragment extends Fragment {

    private HomeFragmentViewModel mViewModel;
    private static final String TAG = "HomeFragment";

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        MainActivity2FragmentBinding binding = MainActivity2FragmentBinding.inflate(inflater, container, false);

        binding.setLifecycleOwner(this);
        mViewModel = ViewModelProviders.of(this).get(HomeFragmentViewModel.class);
        binding.setViewmodel(mViewModel);


        return binding.getRoot();

    }


}
