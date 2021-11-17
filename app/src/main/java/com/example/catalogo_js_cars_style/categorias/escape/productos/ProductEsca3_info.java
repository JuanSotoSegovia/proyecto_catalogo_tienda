package com.example.catalogo_js_cars_style.categorias.escape.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Escape;

public class ProductEsca3_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.cola233, R.drawable.cola2331, R.drawable.cola2332};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_esca3_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderEscaPro3);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreEsca3);
        txt_precio = (TextView)findViewById(R.id.txt_precioEsca3);
        txt_descrip = (TextView)findViewById(R.id.txt_descripEsca3);

        Escape obj_esca = new Escape();

        txt_nombre.setText(obj_esca.getNombreEscape()[2]);
        txt_precio.setText("$"+obj_esca.getPrecioEscape()[2]);
        txt_descrip.setText(obj_esca.getDetalleEscape()[2]);
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