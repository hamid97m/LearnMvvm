package com.example.hamid.mvvm.ui.mainactivity2.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamid.mvvm.databinding.DetailFragmentBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;


public class DetailFragment extends Fragment {

    private DetailViewModel mViewModel;
    private static final String TAG = "DetailFragment";


    public static DetailFragment newInstance() {
        return new DetailFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        DetailFragmentBinding binding = DetailFragmentBinding.inflate(inflater, container, false);

        binding.setLifecycleOwner(this);
        mViewModel = ViewModelProviders.of(this).get(DetailViewModel.class);
        binding.setViewmodel(mViewModel);


        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(DetailViewModel.class);
        mViewModel.getEdittext().setValue(getArguments().getString("name"));
        // TODO: Use the ViewModel
    }

}

