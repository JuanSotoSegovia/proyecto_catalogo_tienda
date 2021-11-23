package com.example.catalogo_js_cars_style.categorias.iluminacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.catalogo_js_cars_style.Carrito_compras;
import com.example.catalogo_js_cars_style.R;
import com.example.catalogo_js_cars_style.categorias.iluminacion.productos.Produc3_info;
import com.example.catalogo_js_cars_style.categorias.iluminacion.productos.ProducIlum7_info;
import com.example.catalogo_js_cars_style.categorias.iluminacion.productos.Product1_info;
import com.example.catalogo_js_cars_style.categorias.iluminacion.productos.Product2_info;
import com.example.catalogo_js_cars_style.categorias.iluminacion.productos.Product4_info;
import com.example.catalogo_js_cars_style.categorias.iluminacion.productos.ProductIlum5_info;
import com.example.catalogo_js_cars_style.categorias.iluminacion.productos.ProductIlum6_info;
import com.example.catalogo_js_cars_style.inicio.Menu_Apart;

import Object_Class.Categorias;
import Object_Class.Iluminacion;

public class cat_iluinacion_v2 extends AppCompatActivity {

    private TextView txt_nombreIlu1, txt_nombreIlu2, txt_nombreIlu3, txt_precioIlu1, txt_precioIlu2, txt_precioIlu3,
            txt_nombreIlu4, txt_nombreIlu5, txt_nombreIlu6, txt_precioIlu4, txt_precioIlu5, txt_precioIlu6,
            txt_nombreIlu7, txt_precioIlu7, txt_nomCatGlobal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_iluinacion_v2);

        txt_nombreIlu1 = (TextView)findViewById(R.id.txt_iluminacionNombreProduc1);
        txt_precioIlu1 = (TextView)findViewById(R.id.txt_iluminacionPrecioProduct1);
        txt_nombreIlu2 = (TextView)findViewById(R.id.txt_iluminacionNombreProduc2);
        txt_precioIlu2 = (TextView)findViewById(R.id.txt_iluminacionPrecioProduct2);
        txt_nombreIlu3 = (TextView)findViewById(R.id.txt_iluminacionNombreProduc3);
        txt_precioIlu3 = (TextView)findViewById(R.id.txt_iluminacionPrecioProduct3);
        txt_nombreIlu4 = (TextView)findViewById(R.id.txt_iluminacionNombreProduc4);
        txt_precioIlu4 = (TextView)findViewById(R.id.txt_iluminacionPrecioProduct4);
        txt_nombreIlu5 = (TextView)findViewById(R.id.txt_iluminacionNombreProduc5);
        txt_precioIlu5 = (TextView)findViewById(R.id.txt_iluminacionPrecioProduct5);
        txt_nombreIlu6 = (TextView)findViewById(R.id.txt_iluminacionNombreProduc6);
        txt_precioIlu6 = (TextView)findViewById(R.id.txt_iluminacionPrecioProduct6);
        txt_nombreIlu7 = (TextView)findViewById(R.id.txt_iluminacionNombreProduc7);
        txt_precioIlu7 = (TextView)findViewById(R.id.txt_iluminacionPrecioProduct7);

        txt_nomCatGlobal = (TextView)findViewById(R.id.txt_nomCatGlobal);

        Iluminacion obj_ilu = new Iluminacion();
        Categorias obj_cat = new Categorias();

        txt_nomCatGlobal.setText(obj_cat.getNombreCategorias()[2]);

        txt_nombreIlu1.setText(obj_ilu.getNombreIluminacion()[0]);
        txt_precioIlu1.setText("$"+obj_ilu.getPrecioIluminacion()[0]);
        txt_nombreIlu2.setText(obj_ilu.getNombreIluminacion()[1]);
        txt_precioIlu2.setText("$"+obj_ilu.getPrecioIluminacion()[1]);
        txt_nombreIlu3.setText(obj_ilu.getNombreIluminacion()[2]);
        txt_precioIlu3.setText("$"+obj_ilu.getPrecioIluminacion()[2]);
        txt_nombreIlu4.setText(obj_ilu.getNombreIluminacion()[3]);
        txt_precioIlu4.setText("$"+obj_ilu.getPrecioIluminacion()[3]);
        txt_nombreIlu5.setText(obj_ilu.getNombreIluminacion()[4]);
        txt_precioIlu5.setText("$"+obj_ilu.getPrecioIluminacion()[4]);
        txt_nombreIlu6.setText(obj_ilu.getNombreIluminacion()[5]);
        txt_precioIlu6.setText("$"+obj_ilu.getPrecioIluminacion()[5]);
        txt_nombreIlu7.setText(obj_ilu.getNombreIluminacion()[6]);
        txt_precioIlu7.setText("$"+obj_ilu.getPrecioIluminacion()[6]);
    }

    public void bttMenu(View view){
        Intent i = new Intent(this, Menu_Apart.class);
        startActivity(i);
    }

    public void abrirProdIluminacion1(View view){
        Intent i = new Intent(this, Product1_info.class);
        startActivity(i);
    }

    public void abrirProdIluminacion2(View view){
        Intent i = new Intent(this, Product2_info.class);
        startActivity(i);
    }

    public void abrirProdIluminacion3(View view){
        Intent i = new Intent(this, Produc3_info.class);
        startActivity(i);
    }

    public void abrirProdIluminacion4(View view){
        Intent i = new Intent(this, Product4_info.class);
        startActivity(i);
    }

    public void abrirProdIluminacion5(View view){
        Intent i = new Intent(this, ProductIlum5_info.class);
        startActivity(i);
    }

    public void abrirProdIluminacion6(View view){
        Intent i = new Intent(this, ProductIlum6_info.class);
        startActivity(i);
    }

    public void abrirProdIluminacion7(View view){
        Intent i = new Intent(this, ProducIlum7_info.class);
        startActivity(i);
    }

    public void carrito(View view){
        Intent i = new Intent(this, Carrito_compras.class);
        startActivity(i);
    }
}