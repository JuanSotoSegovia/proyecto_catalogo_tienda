package com.example.catalogo_js_cars_style.categorias.reparaciones.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Iluminacion;
import Object_Class.Reparaciones;

public class ProductRep1_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.kitcentralizado, R.drawable.centralizadoinsta, R.drawable.centralizado1, R.drawable.centralizado2, R.drawable.centralizado3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_rep1_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderRepaPro1);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombrerepa1);
        txt_precio = (TextView)findViewById(R.id.txt_precioRepa1);
        txt_descrip = (TextView)findViewById(R.id.txt_descripRepa1);

        Reparaciones repa = new Reparaciones();

        txt_nombre.setText(repa.getNombreReparaciones()[0]);
        txt_precio.setText("$"+repa.getPrecioReparaciones()[0]);
        txt_descrip.setText(repa.getDetalleReparaciones()[0]);
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