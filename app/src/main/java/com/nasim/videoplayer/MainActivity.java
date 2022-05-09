package com.nasim.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button bsong1,bsong2,bsong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bsong1=findViewById(R.id.bsong1);
        bsong2=findViewById(R.id.bsong2);
        bsong3=findViewById(R.id.bsong3);

        bsong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,videoplayer.class);
                startActivity(myIntent);
            }
        });




    }
}