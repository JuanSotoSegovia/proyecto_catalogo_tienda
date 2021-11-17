package com.example.catalogo_js_cars_style.categorias.iluminacion.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Iluminacion;

public class Product2_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.ampolletasgolden9006, R.drawable.halogenagolden9006insta, R.drawable.golden90061, R.drawable.golden90062};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product2_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderIluPro2);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreilu2);
        txt_precio = (TextView)findViewById(R.id.txt_precioIlu2);
        txt_descrip = (TextView)findViewById(R.id.txt_descripIlu2);

        Iluminacion ilum = new Iluminacion();

        txt_nombre.setText(ilum.getNombreIluminacion()[1]);
        txt_precio.setText("$"+ilum.getPrecioIluminacion()[1]);
        txt_descrip.setText(ilum.getDescripcionIluminacion()[1]);
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