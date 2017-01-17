package me.leofontes.youtubeplayer;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;

public class YoutubeActivity extends YouTubeBaseActivity
        implements YouTubePlayer.OnInitializedListener {
    static final String GOOGLE_API_KEY = "AIzaSyBSHZcasiRV4MdHBMWUW59PsQDxqazuwRk";
    static final String YOUTUBE_VIDEO_ID = "J_AH4urZZG0";
    static final String YOUTUBE_PLAYLIST = "RDJ_AH4urZZG0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider,
            YouTubePlayer youTubePlayer, boolean b) {

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider,
            YouTubeInitializationResult youTubeInitializationResult) {

    }
}
