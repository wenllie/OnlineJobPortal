package com.example.onlinejobportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText loginEmail, loginPassword;
    TextView register;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature ( Window.FEATURE_NO_TITLE );
        getSupportActionBar ().hide ();
        setContentView(R.layout.activity_main);

        loginEmail = findViewById(R.id.etloginEmail);
        loginPassword = findViewById(R.id.etloginPass);
        register = findViewById(R.id.tvRegister);
        login = findViewById(R.id.btnSignin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, Homepage.class );
                startActivity ( intent );
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, Register.class );
                startActivity ( intent );
            }
        });

    }
}