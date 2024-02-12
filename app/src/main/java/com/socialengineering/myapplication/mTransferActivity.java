package com.socialengineering.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mTransferActivity extends AppCompatActivity {
    ConstraintLayout dtransfer_AntarRekening;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtransfer);

        dtransfer_AntarRekening = findViewById(R.id.dtransfer_AntarRekening);

        dtransfer_AntarRekening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mTransferActivity.this, AntarRekeningActivity.class);
                startActivity(intent);
            }
        });
    }
}