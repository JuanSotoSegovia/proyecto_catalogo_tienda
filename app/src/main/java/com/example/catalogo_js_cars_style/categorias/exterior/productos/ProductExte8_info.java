package com.example.catalogo_js_cars_style.categorias.exterior.productos;

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

import Object_Class.Exterior;

public class ProductExte8_info extends AppCompatActivity {

    private TextView txt_nombre, txt_precio, txt_descrip, txt_stock;
    private RatingBar cali;

    //silder de imagenes
    private ViewFlipper vf;
    private int[] image = {R.drawable.guardafangos, R.drawable.guardafangos1, R.drawable.guardafangos2};

    Exterior obj_ext = new Exterior();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_exte8_info);

        //silder de imagenes
        vf = (ViewFlipper)findViewById(R.id.sliderExt8);

        for(int i = 0; i<image.length; i++){
            flip_image(image[i]);
        }

        txt_nombre = (TextView)findViewById(R.id.txt_nombreExt8);
        txt_precio = (TextView)findViewById(R.id.txt_precioExt8);
        txt_descrip = (TextView)findViewById(R.id.txt_descripExt8);
        txt_stock = (TextView)findViewById(R.id.txt_stock_pro8_ext);
        cali = (RatingBar)findViewById(R.id.rtb_pro8_ext);

        cali.setRating(obj_ext.getCalificcion()[7]);
        //bloquear Ratingbar
        cali.setIsIndicator(true);

        Exterior obj_ext = new Exterior();

        txt_nombre.setText(obj_ext.getNombreExterior()[7]);
        txt_precio.setText("$"+obj_ext.getPrecioExterior()[7] + " / " + obj_ext.getPrecioPackExterior()[0]);
        txt_descrip.setText(obj_ext.getDetalleExterior()[7]);

        txt_stock.setVisibility(View.INVISIBLE);

        //--------------------------------------------------------
        //mostrar datos
        //nos traemos el constructor para instanciar (obtenemos base de datos)
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getBaseContext(),"catalogoJ.S",null,1);
        //damos permisos de sobre escritura
        SQLiteDatabase db = admin.getWritableDatabase();

        //recolectamos datos para consulta
        int codigo = obj_ext.getId()[7];

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