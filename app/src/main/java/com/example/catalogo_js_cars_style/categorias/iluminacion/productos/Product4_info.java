package com.example.catalogo_js_cars_style.categorias.iluminacion.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Iluminacion;

public class Product4_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.ampolletat10rgb, R.drawable.t10rgbinstala, R.drawable.t10rgb1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product4_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderIluPro4);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreilu4);
        txt_precio = (TextView)findViewById(R.id.txt_precioIlu4);
        txt_descrip = (TextView)findViewById(R.id.txt_descripIlu4);

        Iluminacion ilum = new Iluminacion();

        txt_nombre.setText(ilum.getNombreIluminacion()[3]);
        txt_precio.setText("$"+ilum.getPrecioIluminacion()[3]);
        txt_descrip.setText(ilum.getDescripcionIluminacion()[3]);
    }

    //silder de imagenes
    public void flip_image(int i){
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);
        vf.addView(view);
        vf.setFlipInterval(2800);
        vf.setAutoStart(true);

        vf.setInAnimation(this, android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}