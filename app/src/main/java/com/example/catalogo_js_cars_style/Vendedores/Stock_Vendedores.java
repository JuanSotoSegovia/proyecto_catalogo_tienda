package com.example.catalogo_js_cars_style.Vendedores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Vendedores;

public class Stock_Vendedores extends AppCompatActivity {

    private TextView vendedor, cargo;
    Vendedores obj_ven = new Vendedores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_vendedores);

        vendedor = (TextView)findViewById(R.id.txt_nomVendedorStock);
        cargo = (TextView)findViewById(R.id.txt_cargoVenStock);

        Bundle bun =getIntent().getExtras();
        String vend =bun.getString("vender");

        for (int i = 0 ; i <= obj_ven.getIds().length ; i++){
            if (vend.equals(obj_ven.getUsuarios()[i])){
                vendedor.setText("Nombre: " + obj_ven.getNombreApe()[i]);
                cargo.setText("Cargo: " + obj_ven.getCargo()[i]);
                break;
            }
        }
    }
}