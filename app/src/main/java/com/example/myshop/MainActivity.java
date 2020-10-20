package com.example.myshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mainLoginButton, joinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLoginButton = (Button) findViewById(R.id.main_login_btn);
        mainLoginButton = (Button) findViewById(R.id.main_register_btn);
    }
}