package com.example.batterylife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnDec,btnInc;
    ImageView battery;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        btnDec=findViewById(R.id.buttonDec);
        btnDec.setOnClickListener(this);

        btnInc=findViewById(R.id.buttonInc);
        btnInc.setOnClickListener(this);

        battery=findViewById(R.id.battery);
        count=0;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonDec){
            if(count==0){count=0;}
            else{
                count=count-1;
                battery.setImageLevel(count);
            }
        }
        else if (v.getId()==R.id.buttonInc){
            if(count==6){count=6;}
            else{
                count=count+1;
                battery.setImageLevel(count);
            }
        }
    }
}
