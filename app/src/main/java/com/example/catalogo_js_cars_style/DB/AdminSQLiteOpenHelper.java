package com.example.catalogo_js_cars_style.DB;

import android.content.Context;
//creamos sentencias
import android.database.sqlite.SQLiteDatabase;
//permite crear base de datos
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.List;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    //creamos constructor alt+enter sobre el nobre de la clase contructor de 4 parametros
    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //creamos metodos oncreate y upgrade desde generate
    @Override
    public void onCreate(SQLiteDatabase db) {
        //creamos base de datos
        db.execSQL("CREATE TABLE stock(codigo int primary key, cantidad int)");

        db.execSQL("CREATE TABLE listaDeseos(codigo int primary key, producto text)");

        db.execSQL("CREATE TABLE venta(nVenta int primary key, vendedor text, codigo int, producto text, tipoventa text, cantidad int)");


    }

    //modificar la base de datos
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

}
