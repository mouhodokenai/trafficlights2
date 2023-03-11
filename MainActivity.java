package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.app.ActivityManager;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        ImageView Rview = findViewById(R.id.imageView1);
        ImageView Yview = findViewById(R.id.imageView2);
        ImageView Gview = findViewById(R.id.imageView3);
        View relativeLayout = findViewById(R.id.constraintLayout);
        switch (view.getId()) {
            case R.id.buttonred:
                Rview.setVisibility(View.VISIBLE);
                Gview.setVisibility(View.INVISIBLE);
                Yview.setVisibility(View.INVISIBLE);
                relativeLayout.setBackgroundResource(R.color.redColor);
                Toast toast = Toast.makeText(this, "Стоять!",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.buttonyellow:
                Yview.setVisibility(View.VISIBLE);
                Gview.setVisibility(View.INVISIBLE);
                Rview.setVisibility(View.INVISIBLE);
                relativeLayout.setBackgroundResource(R.color.yellowColor);
                Toast toast1 = Toast.makeText(this, "Приготовиться!",Toast.LENGTH_SHORT);
                toast1.show();
                break;
            case R.id.buttongreen:
                Gview.setVisibility(View.VISIBLE);
                Yview.setVisibility(View.INVISIBLE);
                Rview.setVisibility(View.INVISIBLE);
                relativeLayout.setBackgroundResource(R.color.greenColor);
                Toast toast2 = Toast.makeText(this, "Идти!",Toast.LENGTH_SHORT);
                toast2.show();
                break;
        }


    }
}
