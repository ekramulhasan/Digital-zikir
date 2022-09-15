package com.ekramul.digitalzikir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView display;
    ImageView plus,minus,reset;
    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //full_screen

        display = findViewById(R.id.display);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        reset = findViewById(R.id.reset);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value++;
                display.setText(""+value);
            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (value>0){
                    value--;
                }

                display.setText(""+value);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=0;
                display.setText(""+value);
            }
        });


    }
}