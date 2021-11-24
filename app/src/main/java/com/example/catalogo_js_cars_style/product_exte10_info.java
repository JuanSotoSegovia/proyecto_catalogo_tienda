package com.example.catalogo_js_cars_style;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ViewFlipper;

import Object_Class.Exterior;
import Object_Class.Iluminacion;

public class product_exte10_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;
    private RatingBar cali;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.brochegrande, R.drawable.brochegrande1, R.drawable.brochegrande2};
    Exterior obj_ext = new Exterior();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_exte10_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderExt10);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreExt10);
        txt_precio = (TextView)findViewById(R.id.txt_precioExt10);
        txt_descrip = (TextView)findViewById(R.id.txt_descripExt10);
        cali = (RatingBar)findViewById(R.id.rtb_pro10_exte10);

        cali.setRating(obj_ext.getCalificcion()[9]);
        //bloquear barra
        cali.setIsIndicator(true);

        txt_nombre.setText(obj_ext.getNombreExterior()[9]);
        txt_precio.setText("$"+obj_ext.getPrecioExterior()[9]);
        txt_descrip.setText(obj_ext.getDetalleExterior()[9]);
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