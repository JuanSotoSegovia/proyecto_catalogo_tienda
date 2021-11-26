package com.example.catalogo_js_cars_style.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.catalogo_js_cars_style.DB.AdminSQLiteOpenHelper;
import com.example.catalogo_js_cars_style.Ingreso_Stock;
import com.example.catalogo_js_cars_style.Ingreso_venta;
import com.example.catalogo_js_cars_style.R;

import java.util.ArrayList;
import java.util.List;

import Object_Class.Productos;
import Object_Class.Vendedores;

public class Pag_Admin extends AppCompatActivity {

    private TextView vendedor, cargo, tx_nompro1, tx_stockpro1,tx_nompro2, tx_stockpro2,tx_nompro3, tx_stockpro3,tx_nompro4, tx_stockpro4,
            tx_nompro5, tx_stockpro5,tx_nompro6, tx_stockpro6, tx_nompro7, tx_stockpro7,tx_nompro8, tx_stockpro8,
            tx_nompro9, tx_stockpro9,tx_nompro10, tx_stockpro10, tx_nompro11, tx_stockpro11,tx_nompro12, tx_stockpro12,tx_nompro13, tx_stockpro13,tx_nompro14, tx_stockpro14,
            tx_nompro15, tx_stockpro15,tx_nompro16, tx_stockpro16, tx_nompro17, tx_stockpro17,tx_nompro18, tx_stockpro18,
            tx_nompro19, tx_stockpro19,tx_nompro20, tx_stockpro20,tx_nompro21, tx_stockpro21,tx_nompro22, tx_stockpro22, tx_nompro23, tx_stockpro23;

