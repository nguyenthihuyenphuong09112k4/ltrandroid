package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText SoA,SoB;
        TextView tvKQ ;
        Button btnTong,btnHieu,btnTich,btnThuong,btnUCLN,btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SoA=findViewById(R.id.SoA);
        SoB=findViewById(R.id.SoB);
        tvKQ = findViewById(R.id.tvKQ);
        btnTong=findViewById(R.id.btnTong);
        btnHieu=findViewById(R.id.btnHieu);
        btnTich=findViewById(R.id.btnTich);
        btnThuong=findViewById(R.id.btnThuong);
        btnUCLN=findViewById(R.id.btnUCLN);
        btnExit=findViewById(R.id.btnExit);



        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(SoA.getText().toString());
                int b = Integer.parseInt(SoB.getText().toString());
                  int sum = a+b;
                  tvKQ.setText(String.valueOf(sum));
            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(SoA.getText().toString());
                int b = Integer.parseInt(SoB.getText().toString());
                int sum = a-b;
                tvKQ.setText(String.valueOf(sum));
            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(SoA.getText().toString());
                int b = Integer.parseInt(SoB.getText().toString());
                int sum = a*b;
                tvKQ.setText(String.valueOf(sum));
            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(SoA.getText().toString());
                int b = Integer.parseInt(SoB.getText().toString());
                int sum = a/b;
                tvKQ.setText(String.valueOf(sum));
            }
        });
        btnUCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(SoA.getText().toString());
                int b = Integer.parseInt(SoB.getText().toString());

                tvKQ.setText(String.valueOf(ucln(a,b)));
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    //UCLN
    public  Integer  ucln(int a, int b){
        if(b==0){
            return a;
        }
        return ucln(b, a%b );

    }

}