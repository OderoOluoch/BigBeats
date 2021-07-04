package com.odero.bigbeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;

public class RegisterActivity extends AppCompatActivity {

    //Using ButterKnife to bind views
    @BindView(R.id.goToSeeMusciFRomRegister) Button seeMusic;
    @BindView(R.id.nameInputRegisterView) EditText mRegisterUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        seeMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = mRegisterUserName.getText().toString();
                Intent intent = new Intent(RegisterActivity.this, MusicActivity.class);
                intent.putExtra("userName", userName);
                startActivity(intent);
            }
        });
    }


}