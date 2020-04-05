package com.example.comex.splash_login_signup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.comex.R;
import com.example.comex.home_screen.Home;

public class Log_in extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
    }

    public void final_login(View v){
        Intent i = new Intent(Log_in.this, Home.class);
        startActivity(i);
    }
}
