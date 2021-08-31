package com.example.myspotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpFreeActivity extends AppCompatActivity {

    ImageView signUpFreeBack;
    EditText et;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_free);


        signUpFreeBack = findViewById(R.id.sigUpFreeBack);
        et = findViewById(R.id.editTextTextEmailAddress);
        nextBtn = findViewById(R.id.nextBtn);

        signUpFreeBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateEmail();
            }
        });
    }

    private boolean validateEmail() {
        String emailInput = et.getText().toString().trim();
        if (emailInput.isEmpty()) {
            et.setError("Field can't be empty.");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            et.setError("Please enter a valid email address.");
            return false;
        } else {
            et.setError(null);
            return true;
        }
    }
}