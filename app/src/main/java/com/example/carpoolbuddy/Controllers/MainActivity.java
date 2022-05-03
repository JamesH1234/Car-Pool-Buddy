package com.example.carpoolbuddy.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.carpoolbuddy.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toLogInActivity(View view) {
        Intent logInActivity = new Intent(getBaseContext(), LogInActivity.class);
        startActivity(logInActivity);
    }

    public void toSignUpActivity(View view) {
        Intent signUpActivity = new Intent(getBaseContext(), SignUpActivity.class);
        startActivity(signUpActivity);
    }
}

