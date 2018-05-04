package com.adhestudio.carilokasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.adhestudio.carilokasi.Airport.AirportMaps;
import com.adhestudio.carilokasi.Atm.AtmMaps;
import com.adhestudio.carilokasi.Bank.BankMaps;
import com.adhestudio.carilokasi.Cafe.CafeMaps;
import com.adhestudio.carilokasi.CarWash.CarWashMaps;
import com.adhestudio.carilokasi.Hospital.HospitalMaps;
import com.adhestudio.carilokasi.Laundry.LaundryMaps;
import com.adhestudio.carilokasi.MapsMasjid.MapsMasjidActivity;
import com.adhestudio.carilokasi.Museum.MuseumMaps;
import com.adhestudio.carilokasi.Park.ParkMaps;
import com.adhestudio.carilokasi.Parking.ParkingMaps;
import com.adhestudio.carilokasi.ShopingMall.ShopingMaps;

public class MainActivity extends AppCompatActivity {

    Button mButtonMasjid, mButtonHospital, mButtonLaundry, mButtonCafe, mButtonAtm, mButtonBank, mButtonParking, mButtonCarwash, mButtonPark, mButtonMusemum, mButtonAirport,
            mButtonShoping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonMasjid = findViewById(R.id.btnmasjid);
        mButtonMasjid.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                 Intent intent = new Intent(MainActivity.this, MapsMasjidActivity.class);
                 startActivity(intent);
            }
        });

        mButtonHospital = findViewById(R.id.btnhospital);
        mButtonHospital.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, HospitalMaps.class);
                startActivity(intent);
            }
        });

        mButtonLaundry = findViewById(R.id.btnlaundry);
        mButtonLaundry.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, LaundryMaps.class);
                startActivity(intent);
            }
        });

        mButtonCafe = findViewById(R.id.btncafe);
        mButtonCafe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, CafeMaps.class);
                startActivity(intent);
            }
        });

        mButtonAtm = findViewById(R.id.btnatm);
        mButtonAtm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, AtmMaps.class);
                startActivity(intent);
            }
        });

        mButtonBank = findViewById(R.id.btnbank);
        mButtonBank.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, BankMaps.class);
                startActivity(intent);
            }
        });

        mButtonParking = findViewById(R.id.btnparking);
        mButtonParking.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, ParkingMaps.class);
                startActivity(intent);
            }
        });

        mButtonCarwash = findViewById(R.id.btncarwash);
        mButtonCarwash.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, CarWashMaps.class);
                startActivity(intent);
            }
        });

        mButtonPark = findViewById(R.id.btnpark);
        mButtonPark.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, ParkMaps.class);
                startActivity(intent);
            }
        });

        mButtonMusemum = findViewById(R.id.btnmuseum);
        mButtonMusemum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, MuseumMaps.class);
                startActivity(intent);
            }
        });

        mButtonAirport = findViewById(R.id.btnairport);
        mButtonAirport.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, AirportMaps.class);
                startActivity(intent);
            }
        });

        mButtonShoping = findViewById(R.id.btnshoping);
        mButtonShoping.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, ShopingMaps.class);
                startActivity(intent);
            }
        });
    }


}
