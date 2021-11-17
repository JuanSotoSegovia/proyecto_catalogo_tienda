package com.example.catalogo_js_cars_style;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pag_Vendedores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag_vendedores);
    }

    public void stock (View view){
        Intent i = new Intent(this, Stock_Vendedores.class);
        startActivity(i);
    }
}