    Vendedores obj_ven = new Vendedores();
    Productos obj_pro = new Productos();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag_admin);

        vendedor = (TextView)findViewById(R.id.txt_nomVendedorAdmin);
        cargo = (TextView)findViewById(R.id.txt_cargoVenAdmin);

        tx_nompro1 = (TextView)findViewById(R.id.tx_pro1);
        tx_stockpro1 = (TextView)findViewById(R.id.tx_stockPro1);
        tx_nompro2 = (TextView)findViewById(R.id.tx_pro2);
        tx_stockpro2 = (TextView)findViewById(R.id.tx_stockPro2);
        tx_nompro3 = (TextView)findViewById(R.id.tx_pro3);
        tx_stockpro3 = (TextView)findViewById(R.id.tx_stockPro3);
        tx_nompro4 = (TextView)findViewById(R.id.tx_pro4);
        tx_stockpro4 = (TextView)findViewById(R.id.tx_stockPro4);
        tx_nompro5 = (TextView)findViewById(R.id.tx_pro5);
        tx_stockpro5 = (TextView)findViewById(R.id.tx_stockPro5);
        tx_nompro6 = (TextView)findViewById(R.id.tx_pro6);
        tx_stockpro6 = (TextView)findViewById(R.id.tx_stockPro6);
        tx_nompro7 = (TextView)findViewById(R.id.tx_pro7);
        tx_stockpro7 = (TextView)findViewById(R.id.tx_stockPro7);
        tx_nompro8 = (TextView)findViewById(R.id.tx_pro8);
        tx_stockpro8 = (TextView)findViewById(R.id.tx_stockPro8);
        tx_nompro9 = (TextView)findViewById(R.id.tx_pro9);
        tx_stockpro9 = (TextView)findViewById(R.id.tx_stockPro9);
        tx_nompro10 = (TextView)findViewById(R.id.tx_pro10);
        tx_stockpro10 = (TextView)findViewById(R.id.tx_stockPro10);
        tx_nompro11 = (TextView)findViewById(R.id.tx_pro11);
        tx_stockpro11 = (TextView)findViewById(R.id.tx_stockPro11);
        tx_nompro12 = (TextView)findViewById(R.id.tx_pro12);
        tx_stockpro12 = (TextView)findViewById(R.id.tx_stockPro12);
        tx_nompro13 = (TextView)findViewById(R.id.tx_pro13);
        tx_stockpro13 = (TextView)findViewById(R.id.tx_stockPro13);
        tx_nompro14 = (TextView)findViewById(R.id.tx_pro14);
        tx_stockpro14 = (TextView)findViewById(R.id.tx_stockPro14);
        tx_nompro15 = (TextView)findViewById(R.id.tx_pro15);
        tx_stockpro15 = (TextView)findViewById(R.id.tx_stockPro15);
        tx_nompro16 = (TextView)findViewById(R.id.tx_pro16);
        tx_stockpro16 = (TextView)findViewById(R.id.tx_stockPro16);
        tx_nompro17 = (TextView)findViewById(R.id.tx_pro17);
        tx_stockpro17 = (TextView)findViewById(R.id.tx_stockPro17);
        tx_nompro18 = (TextView)findViewById(R.id.tx_pro18);
        tx_stockpro18 = (TextView)findViewById(R.id.tx_stockPro18);
        tx_nompro19 = (TextView)findViewById(R.id.tx_pro19);
        tx_stockpro19 = (TextView)findViewById(R.id.tx_stockPro19);
        tx_nompro20 = (TextView)findViewById(R.id.tx_pro20);
        tx_stockpro20 = (TextView)findViewById(R.id.tx_stockPro20);
        tx_nompro21 = (TextView)findViewById(R.id.tx_pro21);
        tx_stockpro21 = (TextView)findViewById(R.id.tx_stockPro21);
        tx_nompro22 = (TextView)findViewById(R.id.tx_pro22);
        tx_stockpro22 = (TextView)findViewById(R.id.tx_stockPro22);
        tx_nompro23 = (TextView)findViewById(R.id.tx_pro23);
        tx_stockpro23 = (TextView)findViewById(R.id.tx_stockPro23);


        Bundle bun =getIntent().getExtras();
        String vend =bun.getString("loginVendedor");


        for (int i = 0 ; i <= obj_ven.getIds().length ; i++){
            if (vend.equals(obj_ven.getUsuarios()[i])){
                vendedor.setText("Nombre: " + obj_ven.getNombreApe()[i]);
                cargo.setText("Cargo: " + obj_ven.getCargo()[i]);
                break;
            }
        }

        tx_nompro1.setText(obj_pro.getProducto()[0]);
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getBaseContext(),"catalogoJ.S",null,1);
        SQLiteDatabase db = admin.getWritableDatabase();
        int codigo1 = obj_pro.getId()[0];
        Cursor file = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo1,null);
        if (file.moveToFirst()){
            tx_stockpro1.setText(file.getString(0));
        }else{
            tx_stockpro1.setText("producto sin stock.");
        }

        tx_nompro2.setText(obj_pro.getProducto()[1]);
        int codigo2 = obj_pro.getId()[1];
        Cursor file2 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo2,null);
        if (file2.moveToFirst()){
            tx_stockpro2.setText(file2.getString(0));
        }else{
            tx_stockpro2.setText("producto sin stock.");
        }

        tx_nompro3.setText(obj_pro.getProducto()[2]);
        int codigo3 = obj_pro.getId()[2];
        Cursor file3 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo3,null);
        if (file3.moveToFirst()){
            tx_stockpro3.setText(file3.getString(0));
        }else{
            tx_stockpro3.setText("producto sin stock.");
        }

        tx_nompro4.setText(obj_pro.getProducto()[3]);
        int codigo4 = obj_pro.getId()[3];
        Cursor file4 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo4,null);
        if (file4.moveToFirst()){
            tx_stockpro4.setText(file4.getString(0));
        }else{
            tx_stockpro4.setText("producto sin stock.");
        }

        tx_nompro5.setText(obj_pro.getProducto()[4]);
        int codigo5 = obj_pro.getId()[4];
        Cursor file5 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo5,null);
        if (file5.moveToFirst()){
            tx_stockpro5.setText(file5.getString(0));
        }else{
            tx_stockpro5.setText("producto sin stock.");
        }

        tx_nompro6.setText(obj_pro.getProducto()[5]);
        int codigo6 = obj_pro.getId()[5];
        Cursor file6 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo6,null);
        if (file6.moveToFirst()){
            tx_stockpro6.setText(file6.getString(0));
        }else{
            tx_stockpro6.setText("producto sin stock.");
        }

        tx_nompro7.setText(obj_pro.getProducto()[6]);
        int codigo7 = obj_pro.getId()[6];
        Cursor file7 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo7,null);
        if (file7.moveToFirst()){
            tx_stockpro7.setText(file7.getString(0));
        }else{
            tx_stockpro7.setText("producto sin stock.");
        }

        tx_nompro8.setText(obj_pro.getProducto()[7]);
        int codigo8 = obj_pro.getId()[7];
        Cursor file8 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo8,null);
        if (file8.moveToFirst()){
            tx_stockpro8.setText(file8.getString(0));
        }else{
            tx_stockpro8.setText("producto sin stock.");
        }

        tx_nompro9.setText(obj_pro.getProducto()[8]);
        int codigo9 = obj_pro.getId()[8];
        Cursor file9 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo9,null);
        if (file9.moveToFirst()){
            tx_stockpro9.setText(file9.getString(0));
        }else{
            tx_stockpro9.setText("producto sin stock.");
        }

        tx_nompro10.setText(obj_pro.getProducto()[9]);
        int codigo10 = obj_pro.getId()[9];
        Cursor file10 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo10,null);
        if (file10.moveToFirst()){
            tx_stockpro10.setText(file10.getString(0));
        }else{
            tx_stockpro10.setText("producto sin stock.");
        }

        tx_nompro11.setText(obj_pro.getProducto()[10]);
        int codigo11 = obj_pro.getId()[10];
        Cursor file11 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo11,null);
        if (file11.moveToFirst()){
            tx_stockpro11.setText(file11.getString(0));
        }else{
            tx_stockpro11.setText("producto sin stock.");
        }

        tx_nompro12.setText(obj_pro.getProducto()[11]);
        int codigo12 = obj_pro.getId()[11];
        Cursor file12 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo12,null);
        if (file12.moveToFirst()){
            tx_stockpro12.setText(file12.getString(0));
        }else{
            tx_stockpro12.setText("producto sin stock.");
        }

        tx_nompro13.setText(obj_pro.getProducto()[12]);
        int codigo13 = obj_pro.getId()[12];
        Cursor file13 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo13,null);
        if (file13.moveToFirst()){
            tx_stockpro13.setText(file13.getString(0));
        }else{
            tx_stockpro13.setText("producto sin stock.");
        }

        tx_nompro14.setText(obj_pro.getProducto()[13]);
        int codigo14 = obj_pro.getId()[13];
        Cursor file14 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo14,null);
        if (file14.moveToFirst()){
            tx_stockpro14.setText(file14.getString(0));
        }else{
            tx_stockpro14.setText("producto sin stock.");
        }

        tx_nompro15.setText(obj_pro.getProducto()[14]);
        int codigo15 = obj_pro.getId()[14];
        Cursor file15 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo15,null);
        if (file15.moveToFirst()){
            tx_stockpro15.setText(file15.getString(0));
        }else{
            tx_stockpro15.setText("producto sin stock.");
        }

        tx_nompro16.setText(obj_pro.getProducto()[15]);
        int codigo16 = obj_pro.getId()[15];
        Cursor file16 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo16,null);
        if (file16.moveToFirst()){
            tx_stockpro16.setText(file16.getString(0));
        }else{
            tx_stockpro16.setText("producto sin stock.");
        }

        tx_nompro17.setText(obj_pro.getProducto()[16]);
        int codigo17 = obj_pro.getId()[16];
        Cursor file17 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo17,null);
        if (file17.moveToFirst()){
            tx_stockpro17.setText(file17.getString(0));
        }else{
            tx_stockpro17.setText("producto sin stock.");
        }

        tx_nompro18.setText(obj_pro.getProducto()[17]);
        int codigo18 = obj_pro.getId()[17];
        Cursor file18 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo18,null);
        if (file18.moveToFirst()){
            tx_stockpro18.setText(file18.getString(0));
        }else{
            tx_stockpro18.setText("producto sin stock.");
        }

        tx_nompro19.setText(obj_pro.getProducto()[18]);
        int codigo19 = obj_pro.getId()[18];
        Cursor file19 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo19,null);
        if (file19.moveToFirst()){
            tx_stockpro19.setText(file19.getString(0));
        }else{
            tx_stockpro19.setText("producto sin stock.");
        }

        tx_nompro20.setText(obj_pro.getProducto()[19]);
        int codigo20 = obj_pro.getId()[19];
        Cursor file20 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo20,null);
        if (file20.moveToFirst()){
            tx_stockpro20.setText(file20.getString(0));
        }else{
            tx_stockpro20.setText("producto sin stock.");
        }

        tx_nompro21.setText(obj_pro.getProducto()[20]);
        int codigo21 = obj_pro.getId()[20];
        Cursor file21 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo21,null);
        if (file21.moveToFirst()){
            tx_stockpro21.setText(file21.getString(0));
        }else{
            tx_stockpro21.setText("producto sin stock.");
        }

        tx_nompro22.setText(obj_pro.getProducto()[21]);
        int codigo22 = obj_pro.getId()[21];
        Cursor file22 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo22,null);
        if (file22.moveToFirst()){
            tx_stockpro22.setText(file22.getString(0));
        }else{
            tx_stockpro22.setText("producto sin stock.");
        }

        tx_nompro23.setText(obj_pro.getProducto()[22]);
        int codigo23 = obj_pro.getId()[22];
        Cursor file23 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo23,null);
        if (file23.moveToFirst()){
            tx_stockpro23.setText(file23.getString(0));
        }else{
            tx_stockpro23.setText("producto sin stock.");
        }
