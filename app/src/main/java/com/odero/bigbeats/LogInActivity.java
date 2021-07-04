package com.odero.bigbeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;

public class LogInActivity extends AppCompatActivity {
//    @BindView(R.id.goToSeeMusicFromLogIn) Button seeMusic;
//    @BindView(R.id.nameInputLoginView) EditText mUserName;
    private Button seeMusic;
    private EditText mUserName,mUserPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        mUserName = findViewById(R.id.nameInputLoginView);
        mUserPassword = findViewById(R.id.passwordInputLoginView);
        seeMusic = findViewById(R.id.goToSeeMusicFromLogIn);
        seeMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( mUserName.getText().toString().length() == 0 ){
                    mUserName.setError( "Name is required!" );
                }else if(mUserPassword.getText().toString().length() == 0){
                    mUserPassword.setError( "Password is required!" );
                }else {
                    String userName = mUserName.getText().toString();
                    Intent intent = new Intent(LogInActivity.this, MusicActivity.class);
                    intent.putExtra("userName", userName);
                    startActivity(intent);
                }
            }
        });
    }
}