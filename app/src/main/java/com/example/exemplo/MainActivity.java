package com.example.exemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextnumber;
    private EditText editTextnumber2;
    private EditText editTextnumber3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextnumber = findViewById(R.id.editTextNumber);
        editTextnumber2 = findViewById(R.id.editTextNumber2);
        editTextnumber3 = findViewById(R.id.editTextNumber3);
    }
    public void somar(View view) {
    int x, y, soma;
    x = Integer.parseInt(editTextnumber.getText().toString());
    y = Integer.parseInt(editTextnumber2.getText().toString());
    soma = x + y;
    editTextnumber3.setText(Integer.toString(soma));
    }
}