package com.example.timur.mytestproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button2);
       View.OnClickListener ocl = new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, Main2Activity.class);
               startActivity(intent);
           }
       };
       btn.setOnClickListener(ocl);
       Button btn2 = findViewById(R.id.button);
       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
             System.exit(0);
           }
       });
    }
}
