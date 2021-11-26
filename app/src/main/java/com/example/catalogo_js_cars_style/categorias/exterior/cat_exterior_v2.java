package com.example.catalogo_js_cars_style.categorias.exterior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.catalogo_js_cars_style.Lista_Deseos;
import com.example.catalogo_js_cars_style.R;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte1_info;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte2_info;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte3_info;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte4_info;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte5_info;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte6_info;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte7_info;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte8_info;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte9_info;
import com.example.catalogo_js_cars_style.inicio.Menu_Apart;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.product_exte10_info;

import Object_Class.Categorias;
import Object_Class.Exterior;

public class cat_exterior_v2 extends AppCompatActivity {

    private TextView txt_nombreExt1, txt_nombreExt2, txt_nombreExt3, txt_precioExt1, txt_precioExt2, txt_precioExt3,
            txt_nombreExt4, txt_nombreExt5, txt_nombreExt6, txt_precioExt4, txt_precioExt5, txt_precioExt6,
            txt_nombreExt7, txt_nombreExt8, txt_nombreExt9, txt_precioExt7, txt_precioExt8, txt_precioExt9,
            txt_nomCatGlobalPag1, txt_nombreExt10, txt_precioExt10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_exterior_v2);

        txt_nomCatGlobalPag1 = (TextView)findViewById(R.id.txt_nomCatGlobalExtPag1);

        txt_nombreExt1 = (TextView)findViewById(R.id.txt_nobreExtPro1);
        txt_precioExt1 = (TextView)findViewById(R.id.txt_precioExtPro1);
        txt_nombreExt2 = (TextView)findViewById(R.id.txt_nobreExtPro2);
        txt_precioExt2 = (TextView)findViewById(R.id.txt_precioExtPro2);
        txt_nombreExt3 = (TextView)findViewById(R.id.txt_nobreExtPro3);
        txt_precioExt3 = (TextView)findViewById(R.id.txt_precioExtPro3);
        txt_nombreExt4 = (TextView)findViewById(R.id.txt_nobreExtPro4);
        txt_precioExt4 = (TextView)findViewById(R.id.txt_precioExtPro4);
        txt_nombreExt5 = (TextView)findViewById(R.id.txt_nobreExtPro5);
        txt_precioExt5 = (TextView)findViewById(R.id.txt_precioExtPro5);
        txt_nombreExt6 = (TextView)findViewById(R.id.txt_nobreExtPro6);
        txt_precioExt6 = (TextView)findViewById(R.id.txt_precioExtPro6);
        txt_nombreExt7 = (TextView)findViewById(R.id.txt_nobreExtPro7);
        txt_precioExt7 = (TextView)findViewById(R.id.txt_precioExtPro7);
        txt_nombreExt8 = (TextView)findViewById(R.id.txt_nobreExtPro8);
        txt_precioExt8 = (TextView)findViewById(R.id.txt_precioExtPro8);
        txt_nombreExt9 = (TextView)findViewById(R.id.txt_nobreExtPro9);
        txt_precioExt9 = (TextView)findViewById(R.id.txt_precioExtPro9);
        txt_nombreExt10 = (TextView)findViewById(R.id.txt_nobreExtPro10);
        txt_precioExt10 = (TextView)findViewById(R.id.txt_precioExtPro10);

        Categorias obj_cat = new Categorias();

        txt_nomCatGlobalPag1.setText(obj_cat.getNombreCategorias()[1]);

        Exterior obj_ext = new Exterior();

        txt_nombreExt1.setText(obj_ext.getNombreExterior()[0]);
        txt_precioExt1.setText("$" + obj_ext.getPrecioExterior()[0]);
        txt_nombreExt2.setText(obj_ext.getNombreExterior()[1]);
        txt_precioExt2.setText("$" + obj_ext.getPrecioExterior()[1]);
        txt_nombreExt3.setText(obj_ext.getNombreExterior()[2]);
        txt_precioExt3.setText("$" + obj_ext.getPrecioExterior()[2]);
        txt_nombreExt4.setText(obj_ext.getNombreExterior()[3]);
        txt_precioExt4.setText("$" + obj_ext.getPrecioExterior()[3]);
        txt_nombreExt5.setText(obj_ext.getNombreExterior()[4]);
        txt_precioExt5.setText("$" + obj_ext.getPrecioExterior()[4]);
        txt_nombreExt6.setText(obj_ext.getNombreExterior()[5]);
        txt_precioExt6.setText("$" + obj_ext.getPrecioExterior()[5]);
        txt_nombreExt7.setText(obj_ext.getNombreExterior()[6]);
        txt_precioExt7.setText("$" + obj_ext.getPrecioExterior()[6]);
        txt_nombreExt8.setText(obj_ext.getNombreExterior()[7]);
        txt_precioExt8.setText("$" + obj_ext.getPrecioExterior()[7] + " / $" + obj_ext.getPrecioPackExterior()[0]);
        txt_nombreExt9.setText(obj_ext.getNombreExterior()[8]);
        txt_precioExt9.setText("$" + obj_ext.getPrecioExterior()[8]);
        txt_nombreExt10.setText(obj_ext.getNombreExterior()[9]);
        txt_precioExt10.setText("$" + obj_ext.getPrecioExterior()[9]);
    }

    public void bttMenu(View view){
        Intent i = new Intent(this, Menu_Apart.class);
        startActivity(i);
    }

    public void abrirExteriorPro1(View view){
        Intent i = new Intent(this, ProductExte1_info.class);
        startActivity(i);
    }

    public void abrirExteriorPro2(View view){
        Intent i = new Intent(this, ProductExte2_info.class);
        startActivity(i);
    }

    public void abrirExteriorPro3(View view){
        Intent i = new Intent(this, ProductExte3_info.class);
        startActivity(i);
    }

    public void abrirExteriorPro4(View view){
        Intent i = new Intent(this, ProductExte4_info.class);
        startActivity(i);
    }

    public void abrirExteriorPro5(View view){
        Intent i = new Intent(this, ProductExte5_info.class);
        startActivity(i);
    }

    public void abrirExteriorPro6(View view){
        Intent i = new Intent(this, ProductExte6_info.class);
        startActivity(i);
    }

    public void abrirExteriorPro7(View view){
        Intent i = new Intent(this, ProductExte7_info.class);
        startActivity(i);
    }

    public void abrirExteriorPro8(View view){
        Intent i = new Intent(this, ProductExte8_info.class);
        startActivity(i);
    }

    public void abrirExteriorPro9(View view){
        Intent i = new Intent(this, ProductExte9_info.class);
        startActivity(i);
    }

    public void abrirExteriorPro10(View view){
        Intent i = new Intent(this, product_exte10_info.class);
        startActivity(i);
    }

    public void carrito(View view){
        Intent i = new Intent(this, Lista_Deseos.class);
        startActivity(i);
    }
}