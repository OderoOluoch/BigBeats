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
//    @BindView(R.id.goToSeeMusciFRomRegister) Button seeMusic;
//    @BindView(R.id.nameInputRegisterView) EditText mRegisterUserName;


    private Button seeMusic;
    private EditText mRegisterUserName,mRegisterUserEmail, mRegisterUserPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mRegisterUserName = findViewById(R.id.nameInputRegisterView);
        mRegisterUserEmail = findViewById(R.id.emailInputRegisterView);
        mRegisterUserPassword = findViewById(R.id.passwordInputRegisterView);
        seeMusic = findViewById(R.id.goToSeeMusciFRomRegister);
        seeMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( mRegisterUserName.getText().toString().length() == 0 ){
                    mRegisterUserName.setError( "Name is required!" );
                }else if(mRegisterUserEmail.getText().toString().length() == 0){
                    mRegisterUserEmail.setError( "Email is required!" );
                }else if(mRegisterUserPassword.getText().toString().length() == 0){
                    mRegisterUserPassword.setError( "Password is required!" );
                }else {
                    String userName = mRegisterUserName.getText().toString();
                    Intent intent = new Intent(RegisterActivity.this, MusicActivity.class);
                    intent.putExtra("userName", userName);
                    startActivity(intent);
                }
            }
        });
    }
}