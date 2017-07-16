package com.example.saurav.bundlepassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class username extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        TextView user = (TextView) findViewById(R.id.user);
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String username = bundle.getString("username");
        String pass = bundle.getString("password");
        if(pass.equals("12345")) {
            user.setText("Welcome to RefChQ" + " " + username);
            Toast.makeText(getApplicationContext(), username + " " + "Login Successfull", Toast.LENGTH_SHORT).show();
        }
        else {
            user.setText("Login Fail! Please try Again");
            Toast.makeText(getApplicationContext(), username + " " + "wrong password", Toast.LENGTH_SHORT).show();
        }
    }
}
