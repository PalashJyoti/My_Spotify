package com.example.myspotify;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SignUpFreePasswordFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    EditText et;
    Button nextBtn;
    ConstraintLayout frag;

    private String mParam1;
    private String mParam2;

    public SignUpFreePasswordFragment() {
    }

    public static SignUpFreePasswordFragment newInstance(String param1, String param2) {
        SignUpFreePasswordFragment fragment = new SignUpFreePasswordFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_sign_up_free_password, container, false);
        return view;
    }
}