package com.example.comex.splash_login_signup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.comex.R;
import com.example.comex.home_screen.Home;

public class Setup_Location extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
    }

    public void finished_signup(View v){
        Intent i = new Intent(Setup_Location.this, Home.class);
        startActivity(i);
    }

}
