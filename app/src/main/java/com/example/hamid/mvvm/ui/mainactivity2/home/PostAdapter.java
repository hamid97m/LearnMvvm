package com.example.hamid.mvvm.ui.mainactivity2.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hamid.mvvm.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {
    private ArrayList<PostModel> posts;

    PostAdapter(ArrayList<PostModel> posts) {
        this.posts = posts;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.content.setText(posts.get(position).getContent());
        holder.title.setText(posts.get(position).getTitle());
        holder.clcontainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("name", posts.get(position).getTitle());
                Navigation.findNavController(view).navigate(R.id.action_mainActivity2Fragment_to_detailFragment, bundle);

            }
        });

    }

    @Override
    public int getItemCount() {
        if (posts == null)
            return 0;
        return posts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, content;
        public ConstraintLayout clcontainer;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            content = (TextView) view.findViewById(R.id.content);
            clcontainer = (ConstraintLayout) view.findViewById(R.id.clcontainer);
        }
    }

    public void setPosts(ArrayList<PostModel> posts) {
        this.posts = posts;
        notifyDataSetChanged();
    }


}
