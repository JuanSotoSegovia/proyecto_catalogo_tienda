package com.example.catalogo_js_cars_style;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.catalogo_js_cars_style.DB.AdminSQLiteOpenHelper;


import Object_Class.Productos;

import Object_Class.Vendedores;

public class Ingreso_Stock extends AppCompatActivity {

    private TextView vendedor, cargo, tx;
    private Spinner sp_pro;
    private EditText cant;

    Vendedores obj_ven = new Vendedores();
    Productos pro =new Productos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_stock);

        vendedor = (TextView)findViewById(R.id.txt_nomVendedorAdmin);
        cargo = (TextView)findViewById(R.id.txt_cargoVenAdmin);

        sp_pro = (Spinner)findViewById(R.id.sp_producto);
        tx = (TextView)findViewById(R.id.textView37);
        cant = (EditText)findViewById(R.id.edt_ing_cantidad);

        Bundle bun =getIntent().getExtras();
        String vend =bun.getString("vender");

        for (int i = 0 ; i <= obj_ven.getIds().length ; i++){
            if (vend.equals(obj_ven.getUsuarios()[i])){
                vendedor.setText("Nombre: " + obj_ven.getNombreApe()[i]);
                cargo.setText("Cargo: " + obj_ven.getCargo()[i]);
                break;
            }
        }

        ArrayAdapter adapterPro = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pro.getProducto());
        sp_pro.setAdapter(adapterPro);
    }

    public void carga(View view){

            try {
                for (int i  = 0 ; i <= pro.getProducto().length ; i++) {
                    if (sp_pro.getSelectedItem().toString().equals(pro.getProducto()[i])) {
                        tx.setText(pro.getId()[i] + ". " + sp_pro.getSelectedItem().toString());
                        //insertar datos
                        //nos traemos el constructor para instanciar (obtenemos base de datos)
                        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getBaseContext(), "catalogoJ.S", null, 1);
                        //damos permisos de sobre escritura
                        SQLiteDatabase db = admin.getWritableDatabase();

                        //recoleccion de datos
                        int codigo = pro.getId()[i];
                        int cantidad = Integer.parseInt(cant.getText().toString());

                        if (cantidad != 0) {
                            ContentValues cont = new ContentValues(); //contener valores
                            //nombre en base de datos y nombre a rellenar
                            cont.put("codigo", codigo);
                            cont.put("cantidad", cantidad);
                            db.insert("stock", null, cont);
                            limpiarCampo();
                            db.close();
                            Toast.makeText(getBaseContext(), "Ha ingresado Stock al producto: " + codigo + ". " + sp_pro.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                        }
                        else{

                            Toast.makeText(getBaseContext(), "Ingrese cantidad distinta a 0", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }catch (Exception e){
                System.out.println(e);
            }




    }

    public void limpiarCampo (){
        cant.setText("");

    }
}