//------------------------------------------------


    }

    public void refrescarStock(View view){
        tx_nompro1.setText(obj_pro.getProducto()[0]);
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getBaseContext(),"catalogoJ.S",null,1);
        SQLiteDatabase db = admin.getWritableDatabase();
        int codigo1 = obj_pro.getId()[0];
        Cursor file = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo1,null);
        if (file.moveToFirst()){
            tx_stockpro1.setText(file.getString(0));
        }else{
            tx_stockpro1.setText("producto sin stock.");
        }

        tx_nompro2.setText(obj_pro.getProducto()[1]);
        int codigo2 = obj_pro.getId()[1];
        Cursor file2 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo2,null);
        if (file2.moveToFirst()){
            tx_stockpro2.setText(file2.getString(0));
        }else{
            tx_stockpro2.setText("producto sin stock.");
        }

        tx_nompro3.setText(obj_pro.getProducto()[2]);
        int codigo3 = obj_pro.getId()[2];
        Cursor file3 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo3,null);
        if (file3.moveToFirst()){
            tx_stockpro3.setText(file3.getString(0));
        }else{
            tx_stockpro3.setText("producto sin stock.");
        }

        tx_nompro4.setText(obj_pro.getProducto()[3]);
        int codigo4 = obj_pro.getId()[3];
        Cursor file4 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo4,null);
        if (file4.moveToFirst()){
            tx_stockpro4.setText(file4.getString(0));
        }else{
            tx_stockpro4.setText("producto sin stock.");
        }

        tx_nompro5.setText(obj_pro.getProducto()[4]);
        int codigo5 = obj_pro.getId()[4];
        Cursor file5 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo5,null);
        if (file5.moveToFirst()){
            tx_stockpro5.setText(file5.getString(0));
        }else{
            tx_stockpro5.setText("producto sin stock.");
        }

        tx_nompro6.setText(obj_pro.getProducto()[5]);
        int codigo6 = obj_pro.getId()[5];
        Cursor file6 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo6,null);
        if (file6.moveToFirst()){
            tx_stockpro6.setText(file6.getString(0));
        }else{
            tx_stockpro6.setText("producto sin stock.");
        }

        tx_nompro7.setText(obj_pro.getProducto()[6]);
        int codigo7 = obj_pro.getId()[6];
        Cursor file7 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo7,null);
        if (file7.moveToFirst()){
            tx_stockpro7.setText(file7.getString(0));
        }else{
            tx_stockpro7.setText("producto sin stock.");
        }

        tx_nompro8.setText(obj_pro.getProducto()[7]);
        int codigo8 = obj_pro.getId()[7];
        Cursor file8 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo8,null);
        if (file8.moveToFirst()){
            tx_stockpro8.setText(file8.getString(0));
        }else{
            tx_stockpro8.setText("producto sin stock.");
        }

        tx_nompro9.setText(obj_pro.getProducto()[8]);
        int codigo9 = obj_pro.getId()[8];
        Cursor file9 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo9,null);
        if (file9.moveToFirst()){
            tx_stockpro9.setText(file9.getString(0));
        }else{
            tx_stockpro9.setText("producto sin stock.");
        }

        tx_nompro10.setText(obj_pro.getProducto()[9]);
        int codigo10 = obj_pro.getId()[9];
        Cursor file10 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo10,null);
        if (file10.moveToFirst()){
            tx_stockpro10.setText(file10.getString(0));
        }else{
            tx_stockpro10.setText("producto sin stock.");
        }

        tx_nompro11.setText(obj_pro.getProducto()[10]);
        int codigo11 = obj_pro.getId()[10];
        Cursor file11 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo11,null);
        if (file11.moveToFirst()){
            tx_stockpro11.setText(file11.getString(0));
        }else{
            tx_stockpro11.setText("producto sin stock.");
        }

        tx_nompro12.setText(obj_pro.getProducto()[11]);
        int codigo12 = obj_pro.getId()[11];
        Cursor file12 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo12,null);
        if (file12.moveToFirst()){
            tx_stockpro12.setText(file12.getString(0));
        }else{
            tx_stockpro12.setText("producto sin stock.");
        }

        tx_nompro13.setText(obj_pro.getProducto()[12]);
        int codigo13 = obj_pro.getId()[12];
        Cursor file13 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo13,null);
        if (file13.moveToFirst()){
            tx_stockpro13.setText(file13.getString(0));
        }else{
            tx_stockpro13.setText("producto sin stock.");
        }

        tx_nompro14.setText(obj_pro.getProducto()[13]);
        int codigo14 = obj_pro.getId()[13];
        Cursor file14 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo14,null);
        if (file14.moveToFirst()){
            tx_stockpro14.setText(file14.getString(0));
        }else{
            tx_stockpro14.setText("producto sin stock.");
        }

        tx_nompro15.setText(obj_pro.getProducto()[14]);
        int codigo15 = obj_pro.getId()[14];
        Cursor file15 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo15,null);
        if (file15.moveToFirst()){
            tx_stockpro15.setText(file15.getString(0));
        }else{
            tx_stockpro15.setText("producto sin stock.");
        }

        tx_nompro16.setText(obj_pro.getProducto()[15]);
        int codigo16 = obj_pro.getId()[15];
        Cursor file16 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo16,null);
        if (file16.moveToFirst()){
            tx_stockpro16.setText(file16.getString(0));
        }else{
            tx_stockpro16.setText("producto sin stock.");
        }

        tx_nompro17.setText(obj_pro.getProducto()[16]);
        int codigo17 = obj_pro.getId()[16];
        Cursor file17 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo17,null);
        if (file17.moveToFirst()){
            tx_stockpro17.setText(file17.getString(0));
        }else{
            tx_stockpro17.setText("producto sin stock.");
        }

        tx_nompro18.setText(obj_pro.getProducto()[17]);
        int codigo18 = obj_pro.getId()[17];
        Cursor file18 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo18,null);
        if (file18.moveToFirst()){
            tx_stockpro18.setText(file18.getString(0));
        }else{
            tx_stockpro18.setText("producto sin stock.");
        }

        tx_nompro19.setText(obj_pro.getProducto()[18]);
        int codigo19 = obj_pro.getId()[18];
        Cursor file19 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo19,null);
        if (file19.moveToFirst()){
            tx_stockpro19.setText(file19.getString(0));
        }else{
            tx_stockpro19.setText("producto sin stock.");
        }

        tx_nompro20.setText(obj_pro.getProducto()[19]);
        int codigo20 = obj_pro.getId()[19];
        Cursor file20 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo20,null);
        if (file20.moveToFirst()){
            tx_stockpro20.setText(file20.getString(0));
        }else{
            tx_stockpro20.setText("producto sin stock.");
        }

        tx_nompro21.setText(obj_pro.getProducto()[20]);
        int codigo21 = obj_pro.getId()[20];
        Cursor file21 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo21,null);
        if (file21.moveToFirst()){
            tx_stockpro21.setText(file21.getString(0));
        }else{
            tx_stockpro21.setText("producto sin stock.");
        }

        tx_nompro22.setText(obj_pro.getProducto()[21]);
        int codigo22 = obj_pro.getId()[21];
        Cursor file22 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo22,null);
        if (file22.moveToFirst()){
            tx_stockpro22.setText(file22.getString(0));
        }else{
            tx_stockpro22.setText("producto sin stock.");
        }

        tx_nompro23.setText(obj_pro.getProducto()[22]);
        int codigo23 = obj_pro.getId()[22];
        Cursor file23 = db.rawQuery("SELECT cantidad FROM stock WHERE codigo="+codigo23,null);
        if (file23.moveToFirst()){
            tx_stockpro23.setText(file23.getString(0));
        }else{
            tx_stockpro23.setText("producto sin stock.");
        }
    }

    public void ingresoStock(View view){
        Bundle bun =getIntent().getExtras();
        String vend =bun.getString("loginVendedor");
        Intent i = new Intent(getBaseContext(), Ingreso_Stock.class);
        Bundle bund = new Bundle();
        bund.putString("vender", vend);
        i.putExtras(bund);
        startActivity(i);
    }

    public void ingresoVenta(View view){
        Bundle bun =getIntent().getExtras();
        String vend =bun.getString("loginVendedor");
        Intent i = new Intent(getBaseContext(), Ingreso_venta.class);
        Bundle bund = new Bundle();
        bund.putString("vender", vend);
        i.putExtras(bund);
        startActivity(i);
    }
}