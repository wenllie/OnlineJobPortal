package com.example.onlinejobportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Register extends AppCompatActivity {

    TextInputEditText regFirstname, regMiddlename, regLastname, regSuffix, regAddress, regCity, regZipcode, regEmail, regPassword, regConfirmPass;
    TextView signin;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature ( Window.FEATURE_NO_TITLE );
        getSupportActionBar ().hide ();
        setContentView(R.layout.activity_register);

        regFirstname = findViewById(R.id.etFirstName);
        regMiddlename = findViewById(R.id.etMiddlename);
        regLastname = findViewById(R.id.etLastname);
        regSuffix = findViewById(R.id.etSuffix);
        regAddress = findViewById(R.id.etAddress);
        regCity = findViewById(R.id.etCity);
        regZipcode = findViewById(R.id.etZipCode);
        regEmail = findViewById(R.id.etRegEmail);
        regPassword = findViewById(R.id.etRegPass);
        regConfirmPass = findViewById(R.id.etRegConfirmPass);
        signin = findViewById(R.id.tvLoginHere);
        register = findViewById(R.id.btnRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Register.this, Homepage.class );
                startActivity ( intent );
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Register.this, MainActivity.class );
                startActivity ( intent );
            }
        });

    }
}