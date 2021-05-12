package com.example.appblog.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.appblog.Model.PostModel;
import com.example.appblog.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyHolder> {
    Context context;
    List<PostModel> postModelList;

    public PostAdapter(Context context, List<PostModel> postModelList) {
        this.context = context;
        this.postModelList = postModelList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_post,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.MyHolder holder, int position) {
        String title = postModelList.get(position).getpTitle();
        String description = postModelList.get(position).getpDescription();
        String image = postModelList.get(position).getpImage();

        holder.postTitle.setText(title);
        holder.postDesc.setText(description);

        Glide.with(context).load(image).into(holder.postImage);
    }

    @Override
    public int getItemCount() {
        return postModelList.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        ImageView postImage;
        TextView postTitle, postDesc;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            postImage = itemView.findViewById(R.id.postImg);
            postTitle = itemView.findViewById(R.id.postTitle);
            postDesc = itemView.findViewById(R.id.postDesc);
        }
    }
}
