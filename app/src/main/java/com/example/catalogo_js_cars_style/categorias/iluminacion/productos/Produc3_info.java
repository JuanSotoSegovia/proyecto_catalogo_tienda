package com.example.catalogo_js_cars_style.categorias.iluminacion.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Iluminacion;

public class Produc3_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;
    private RatingBar cali;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.t10diamante1, R.drawable.t10diamanteblancainsta};
    Iluminacion ilum = new Iluminacion();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produc3_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderIluPro3);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreilu3);
        txt_precio = (TextView)findViewById(R.id.txt_precioIlu3);
        txt_descrip = (TextView)findViewById(R.id.txt_descripIlu3);
        cali = (RatingBar)findViewById(R.id.rtb_pro3_ilum);



        cali.setRating(ilum.getCalificacion()[2]);
        //bloquear barra
        cali.setIsIndicator(true);

        txt_nombre.setText(ilum.getNombreIluminacion()[2]);
        txt_precio.setText("$"+ilum.getPrecioIluminacion()[2]);
        txt_descrip.setText(ilum.getDescripcionIluminacion()[2]);
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

    public void agregar(View view){

    }
}