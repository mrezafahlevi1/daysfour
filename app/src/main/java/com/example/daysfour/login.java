package com.example.daysfour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    private Button btn_login;
    private Button btn_create;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login);

        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhome();
            }
        });

        btn_create = (Button) findViewById(R.id.btn_create);
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencreateaccount();
            }
        });
    }
    public void openhome(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
    public void opencreateaccount(){
        Intent intent = new Intent(this, createaccount.class);
        startActivity(intent);
    }
}
