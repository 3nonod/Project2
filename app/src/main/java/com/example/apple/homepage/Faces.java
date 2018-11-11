package com.example.apple.homepage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Faces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faces);


        final MediaPlayer AngreyMediaPlayer = MediaPlayer.create(this, R.raw.angry);
        final ImageView Anger = (ImageView) this.findViewById(R.id.angary);

        final MediaPlayer HappyMediaPlayer = MediaPlayer.create(this, R.raw.happy);
        final ImageView Happy = (ImageView) this.findViewById(R.id.happy);

        final MediaPlayer HungryMediaPlayer = MediaPlayer.create(this, R.raw.hungry);
        final ImageView Hungry = (ImageView) this.findViewById(R.id.hungry);

        final MediaPlayer SadMediaPlayer = MediaPlayer.create(this, R.raw.sad);
        final ImageView Sad = (ImageView) this.findViewById(R.id.sad);


        Anger.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View V) {
            AngreyMediaPlayer.start();
        }
    });
        Happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                HappyMediaPlayer.start();
            }
        });
        Hungry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                HungryMediaPlayer.start();
            }
        });
        Sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                SadMediaPlayer.start();
            }
        });
}}
