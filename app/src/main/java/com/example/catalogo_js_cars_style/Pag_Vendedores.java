package com.example.catalogo_js_cars_style;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import Object_Class.Vendedores;

public class Pag_Vendedores extends AppCompatActivity {

    private TextView vendedor, cargo;
    Vendedores obj_ven = new Vendedores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag_vendedores);

        vendedor = (TextView)findViewById(R.id.txt_nomVendedor);
        cargo = (TextView)findViewById(R.id.txt_cargoVen);

        Bundle bun =getIntent().getExtras();
        String vend =bun.getString("loginVendedor");

        for (int i = 0 ; i <= obj_ven.getIds().length ; i++){
            if (vend.equals(obj_ven.getUsuarios()[i])){
                vendedor.setText("Nombre: " + obj_ven.getNombreApe()[i]);
                cargo.setText("Cargo: " + obj_ven.getCargo()[i]);
                break;
            }
        }
    }

    public void stock (View view){
        Bundle bun =getIntent().getExtras();
        String vend =bun.getString("loginVendedor");

        Intent i = new Intent(this, Stock_Vendedores.class);
        Bundle bund = new Bundle();
        bund.putString("vender", vend);
        i.putExtras(bund);
        startActivity(i);
    }

    public void caja (View view){
        Bundle bun =getIntent().getExtras();
        String vend =bun.getString("loginVendedor");

        Intent i = new Intent(this, caja_vendedores.class);
        Bundle bund = new Bundle();
        bund.putString("vender", vend);
        i.putExtras(bund);
        startActivity(i);
    }
}