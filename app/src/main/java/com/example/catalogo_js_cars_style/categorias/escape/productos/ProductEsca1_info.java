package com.example.catalogo_js_cars_style.categorias.escape.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Escape;
import Object_Class.Iluminacion;

public class ProductEsca1_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.cola407, R.drawable.cola407insta, R.drawable.cola4071, R.drawable.cola4072};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_esca1_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderEscaPro1);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreEsca1);
        txt_precio = (TextView)findViewById(R.id.txt_precioEsca1);
        txt_descrip = (TextView)findViewById(R.id.txt_descripEsca1);

        Escape obj_esca = new Escape();

        txt_nombre.setText(obj_esca.getNombreEscape()[0]);
        txt_precio.setText("$"+obj_esca.getPrecioEscape()[0]);
        txt_descrip.setText(obj_esca.getDetalleEscape()[0]);

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