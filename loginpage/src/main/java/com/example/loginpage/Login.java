package com.example.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText User;
    private EditText Pass;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       User = (EditText)findViewById(R.id.id.TextUser);
       Pass = (EditText)findViewById(R.id.TextPass);
       Login = (Button)findViewById(R.id.LoginB);
    }





}
