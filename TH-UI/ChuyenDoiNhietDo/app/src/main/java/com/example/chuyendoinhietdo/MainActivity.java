package com.example.chuyendoinhietdo;



import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Dof,DoC;
    Button btnChuyenC,btnChuyenF,btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dof=findViewById(R.id.DoF);
        DoC=findViewById(R.id.DoC);
        btnChuyenC = findViewById(R.id.btnChuyenC);
        btnChuyenF = findViewById(R.id.btnChuyenF);
        btnClear =findViewById(R.id.btnClear);

        btnChuyenC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(!Dof.getText().toString().isEmpty()){
                   Double a = Double.parseDouble(Dof.getText().toString());

                   Double flag;
                   flag = (a-32)*5/9;
                   DoC.setText(String.valueOf(flag));
               }
            }
        });
        btnChuyenF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(!DoC.getText().toString().isEmpty()){
                   Double b = Double.parseDouble(DoC.getText().toString());
                   Double flag;
                   flag = b*9/5 +32;
                   Dof.setText(String.valueOf(flag));
               }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dof.setText(" ");
                DoC.setText(" ");
            }
        });


    }
}