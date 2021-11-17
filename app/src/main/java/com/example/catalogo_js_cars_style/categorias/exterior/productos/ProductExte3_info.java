package com.example.catalogo_js_cars_style.categorias.exterior.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Exterior;

public class ProductExte3_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.brochemetaliconegro1, R.drawable.brocheparachoqueinsta, R.drawable.brochemetalicomediano1, R.drawable.brochemetalicomediano2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_exte3_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderExt3);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreExt3);
        txt_precio = (TextView)findViewById(R.id.txt_precioExt3);
        txt_descrip = (TextView)findViewById(R.id.txt_descripExt3);

        Exterior obj_ext = new Exterior();

        txt_nombre.setText(obj_ext.getNombreExterior()[2]);
        txt_precio.setText("$"+obj_ext.getPrecioExterior()[2]);
        txt_descrip.setText(obj_ext.getDetalleExterior()[2]);
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