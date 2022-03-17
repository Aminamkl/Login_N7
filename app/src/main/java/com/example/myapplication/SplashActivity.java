package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    View first, second, third, fourth, fifth, sixth;
    TextView mc, tagLine;

    //Animations
    Animation topAnimation, bottomAnimation, middleAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Toast.makeText(SplashActivity.this, "onCreate()", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_splash);

        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation=AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        first= findViewById(R.id.first_line);
        second= findViewById(R.id.second_line);
        third= findViewById(R.id.third_line);
        fourth= findViewById(R.id.fourth_line);
        fifth= findViewById(R.id.fifth_line);
        sixth= findViewById(R.id.sixth_line);

        mc= findViewById(R.id.mc);
        tagLine= findViewById(R.id.tagLine);

        first.setAnimation(topAnimation);
        second.setAnimation(topAnimation);
        third.setAnimation(topAnimation);
        fourth.setAnimation(topAnimation);
        fifth.setAnimation(topAnimation);
        sixth.setAnimation(topAnimation);

        mc.setAnimation(middleAnimation);
        tagLine.setAnimation(bottomAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(i);
                finish();
            }
        },1800);

    }
    protected void onStart() {
        super.onStart();
        Toast.makeText(SplashActivity.this, "onStart()", Toast.LENGTH_LONG).show();
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(SplashActivity.this, "onRestart()", Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(SplashActivity.this, "onResume()", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(SplashActivity.this, "onPause()", Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(SplashActivity.this, "onStop()", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(SplashActivity.this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

}
