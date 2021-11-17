package com.example.catalogo_js_cars_style.categorias.exterior.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.R;

import Object_Class.Escape;
import Object_Class.Exterior;

public class ProductExte1_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.antenaaletatiburonblanca, R.drawable.antenablancainsta, R.drawable.antenablanca1, R.drawable.antenablanca2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_exte1_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderExtPro1);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreExt1);
        txt_precio = (TextView)findViewById(R.id.txt_precioExt1);
        txt_descrip = (TextView)findViewById(R.id.txt_descripExt1);

        Exterior obj_ext = new Exterior();

        txt_nombre.setText(obj_ext.getNombreExterior()[0]);
        txt_precio.setText("$"+obj_ext.getPrecioExterior()[0]);
        txt_descrip.setText(obj_ext.getDetalleExterior()[0]);
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