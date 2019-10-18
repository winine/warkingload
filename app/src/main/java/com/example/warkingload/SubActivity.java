package com.example.warkingload;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class SubActivity extends AppCompatActivity implements OnMapReadyCallback {

    Button btswim, btcats, btfood, btroad, btanyway, btplay,  bthome, btcamera;

    private FragmentManager fragmentManager;
    private MapFragment mapFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        fragmentManager = getFragmentManager();
        mapFragment = (MapFragment)fragmentManager.findFragmentById(R.id.anymap);
        mapFragment.getMapAsync(this);

        btswim = (Button) findViewById(R.id.bt_swim);
        btcats = (Button)findViewById(R.id.bt_cats);
        btfood = (Button)findViewById(R.id.bt_food);
        btroad = (Button)findViewById(R.id.bt_road);
        btanyway = (Button)findViewById(R.id.bt_anyway);
        btplay = (Button)findViewById(R.id.bt_play);
        bthome = (Button)findViewById(R.id.bt_home);
        btcamera = (Button)findViewById(R.id.bt_camera);

        btswim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment1 fragment1 = new Fragment1();
                transaction.replace(R.id.frame, fragment1);
                transaction.commit();

            }
        });

        btcats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment2 fragment2 = new Fragment2();
                transaction.replace(R.id.frame, fragment2);
                transaction.commit();

            }
        });

        btfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment3 fragment3 = new Fragment3();
                transaction.replace(R.id.frame, fragment3);
                transaction.commit();

            }
        });

        btroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment4 fragment4 = new Fragment4();
                transaction.replace(R.id.frame, fragment4);
                transaction.commit();

            }
        });

        btplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment5 fragment5 = new Fragment5();
                transaction.replace(R.id.frame, fragment5);
                transaction.commit();

            }
        });
        bthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng location = new LatLng(37.002063, 127.083036); //세교초등학교
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("세교초등학교");
        markerOptions.snippet("학교");
        markerOptions.position(location);
        googleMap.addMarker(markerOptions);


    }


}
