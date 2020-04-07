package com.example.exercisemenu18b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelilingPersegi extends AppCompatActivity {

    Button bttnKP;
    EditText edP;
    TextView hKP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi);
        edP = findViewById(R.id.edP);
        hKP = findViewById(R.id.hKP);
        bttnKP = findViewById(R.id.bttnKP);
        bttnKP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1;
                s1 = edP.getText().toString();
                double n1, n2;
                n1 = Double.parseDouble(s1);
                n2 = n1 * 4;
                hKP.setText("Hasil keliling persegi dengan sisi: " + n1 + " adalah: " + n2);
            }
        });
    }
}
