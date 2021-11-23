package com.example.catalogo_js_cars_style.categorias.escape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.catalogo_js_cars_style.Carrito_compras;
import com.example.catalogo_js_cars_style.R;
import com.example.catalogo_js_cars_style.categorias.escape.productos.ProductEsca1_info;
import com.example.catalogo_js_cars_style.categorias.escape.productos.ProductEsca2_info;
import com.example.catalogo_js_cars_style.categorias.escape.productos.ProductEsca3_info;
import com.example.catalogo_js_cars_style.categorias.escape.productos.ProductEsca4_info;
import com.example.catalogo_js_cars_style.inicio.Menu_Apart;

import Object_Class.Categorias;
import Object_Class.Escape;

public class cat_escape_v2 extends AppCompatActivity {

    private TextView txt_nombreCat, txt_nombrePro1, txt_precioPro1, txt_nombrePro2, txt_precioPro2,
            txt_nombrePro3, txt_precioPro3,txt_nombrePro4, txt_precioPro4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_escape_v2);

        txt_nombreCat = (TextView)findViewById(R.id.txt_nombreCatEsca);
        txt_nombrePro1 = (TextView)findViewById(R.id.txt_escaNomProd1);
        txt_precioPro1 = (TextView)findViewById(R.id.txt_escaPrecProd1);
        txt_nombrePro2 = (TextView)findViewById(R.id.txt_escaNomProd2);
        txt_precioPro2 = (TextView)findViewById(R.id.txt_escaPrecProd2);
        txt_nombrePro3 = (TextView)findViewById(R.id.txt_escaNomProd3);
        txt_precioPro3 = (TextView)findViewById(R.id.txt_escaPrecProd3);
        txt_nombrePro4 = (TextView)findViewById(R.id.txt_escapNomPro4);
        txt_precioPro4 = (TextView)findViewById(R.id.txt_escaPrePro4);

        Escape obj_esca = new Escape();
        Categorias obj_cat = new Categorias();

        txt_nombreCat.setText(obj_cat.getNombreCategorias()[0]);

        txt_nombrePro1.setText(obj_esca.getNombreEscape()[0]);
        txt_precioPro1.setText("$"+obj_esca.getPrecioEscape()[0]);
        txt_nombrePro2.setText(obj_esca.getNombreEscape()[1]);
        txt_precioPro2.setText("$"+obj_esca.getPrecioEscape()[1]);
        txt_nombrePro3.setText(obj_esca.getNombreEscape()[2]);
        txt_precioPro3.setText("$"+obj_esca.getPrecioEscape()[2]);
        txt_nombrePro4.setText(obj_esca.getNombreEscape()[3]);
        txt_precioPro4.setText("$"+obj_esca.getPrecioEscape()[3]);
    }

    public void abrirProEsca1(View view){
        Intent i = new Intent(this, ProductEsca1_info.class);
        startActivity(i);
    }

    public void abrirProEsca2(View view){
        Intent i = new Intent(this, ProductEsca2_info.class);
        startActivity(i);
    }

    public void abrirProEsca3(View view){
        Intent i = new Intent(this, ProductEsca3_info.class);
        startActivity(i);
    }

    public void abrirProEsca4(View view){
        Intent i = new Intent(this, ProductEsca4_info.class);
        startActivity(i);
    }

    public void bttMenu(View view){
        Intent i = new Intent(this, Menu_Apart.class);
        startActivity(i);
    }

    public void carrito(View view){
        Intent i = new Intent(this, Carrito_compras.class);
        startActivity(i);
    }
}