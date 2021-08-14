package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        Button PlayButton = (Button) findViewById(R.id.play_button);
            PlayButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  mediaPlayer.start();
                // Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            });

        Button PauseButton = (Button) findViewById(R.id.pause_button);
            PauseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
//                    Toast.makeText(MainActivity.this,"Pause", Toast.LENGTH_SHORT).show();
                }
            });

    }

}