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
import Object_Class.Ventas;

public class Ingreso_venta extends AppCompatActivity {

    private TextView vendedor, cargo;
    private Spinner sp_vendedor, sp_producto, sp_tipoventa;
    private EditText cant;

    Vendedores obj_ven = new Vendedores();
    Productos obj_pro = new Productos();
    Ventas obj_vent = new Ventas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_venta);

        vendedor = (TextView)findViewById(R.id.txt_nomVendedorAdmin);
        cargo = (TextView)findViewById(R.id.txt_cargoVenAdmin);

        sp_vendedor = (Spinner)findViewById(R.id.sp_Vendedor);
        sp_producto = (Spinner)findViewById(R.id.sp_producto2);
        sp_tipoventa = (Spinner)findViewById(R.id.sp_tipoventa);
        cant = (EditText)findViewById(R.id.edt_cantidad);

        Bundle bun =getIntent().getExtras();
        String vend =bun.getString("vender");

        for (int i = 0 ; i <= obj_ven.getIds().length ; i++){
            if (vend.equals(obj_ven.getUsuarios()[i])){
                vendedor.setText("Nombre: " + obj_ven.getNombreApe()[i]);
                cargo.setText("Cargo: " + obj_ven.getCargo()[i]);
                break;
            }
        }

        ArrayAdapter adapterVendedor = new ArrayAdapter(this, android.R.layout.simple_list_item_1, obj_ven.getNombreApe());
        sp_vendedor.setAdapter(adapterVendedor);

        ArrayAdapter adapterProducto = new ArrayAdapter(this, android.R.layout.simple_list_item_1, obj_pro.getProducto());
        sp_producto.setAdapter(adapterProducto);

        ArrayAdapter adapterVenta = new ArrayAdapter(this, android.R.layout.simple_list_item_1, obj_vent.getTipoVenta());
        sp_tipoventa.setAdapter(adapterVenta);

    }

    public void cargarVenta (View view){
        try {

            String vendedorSeleccionado = sp_vendedor.getSelectedItem().toString();
            String productoSeleccionado = sp_producto.getSelectedItem().toString();
            String tipoVentaSeleccionada = sp_tipoventa.getSelectedItem().toString();

            int cantidad = Integer.parseInt(cant.getText().toString());

            int v1 = obj_vent.getnVenta()[0];
            int v2 = obj_vent.getnVenta()[1];
            int v3 = obj_vent.getnVenta()[2];
            int v4 = obj_vent.getnVenta()[3];
            int v5 = obj_vent.getnVenta()[4];


            if (vendedorSeleccionado.equals(obj_ven.getNombreApe()[0])){
                Toast.makeText(getBaseContext(), "El vendedor " + obj_ven.getNombreApe()[0] + " es el administrador. No posee derecho a ventas", Toast.LENGTH_LONG).show();
            }

            else if (vendedorSeleccionado.equals(obj_ven.getNombreApe()[1])){
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getBaseContext(), "catalogoJ.S", null, 1);
                SQLiteDatabase db = admin.getWritableDatabase();

                if (cantidad != 0){
                    int id = obj_ven.getIds()[1];
                    ContentValues cont = new ContentValues();
                    cont.put("nVenta", v1);
                    cont.put("vendedor", vendedorSeleccionado);
                }

            }

            else if (vendedorSeleccionado.equals(obj_ven.getNombreApe()[2])){

            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}