package com.example.catalogo_js_cars_style.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.catalogo_js_cars_style.categorias.iluminacion.cat_iluinacion_v2;
import com.example.catalogo_js_cars_style.categorias.escape.cat_escape_v2;
import com.example.catalogo_js_cars_style.R;
import com.example.catalogo_js_cars_style.categorias.exterior.cat_exterior_v2;
import com.example.catalogo_js_cars_style.categorias.reparaciones.Cat_Reparaciones;
import com.example.catalogo_js_cars_style.categorias.top_tendencias.Top_Tendencias;

public class Menu_Apart extends AppCompatActivity {

    private Button btt_iluMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_apart);

        btt_iluMenu = (Button)findViewById(R.id.btt_escapeMenu);
    }

    public void catEscape(View view){
        Intent i = new Intent(this, cat_escape_v2.class);
        startActivity(i);
    }

    public void catExterior(View view){
        Intent i = new Intent(this, cat_exterior_v2.class);
        startActivity(i);
    }

    public void catIlumincion(View view){
        Intent i = new Intent(this, cat_iluinacion_v2.class);
        startActivity(i);
    }

    public void catReparaciones(View view){
        Intent i = new Intent(this, Cat_Reparaciones.class);
        startActivity(i);
    }

    public void TopTendencias(View view){
        Intent i = new Intent(this, Top_Tendencias.class);
        startActivity(i);
    }

    public void inicio(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void whattsapp(View view){
        //Datos para intent de app Whatsapp
        String numeroW = "+56987796378";
        String mensajeWD = "Hola buenas, me contacto con ustedes para consultar sobre unos productos de su catálogo.";

        try {
            //abrir aplicacion a traves de intent
            Intent iW = new Intent();
            iW.setAction(Intent.ACTION_VIEW);
            String uri = "whatsapp://send?phone=" + numeroW + "&text=" + mensajeWD;
            iW.setData(Uri.parse(uri));
            startActivity(iW);

        } catch (ActivityNotFoundException e){
            Toast.makeText(Menu_Apart.this,"Lo sentimos, usted no tiene instalado Whatsapp, por favor instálelo.", Toast.LENGTH_SHORT).show();
            System.out.println(e);
        }
    }

    public void mapsDireccion(View view){
        Intent i = new Intent(Intent.ACTION_VIEW); //accion que abre un navegador
        i.setData(Uri.parse("https://www.google.cl/maps/place/J.S+Cars+Style/@-33.4789822,-70.5651571,17z/data=!3m1!4b1!4m5!3m4!1s0x9662d1013fcbc1a1:0xc6e23914ef5ec340!8m2!3d-33.4789982!4d-70.5629151//")); //pasamos con el uri.parse la direccion de la pagina web
        startActivity(i); // iniciamos activity
    }
}