package com.example.catalogo_js_cars_style.categorias.iluminacion.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Iluminacion;

public class ProductIlum5_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.cintaledsobrepuesta, R.drawable.cintabifuncionalinsta};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_ilum5_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderIluPro5);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreilu5);
        txt_precio = (TextView)findViewById(R.id.txt_precioIlu5);
        txt_descrip = (TextView)findViewById(R.id.txt_descripIlu5);

        Iluminacion ilum = new Iluminacion();

        txt_nombre.setText(ilum.getNombreIluminacion()[4]);
        txt_precio.setText("$"+ilum.getPrecioIluminacion()[4]);
        txt_descrip.setText(ilum.getDescripcionIluminacion()[4]);
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