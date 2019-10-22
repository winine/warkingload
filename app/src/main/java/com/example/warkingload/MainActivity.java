package com.example.warkingload;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Button btswim, btcats, btfood, btroad, btanyway, btplay, bthome, btcamera;
    ImageButton imgswim, imgcats, imgfood, imgroad, imgplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button 변수와 매칭
        btswim = (Button) findViewById(R.id.bt_swim);
        btcats = (Button) findViewById(R.id.bt_cats);
        btfood = (Button) findViewById(R.id.bt_food);
        btroad = (Button) findViewById(R.id.bt_road);
        btanyway = (Button) findViewById(R.id.bt_anyway);
        btplay = (Button) findViewById(R.id.bt_play);
        bthome = (Button) findViewById(R.id.bt_home);
        btcamera = (Button) findViewById(R.id.bt_camera);
        imgswim = (ImageButton) findViewById(R.id.ib_swim);
        imgcats = (ImageButton) findViewById(R. id.ib_cats);
        imgfood = (ImageButton) findViewById(R. id.ib_food);
        imgroad = (ImageButton) findViewById(R.id.ib_road);
        imgplay = (ImageButton) findViewById(R.id.ib_play);

         //각 버튼 클릭시 액션
        imgswim.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fragment1.class);
                startActivity(intent);
            }
        });

        imgcats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fragment2.class);
                startActivity(intent);
            }
        });

        imgfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fragment3.class);
                startActivity(intent);
            }
        });

        imgroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fragment4.class);
                startActivity(intent);
            }
        });

        imgplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fragment5.class);
                startActivity(intent);
            }
        });

        btanyway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        btswim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fragment1.class);
                startActivity(intent);
            }
        });
        btcats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fragment2.class);
                startActivity(intent);
            }
        });

        btfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fragment3.class);
                startActivity(intent);
            }
        });

        btroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fragment4.class);
                startActivity(intent);
            }
        });

        btplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fragment5.class);
                startActivity(intent);
            }
        });

        bthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }

}
