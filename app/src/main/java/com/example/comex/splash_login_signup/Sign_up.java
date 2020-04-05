package com.example.comex.splash_login_signup;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.comex.R;

public class Sign_up extends AppCompatActivity {

    View decorView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
    }

    @Override
    protected void onStart() {
        super.onStart();
        decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public void cancel_signup(View v){
        Intent i = new Intent(Sign_up.this, Splash_Screen.class);
        startActivity(i);
    }

    public void locationinfopage(View v){
        Intent i = new Intent(Sign_up.this, Setup_Location.class);
        startActivity(i);
    }

}