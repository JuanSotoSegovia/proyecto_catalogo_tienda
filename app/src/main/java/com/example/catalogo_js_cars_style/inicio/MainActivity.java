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
import com.example.catalogo_js_cars_style.loginVendedor.Login;

public class MainActivity extends AppCompatActivity {

    private Button btt_iluminacion, btt_todo, btt_escape, btt_exterior, btt_reparaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btt_iluminacion = (Button)findViewById(R.id.btt_sbr_escape);
        btt_todo = (Button)findViewById(R.id.btt_sbr_exterior);
        btt_escape = (Button)findViewById(R.id.btt_sbr_escape);
        btt_exterior = (Button)findViewById(R.id.btt_sbr_exterior);
        btt_reparaciones = (Button)findViewById(R.id.btt_sbr_reparaciones);
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

    public void LoginVendedores(View view){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }

    public void facebook(View view){
        //Datos para intent de app Facebook
        String facebookId   ="fb://page/186817595544588";
        String facebookUrl  ="https://www.facebook.com/j.scarsstyle/";
        //Abrir aplicacion a traves de intent
        try {
            Intent iF = new Intent();
            iF.setAction(Intent.ACTION_VIEW);
            iF.setData(Uri.parse(facebookId));
            startActivity(iF);
            //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
        }
        //Abrir pagina en caso de que no tenga instalado la app de facebook
        catch (ActivityNotFoundException e){
            Toast.makeText(MainActivity.this,"Usted no tiene instalado la aplicacion de Facebook, sera redirigido a nuestra pagia.", Toast.LENGTH_SHORT).show();
            System.out.println(e);
            Intent iF = new Intent();
            iF.setAction(Intent.ACTION_VIEW);
            iF.setData(Uri.parse(facebookUrl));
            startActivity(iF);
            //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
        }
    }

    public void instagram(View view){
        Intent i = new Intent(Intent.ACTION_VIEW); //accion que abre un navegador
        i.setData(Uri.parse("https://instagram.com/j.scarsstyle?utm_medium=copy_link")); //pasamos con el uri.parse la direccion de la pagina web
        startActivity(i); // iniciamos activity
    }

    public void Whatsapp (View view){

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
            Toast.makeText(MainActivity.this,"Lo sentimos, usted no tiene instalado Whatsapp, por favor instálelo.", Toast.LENGTH_SHORT).show();
            System.out.println(e);
        }

    }
    
    
}