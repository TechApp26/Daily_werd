package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;




public class Warad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warad);


        Button Bt_waradF  = findViewById(R.id.button);
        Bt_waradF .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_waradF=new Intent(getApplicationContext(),waradfriday .class);
                startActivity(Bt_waradF);
                finish();
            }
        });
        Button Bt_waradSat  = findViewById(R.id.button2);
        Bt_waradSat .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_waradSat=new Intent(getApplicationContext(),waradsaturday .class);
                startActivity(Bt_waradSat);
                finish();
            }
        });
        Button Bt_waradsun  = findViewById(R.id.button3);
        Bt_waradsun .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_waradsun=new Intent(getApplicationContext(),waradsunday .class);
                startActivity(Bt_waradsun);
                finish();
            }
        });
        Button Bt_waradmon  = findViewById(R.id.button4);
        Bt_waradmon  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_waradmon =new Intent(getApplicationContext(),waradmonday .class);
                startActivity(Bt_waradmon );
                finish();
            }
        });
        Button Bt_waradtues  = findViewById(R.id.button5);
        Bt_waradtues .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_waradtues=new Intent(getApplicationContext(),waradtuesday .class);
                startActivity(Bt_waradtues);
                finish();
            }
        });
        Button Bt_waradwed  = findViewById(R.id.button6);
        Bt_waradwed  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_waradwed =new Intent(getApplicationContext(),waradwednesday .class);
                startActivity(Bt_waradwed );
                finish();
            }
        });
        Button Bt_waradth = findViewById(R.id.button7);
        Bt_waradth .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_Bt_waradth=new Intent(getApplicationContext(),waradthursday .class);
                startActivity(Bt_Bt_waradth);
                finish();
            }
        });
    }

}
