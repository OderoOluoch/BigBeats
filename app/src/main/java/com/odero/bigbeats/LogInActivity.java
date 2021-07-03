package com.odero.bigbeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity {
    Button seeMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        seeMusic = findViewById(R.id.goToSeeMusicFromLogIn);
        seeMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogInActivity.this, MusicActivity.class);
                startActivity(intent);
            }
        });
    }
}