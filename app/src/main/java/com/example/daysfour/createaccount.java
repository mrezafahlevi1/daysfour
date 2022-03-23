package com.example.daysfour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class createaccount extends AppCompatActivity {
    private Button btn_back;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login);

        btn_back = (Button) findViewById(R.id.btn_login);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlogin();
            }
        });
    }
    public void openlogin(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}