package com.example.catalogo_js_cars_style;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;

import Object_Class.Vendedores;

public class caja_vendedores extends AppCompatActivity {

    private TextView vendedor, cargo;
    private VideoView videoCaja;
    Vendedores obj_ven = new Vendedores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caja_vendedores);

        vendedor = (TextView)findViewById(R.id.txt_nomVendedorCaja);
        cargo = (TextView)findViewById(R.id.txt_cargoVenCaja);
        videoCaja = (VideoView)findViewById(R.id.vw_caja);

        //rura para llamar el video
        String ruta = "android.resource://" + getPackageName() + "/" + R.raw.videoinsentivo;
        Uri uri =  Uri.parse(ruta); //parseo la ruta

        videoCaja.setVideoURI(uri);

        //inicio video automatico
        videoCaja.start();

        //loop para reproducir el video.
        videoCaja.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        Bundle bun =getIntent().getExtras();
        String vend =bun.getString("vender");

        for (int i = 0 ; i <= obj_ven.getIds().length ; i++){
            if (vend.equals(obj_ven.getUsuarios()[i])){
                vendedor.setText("Nombre: " + obj_ven.getNombreApe()[i]);
                cargo.setText("Cargo: " + obj_ven.getCargo()[i]);
                break;
            }
        }
    }
}