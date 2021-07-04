 package com.odero.bigbeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;


 public class MainActivity extends AppCompatActivity {
    //To control how long the splash screen is displayed.
     private static int SPLASH_TIME_OUT = 5000;

     //Hooks variables.
     @BindView(R.id.first_line) View first;
     @BindView(R.id.second_line) View second;
     @BindView(R.id.third_line) View third;
     @BindView(R.id.fourth_line) View fourth;
     @BindView(R.id.fifth_line) View fifth;
     @BindView(R.id.sixth_line) View sixth;

     @BindView(R.id.tagLine) TextView tagLine;
     @BindView(R.id.textLogo) TextView logoText;



     //Animation variables
     Animation topAnimation,bottomAnimation,middleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        //Hooks
        first.setAnimation(topAnimation);
        second.setAnimation(topAnimation);
        third.setAnimation(topAnimation);
        fourth.setAnimation(topAnimation);
        fifth.setAnimation(topAnimation);
        sixth.setAnimation(topAnimation);

        logoText.setAnimation(middleAnimation);
        tagLine.setAnimation(bottomAnimation);

        //Handle moving from splash screen to welcome screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}