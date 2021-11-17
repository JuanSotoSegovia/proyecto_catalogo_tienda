package com.example.catalogo_js_cars_style.categorias.escape.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Escape;

public class ProductEsca2_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.cola146, R.drawable.cola1461, R.drawable.cola1462};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_esca2_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderEscaPro2);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreEsca2);
        txt_precio = (TextView)findViewById(R.id.txt_precioEsca2);
        txt_descrip = (TextView)findViewById(R.id.txt_descripEsca2);

        Escape obj_esca = new Escape();

        txt_nombre.setText(obj_esca.getNombreEscape()[1]);
        txt_precio.setText("$"+obj_esca.getPrecioEscape()[1]);
        txt_descrip.setText(obj_esca.getDetalleEscape()[1]);
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