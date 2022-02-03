package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        account=(Button) findViewById(R.id.btn_submit);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(log);
                Toast.makeText(MainActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}