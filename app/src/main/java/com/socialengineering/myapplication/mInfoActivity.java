package com.socialengineering.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class mInfoActivity extends AppCompatActivity {

    ConstraintLayout buttonInfoSaldo, ok_SaldoDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minfo);

        buttonInfoSaldo = findViewById(R.id.button_InfoSaldo_minfo);

        buttonInfoSaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSaldoDialog();
            }
        });
    }

    private void showSaldoDialog(){
        LayoutInflater inflater = LayoutInflater.from(mInfoActivity.this);
        View view = inflater.inflate(R.layout.saldo_dialog, null);
        ok_SaldoDialog= view.findViewById(R.id.button_ok_SaldoDialog);

        AlertDialog.Builder builder = new AlertDialog.Builder(mInfoActivity.this);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();
        ok_SaldoDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
                Toast.makeText(mInfoActivity.this, "OK", Toast.LENGTH_SHORT).show();

            }

        });
        if (alertDialog.getWindow() !=null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }
}