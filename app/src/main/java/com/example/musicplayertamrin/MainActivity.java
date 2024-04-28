package com.example.musicplayertamrin;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton playy,pause,stopp;
    MediaPlayer mediaPlayer;
    boolean isplaying=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        playy = findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        stopp = findViewById(R.id.sstop);

        mediaPlayer = MediaPlayer.create(this,R.raw.song);
        playy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isplaying){
                    mediaPlayer.start();
                    isplaying =true;
                }
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isplaying) {
                    mediaPlayer.pause();
                    isplaying = false;
                }
            }
        });

        stopp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                isplaying = false;
            }
        });
    }
}