package Object_Class;

import java.util.Arrays;
import java.util.Collections;

public class Productos {

    private String[] producto = {"Cola escape doble modelo 407.","Cola escape modelo 146.","Cola escape modelo 233.",
            "Cola escape modelo A-2.", "Antena modelo aleta de tiburon blanca.","Antena modelo aleta de tiburon negra.",
            "Broche parachoque mediano metalico.","Cinta remolque azul tuning.","Cinta remolque roja tuning.","Gancho remolque recto negro.",
            "Gancho remolque recto rojo.","Guarda fangos de goma 2pzs/4pzs.","Lip parachoque frontal.","Broche parachoque grande metalico."
            ,"Ampolleta halogena golden modelo 880.", "Ampolleta halogena golden modelo 9006.",
            "Ampolleta LED T10 modelo diamante.","Ampolleta LED T10 RGB + control remoto.","Cinta LED sobre puesta bi-funcional.",
            "Ojos de aguila LED.","Tercera luz de freno triangular.","Ampolleta halogena golden modelo H4.","Kit cierre centralizado 4 puertas."};

    private int[] id = {1,2,3,4,5,6,7,8,9,10,11,12,13,22,14,15,16,17,18,19,20,23,21};

    public Productos() {

    }

    public Productos(String[] producto, int[] id) {
        this.producto = producto;
        this.id = id;
    }

    public String[] getProducto() {
        return producto;
    }

    public void setProducto(String[] producto) {
        this.producto = producto;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }
}
