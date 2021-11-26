package com.example.catalogo_js_cars_style.categorias.iluminacion.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.catalogo_js_cars_style.DB.AdminSQLiteOpenHelper;
import com.example.catalogo_js_cars_style.R;

import Object_Class.Iluminacion;

public class Product4_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip, txt_stock;
    private RatingBar cali;


    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.ampolletat10rgb, R.drawable.t10rgbinstala, R.drawable.t10rgb1};

    Iluminacion obj_ilu = new Iluminacion();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product4_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderIluPro4);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreilu4);
        txt_precio = (TextView)findViewById(R.id.txt_precioIlu4);
        txt_descrip = (TextView)findViewById(R.id.txt_descripIlu4);
        txt_stock = (TextView)findViewById(R.id.txt_stock_pro4_ilu);
        cali = (RatingBar)findViewById(R.id.rtb_pro4_ilu);

        cali.setRating(obj_ilu.getCalificacion()[3]);
        //bloquear Ratingbar
        cali.setIsIndicator(true);

        txt_nombre.setText(obj_ilu.getNombreIluminacion()[3]);
        txt_precio.setText("$"+obj_ilu.getPrecioIluminacion()[3]);
        txt_descrip.setText(obj_ilu.getDescripcionIluminacion()[3]);

        txt_stock.setVisibility(View.INVISIBLE);

        //--------------------------------------------------------
        //mostrar datos
        //nos traemos el constructor para instanciar (obtenemos base de datos)
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getBaseContext(),"catalogoJ.S",null,1);
        //damos permisos de sobre escritura
        SQLiteDatabase db = admin.getWritableDatabase();

        //recolectamos datos para consulta
        int codigo = obj_ilu.getId()[3];

        //cosnultar
        Cursor file = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo,null);

        if (file.moveToFirst()){ //verifica si hay valores asociados
            //mosramos daos segun posicion de consulta
            txt_stock.setVisibility(View.VISIBLE);
            txt_stock.setText("Stock: " + file.getString(0));
        }else{
            Toast.makeText(getBaseContext(), "No hay prodcto asociado a esta id "+codigo, Toast.LENGTH_LONG).show();
        }
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