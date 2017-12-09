package com.example.admin.konversinilai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nilaiHuruf;
    EditText inputNilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nilaiHuruf = (TextView) findViewById(R.id.nilaiHuruf);
        inputNilai = (EditText) findViewById(R.id.inputNilai);
    }

    public void konversi(View view) {
        double nilai = Double.parseDouble(inputNilai.getText().toString());
        if(nilai < 0) {
            nilaiHuruf.setText("Nilai tidak valid");
        }
        else if(nilai < 30){
            nilaiHuruf.setText("E");
        }
        else if(nilai < 50){
            nilaiHuruf.setText("D");
        }
        else if (nilai < 60){
            nilaiHuruf.setText("C");
        }
        else if (nilai < 70){
            nilaiHuruf.setText("BC");
        }
        else if (nilai < 75){
            nilaiHuruf.setText("B");
        }
        else if (nilai < 85){
            nilaiHuruf.setText("AB");
        }
        else if (nilai < 100) {
            nilaiHuruf.setText("A");
        }
        else {
            nilaiHuruf.setText("Angka tidak valid");
        }
    }
}
