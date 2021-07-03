package com.odero.bigbeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {
    private Button seeMusic;
    private EditText mUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        mUserName = findViewById(R.id.nameInputLoginView);
        seeMusic = findViewById(R.id.goToSeeMusicFromLogIn);
        seeMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = mUserName.getText().toString();
                Intent intent = new Intent(LogInActivity.this, MusicActivity.class);
                intent.putExtra("userName", userName);
                startActivity(intent);
            }
        });
    }
}