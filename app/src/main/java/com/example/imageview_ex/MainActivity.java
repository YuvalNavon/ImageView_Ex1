package com.example.imageview_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num;
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_java = (Button) findViewById(R.id.btn);
        ImageView pic = (ImageView) findViewById(R.id.one_image);
        pic.setImageResource(android.R.color.transparent);
        btn_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = rand.nextInt(3);
                if (num==0){
                   pic.setImageResource(R.drawable.one);
                   btn_java.setText("Picture is: " + (num+1));
                }
                else if(num==1){
                    pic.setImageResource(R.drawable.two);
                    btn_java.setText("Picture is: " + (num+1));
                }
                else{
                    pic.setImageResource((R.drawable.three));
                    btn_java.setText("Picture is: " + (num+1));
                }
            }
        });



    }
}