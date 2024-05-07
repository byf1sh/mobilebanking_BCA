package com.socialengineering.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    ConstraintLayout button_mInfoActivity, button_mTransferActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button_mInfoActivity = findViewById(R.id.button_mInfoActivity);
        button_mTransferActivity = findViewById(R.id.button_mTransferActivity);

        button_mInfoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, mInfoActivity.class);
                startActivity(intent);
            }
        });

        button_mTransferActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, mTransferActivity.class);
                startActivity(intent);
            }
        });
    }
}