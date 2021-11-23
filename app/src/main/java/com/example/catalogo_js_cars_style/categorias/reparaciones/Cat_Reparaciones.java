package com.example.catalogo_js_cars_style.categorias.reparaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.catalogo_js_cars_style.Carrito_compras;
import com.example.catalogo_js_cars_style.R;
import com.example.catalogo_js_cars_style.categorias.iluminacion.productos.Product1_info;
import com.example.catalogo_js_cars_style.categorias.reparaciones.productos.ProductRep1_info;
import com.example.catalogo_js_cars_style.inicio.Menu_Apart;

import Object_Class.Categorias;
import Object_Class.Iluminacion;
import Object_Class.Reparaciones;

public class Cat_Reparaciones extends AppCompatActivity {

    private TextView txt_nombreRep1,txt_precioRep1,txt_nomCatGlobal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_reparaciones);

        txt_nombreRep1 = (TextView)findViewById(R.id.txt_reparacionNombreProduc1);
        txt_precioRep1 = (TextView)findViewById(R.id.txt_reparacionesPrecioProduct1);

        txt_nomCatGlobal = (TextView)findViewById(R.id.txt_nomCatGlobalRepa);

        Reparaciones obj_rep = new Reparaciones();
        Categorias obj_cat = new Categorias();

        txt_nomCatGlobal.setText(obj_cat.getNombreCategorias()[3]);

        txt_nombreRep1.setText(obj_rep.getNombreReparaciones()[0]);
        txt_precioRep1.setText("$"+obj_rep.getPrecioReparaciones()[0]);

    }

    public void bttMenu(View view){
        Intent i = new Intent(this, Menu_Apart.class);
        startActivity(i);
    }

    public void abrirProdReparaciones1(View view){
        Intent i = new Intent(this, ProductRep1_info.class);
        startActivity(i);
    }

    public void carrito(View view){
        Intent i = new Intent(this, Carrito_compras.class);
        startActivity(i);
    }
}