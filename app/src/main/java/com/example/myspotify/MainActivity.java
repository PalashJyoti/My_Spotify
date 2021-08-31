package com.example.myspotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button signUpFreeBtn, continueWithPhoneNumberBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUpFreeBtn = findViewById(R.id.signUpFreeBtn);
        continueWithPhoneNumberBtn = findViewById(R.id.continueWithPhoneNumberBtn);

        signUpFreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignUpFreeActivity.class));
            }
        });

        continueWithPhoneNumberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ContinueWithPhoneNumberActivity.class));
            }
        });
    }
}