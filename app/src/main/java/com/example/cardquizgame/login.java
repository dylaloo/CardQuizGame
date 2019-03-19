package com.example.cardquizgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    EditText UsernameText;
    EditText PasswordText;
    Button LoginButton;
    Button RegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        UsernameText = (EditText)findViewById(R.id.username);
        PasswordText = (EditText)findViewById(R.id.password);
        LoginButton = (Button)findViewById(R.id.login);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(UsernameText.length() < 3 || UsernameText.length() >30) {
                    UsernameText.setError("Invalid input.");
                }else if(PasswordText.length() < 3 || PasswordText.length() >15) {
                    PasswordText.setError("Invalid input.");
                }else {
                    Intent ExplainationIntent = new Intent(login.this, Explaination.class);
                    startActivity(ExplainationIntent);
                }
            }
        });



        RegisterButton = (Button)findViewById(R.id.register);
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(login.this, RegisterActivity.class) ;
                startActivity(registerIntent);
            }
        });
    }
}
