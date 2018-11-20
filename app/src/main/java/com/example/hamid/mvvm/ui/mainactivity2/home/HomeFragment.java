package com.example.hamid.mvvm.ui.mainactivity2.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamid.mvvm.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeFragment extends Fragment {

    private HomeFragmentViewModel mViewModel;
    private static final String TAG = "HomeFragment";
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private PostAdapter mAdapter;


    public static HomeFragment newInstance() {
        return new HomeFragment();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = ViewModelProviders.of(this).get(HomeFragmentViewModel.class);

        View view = inflater.inflate(R.layout.home_fragment, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyceler);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new PostAdapter(mViewModel.getPosts().getValue());
        mRecyclerView.setAdapter(mAdapter);


        mViewModel.getPosts().observe(this, new Observer<ArrayList<PostModel>>() {
            @Override
            public void onChanged(ArrayList<PostModel> postModels) {
                Log.i(TAG, "onChanged: ");
                mAdapter.setPosts(postModels);
            }
        });


        return view;

    }


}
