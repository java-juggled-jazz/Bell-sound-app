package com.methylacetate.bellsoundapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import java.util.Random;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();
    int num;
    MediaPlayer mPlay1, mPlay2, mPlay3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlay1 = MediaPlayer.create(this,R.raw.bell1);
        mPlay2 = MediaPlayer.create(this,R.raw.bell2);
        mPlay3 = MediaPlayer.create(this,R.raw.bell3);

    }

    public void bell(View view) {
        num = rnd.nextInt(2) + 1;
        switch (num) {
            case 1: mPlay1.start();
                break;
            case 2: mPlay2.start();
                break;
            case 3: mPlay3.start();
                break;
        }
    }

    public void creditsClick(View view) {
        Snackbar.make(view, "By Kamil \"methylacetate\"", Snackbar.LENGTH_LONG)
                .show();
    }
}