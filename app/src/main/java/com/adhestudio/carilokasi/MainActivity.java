package com.adhestudio.carilokasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.adhestudio.carilokasi.MapsMasjid.MapsMasjidActivity;

public class MainActivity extends AppCompatActivity {

    Button mButtonMasjid;

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
    }


}
