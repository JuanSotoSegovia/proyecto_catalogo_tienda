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

public class product_ilum8_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;
    private RatingBar cali;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.halogenagoldenh4, R.drawable.halogenagoldenh41, R.drawable.halogenagoldenh42,
                            R.drawable.halogenagoldenh43};
    Iluminacion obj_ilu = new Iluminacion();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_ilum8_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderIlu8);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreIlu8);
        txt_precio = (TextView)findViewById(R.id.txt_precioIlu8);
        txt_descrip = (TextView)findViewById(R.id.txt_descripIlu8);
        cali = (RatingBar)findViewById(R.id.rtb_pro8_ilu);

        cali.setRating(obj_ilu.getCalificacion()[7]);
        //bloquear barra
        cali.setIsIndicator(true);

        txt_nombre.setText(obj_ilu.getNombreIluminacion()[7]);
        txt_precio.setText("$"+obj_ilu.getPrecioIluminacion()[7]);
        txt_descrip.setText(obj_ilu.getDescripcionIluminacion()[7]);
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