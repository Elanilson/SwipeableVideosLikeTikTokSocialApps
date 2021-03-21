package com.apkdoandroid.swipeablevideosliketiktoksocialapps.adapter;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apkdoandroid.swipeablevideosliketiktoksocialapps.R;
import com.apkdoandroid.swipeablevideosliketiktoksocialapps.model.VideoItem;

import java.util.List;

public class AdapterVideo  extends RecyclerView.Adapter<AdapterVideo.MyViewHolder>{

    List<VideoItem> videoItems;

    public AdapterVideo(List<VideoItem> videoItems) {
        this.videoItems = videoItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_container_video,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setVideoData(videoItems.get(position));

    }

    @Override
    public int getItemCount() {
        return videoItems.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        VideoView videoView;
        TextView textViewTitulo, textViewDescricao;
        ProgressBar progressBar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            videoView = itemView.findViewById(R.id.videoView);
            textViewTitulo = itemView.findViewById(R.id.textViewTitulo);
            textViewDescricao = itemView.findViewById(R.id.textViewDescricao);
            progressBar = itemView.findViewById(R.id.progressBarVideo);

        }
        void setVideoData(VideoItem videoItem){
            textViewTitulo.setText(videoItem.getVideoTitulo());
            textViewDescricao.setText(videoItem.getVideoDescricao());
            videoView.setVideoPath(videoItem.getVideoUrl());
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    progressBar.setVisibility(View.GONE);
                    mp.start();
                    float videoRatio = mp.getVideoWidth() / (float) mp.getVideoHeight();
                    float screenRatio = videoView.getWidth() / (float) videoView.getHeight();
                    float scale = videoRatio / screenRatio;
                    if(scale >= 1f){
                        videoView.setScaleX(scale);
                    }else{
                        videoView.setScaleY(1f / scale);
                    }
                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.start();
                }
            });

        }
    }
}
