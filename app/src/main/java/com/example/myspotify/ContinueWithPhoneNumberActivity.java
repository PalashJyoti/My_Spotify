package com.example.myspotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ContinueWithPhoneNumberActivity extends AppCompatActivity {

    Button btn, countryBtn;
    ImageView continueWithPhoneBack;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_with_phone_number);

        btn = findViewById(R.id.button2);
        countryBtn = findViewById(R.id.countryBtn);
        continueWithPhoneBack = findViewById(R.id.continueWithPhoneBack);
        editText = findViewById(R.id.editTextPhone);

        continueWithPhoneBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        countryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CountryActivity.class));
                finish();
            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!editText.getText().toString().trim().isEmpty()) {
                    btn.setEnabled(true);
                    btn.setBackgroundTintList(getResources().getColorStateList(R.color.white));
                    btn.setTextColor(Color.BLACK);
                } else {
                    btn.setEnabled(false);
                    btn.setBackgroundTintList(getResources().getColorStateList(R.color.grey));
                    btn.setTextColor(getResources().getColor(R.color.dull));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}