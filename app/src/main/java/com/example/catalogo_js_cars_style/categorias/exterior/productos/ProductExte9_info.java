package com.example.catalogo_js_cars_style.categorias.exterior.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Exterior;

public class ProductExte9_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.lipparachoque, R.drawable.lipparachoquefibrainsta, R.drawable.lipparachoquefibra1, R.drawable.lipparachoquefibra2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_exte9_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderExt9);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreExt9);
        txt_precio = (TextView)findViewById(R.id.txt_precioExt9);
        txt_descrip = (TextView)findViewById(R.id.txt_descripExt9);

        Exterior obj_ext = new Exterior();

        txt_nombre.setText(obj_ext.getNombreExterior()[8]);
        txt_precio.setText("$"+obj_ext.getPrecioExterior()[8]);
        txt_descrip.setText(obj_ext.getDetalleExterior()[8]);
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