package com.halgo.clientcab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Halgo on 23/10/2017.
 */

public class DetailHeureRDV extends AppCompatActivity {
    Button datescreen;
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_rdv_heure_activity);

        datescreen=(Button)findViewById(R.id.datescreen);
        datescreen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(DetailHeureRDV.this, DetailDateRDV.class));
            }
        });

    }
}
