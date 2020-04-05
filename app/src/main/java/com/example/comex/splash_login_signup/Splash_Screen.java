package com.example.comex.splash_login_signup;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.example.comex.R;

public class Splash_Screen extends AppCompatActivity {

    View comex,decorView;
    Button signup,login;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
    }

    @Override
    protected void onStart() {
        super.onStart();
        decorView = getWindow().getDecorView();
        comex = findViewById(R.id.SplashComex);
        signup = findViewById(R.id.sign_up1);
        login = findViewById(R.id.initlogin);
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        // animate Splash Screen
        ObjectAnimator animation = ObjectAnimator.ofFloat(comex, "translationY", -750f);
        animation.setDuration(1500);
        animation.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                login.setVisibility(View.VISIBLE);
                signup.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        animation.start();




    }

    public void signup(View v){
        Intent i = new Intent(Splash_Screen.this, Sign_up.class);
        startActivity(i);
    }
    public void login(View v){
        Intent i = new Intent(Splash_Screen.this, Log_in.class);
        startActivity(i);
    }
}
