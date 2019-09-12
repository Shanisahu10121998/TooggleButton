package com.example.toogglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageSwitcher;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ImageSwitcher imageSwitcher;
ToggleButton toggleButton1,toggleButton2;
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton1=findViewById(R.id.toggleButton);
        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.music);
        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    mediaPlayer.start();
                }else {
                    mediaPlayer.pause();
                }
            }
        });
    }
}
