package com.example.myspotify;

import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SignUpFreeEmailFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    EditText et;
    Button nextBtn;
    ConstraintLayout frag;

    private String mParam1;
    private String mParam2;

    public SignUpFreeEmailFragment() {
    }

    public static SignUpFreeEmailFragment newInstance(String param1, String param2) {
        SignUpFreeEmailFragment fragment = new SignUpFreeEmailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up_free_email, container, false);
        et = view.findViewById(R.id.editTextTextEmail);
        nextBtn = view.findViewById(R.id.signUpFreeEmailBtn);
        frag = view.findViewById(R.id.fragmentContainerView);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateEmail()){
//                    SignUpFreePasswordFragment f2=new SignUpFreePasswordFragment();
//                    FragmentTransaction transaction= getFragmentManager().beginTransaction();
//                    transaction.replace(R.id.fragmentContainerView,f2);
//                    transaction.commit();

                    SignUpFreeActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainerView,new SignUpFreePasswordFragment(),null).addToBackStack(null).commit();
                }

            }
        });

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!et.getText().toString().trim().isEmpty()) {
                    nextBtn.setEnabled(true);
                    nextBtn.setBackgroundTintList(getResources().getColorStateList(R.color.white));
                    nextBtn.setTextColor(Color.BLACK);
                } else {
                    nextBtn.setEnabled(false);
                    nextBtn.setBackgroundTintList(getResources().getColorStateList(R.color.grey));
                    nextBtn.setTextColor(getResources().getColor(R.color.dull));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return view;
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