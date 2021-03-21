package com.apkdoandroid.swipeablevideosliketiktoksocialapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Window;

import com.apkdoandroid.swipeablevideosliketiktoksocialapps.adapter.AdapterVideo;
import com.apkdoandroid.swipeablevideosliketiktoksocialapps.model.VideoItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ViewPager2 viewPagerVideos = findViewById(R.id.viewPager2Videos);
        List<VideoItem>  videoItems = new ArrayList<>();
        VideoItem videoItem = new VideoItem();
        videoItem.setVideoUrl("https://firebasestorage.googleapis.com/v0/b/bloco-de-notas-black.appspot.com/o/spider_slack%20-%206931866108555201797.mp4?alt=media&token=ab3ee063-9003-47e2-abd4-a09bb54b1a9a");
        videoItem.setVideoTitulo("Swipeable Videos Like TikTok & Social Apps");
        videoItem.setVideoDescricao("In this tutorial, we will create a swipeable video facility using ViewPager2. ViewPager2 supports both vertical and horizontal swipes.");
        videoItems.add(videoItem);
        VideoItem videoItemParty = new VideoItem();
        videoItemParty.setVideoUrl("https://firebasestorage.googleapis.com/v0/b/bloco-de-notas-black.appspot.com/o/hey%20everyone.mp4?alt=media&token=a48cfa9f-05ac-4978-ab53-fd1c4345a1e9");
        videoItemParty.setVideoTitulo("Swipeable Videos Like TikTok & Social Apps");
        videoItemParty.setVideoDescricao("In this tutorial, we will create a swipeable video facility using ViewPager2. ViewPager2 supports both vertical and horizontal swipes.");
        videoItems.add(videoItemParty);
        VideoItem videoItemParty3 = new VideoItem();
        videoItemParty3.setVideoUrl("https://firebasestorage.googleapis.com/v0/b/bloco-de-notas-black.appspot.com/o/el.go33%20-%206923476624721644806.mp4?alt=media&token=4cb88bd5-659c-4f9b-97da-7dadf15d2fe1");
        videoItemParty3.setVideoTitulo("coreo by dancers eu ");
        videoItemParty3.setVideoDescricao("In this tutorial, we will create a swipeable video facility using ViewPager2. ViewPager2 supports both vertical and horizontal swipes.");
        videoItems.add(videoItemParty3);
        VideoItem videoItemParty4 = new VideoItem();
        videoItemParty4.setVideoUrl("https://firebasestorage.googleapis.com/v0/b/bloco-de-notas-black.appspot.com/o/Surpreendeu%20a%20todos%20%20Querem%20mais%20Meta%20p%20outro-%20500k%20de%20like.mp4?alt=media&token=e38ad50b-a165-4f9c-99a2-cfe1e48e9552");
        videoItemParty4.setVideoTitulo("Surpreendeu a todos Querem mais Meta p outro ");
        videoItemParty4.setVideoDescricao("In this tutorial, we will create a swipeable video facility using ViewPager2. ViewPager2 supports both vertical and horizontal swipes.");
        videoItems.add(videoItemParty4);
        VideoItem videoItemParty5 = new VideoItem();
        videoItemParty5.setVideoUrl("https://firebasestorage.googleapis.com/v0/b/bloco-de-notas-black.appspot.com/o/Esse%20calor%20d%C3%A1%20muita%20sede%20mesmo.mp4?alt=media&token=9221812e-5ae4-4c09-83a1-7662a35f14d1");
        videoItemParty5.setVideoTitulo("Surpreendeu a todos Querem mais Meta p outro ");
        videoItemParty5.setVideoDescricao("In this tutorial, we will create a swipeable video facility using ViewPager2. ViewPager2 supports both vertical and horizontal swipes.");
        videoItems.add(videoItemParty5);

        viewPagerVideos.setAdapter(new AdapterVideo(videoItems));
    }
}