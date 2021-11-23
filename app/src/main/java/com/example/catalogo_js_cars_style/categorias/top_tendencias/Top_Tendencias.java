package com.example.catalogo_js_cars_style.categorias.top_tendencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.catalogo_js_cars_style.Carrito_compras;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte1_info;
import com.example.catalogo_js_cars_style.categorias.exterior.productos.ProductExte2_info;
import com.example.catalogo_js_cars_style.R;
import com.example.catalogo_js_cars_style.categorias.escape.productos.ProductEsca2_info;
import com.example.catalogo_js_cars_style.categorias.iluminacion.productos.Product4_info;
import com.example.catalogo_js_cars_style.inicio.Menu_Apart;

import Object_Class.Categorias;
import Object_Class.Escape;
import Object_Class.Exterior;
import Object_Class.Iluminacion;

public class Top_Tendencias extends AppCompatActivity {

    private TextView cat, pro1, pro2, pro3, pro4;
    private Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_tendencias);

        cat = (TextView)findViewById(R.id.txt_cat);
        pro1 = (TextView)findViewById(R.id.txt_pro1);
        pro2 = (TextView)findViewById(R.id.txt_pro2);
        pro3 = (TextView)findViewById(R.id.txt_pro3);
        pro4 = (TextView)findViewById(R.id.txt_pro4);

        Categorias obj_Cat = new Categorias();
        Iluminacion obj_Ilu = new Iluminacion();
        Escape obj_Esc = new Escape();
        Exterior obj_Ext = new Exterior();

        cat.setText(obj_Cat.getNombreCategorias()[4]);
        pro1.setText(obj_Ilu.getNombreIluminacion()[3]);
        pro2.setText((obj_Ext.getNombreExterior()[0]));
        pro3.setText((obj_Ext.getNombreExterior()[1]));
        pro4.setText((obj_Esc.getNombreEscape()[1]));
    }

    public void abrirProdIluminacion4(View view){
        Intent i = new Intent(this, Product4_info.class);
        startActivity(i);
    }

    public void abrirProdExterior1(View view){
        Intent i = new Intent(this, ProductExte1_info.class);
        startActivity(i);
    }

    public void abrirProdExterior2(View view){
        Intent i = new Intent(this, ProductExte2_info.class);
        startActivity(i);
    }

    public void abrirProdEscape2(View view){
        Intent i = new Intent(this, ProductEsca2_info.class);
        startActivity(i);
    }

    public void menu(View view){
        Intent i = new Intent(this, Menu_Apart.class);
        startActivity(i);
    }

    public void carrito(View view){
        Intent i = new Intent(this, Carrito_compras.class);
        startActivity(i);
    }
}