package com.example.saurav.bundlepassing;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BundlePassing extends AppCompatActivity {

    Button login;
    EditText username, pass;
    TextView ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_passing);

        login = (Button) findViewById(R.id.login);
        username = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.pass);
        ref = (TextView) findViewById(R.id.ref);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),username.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",username.getText().toString());
                bundle.putString("password",pass.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
