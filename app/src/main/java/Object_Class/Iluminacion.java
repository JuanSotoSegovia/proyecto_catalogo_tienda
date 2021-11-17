package Object_Class;

public class Iluminacion {

    private int id;
    private String[] nombreIluminacion = {"Ampolleta halogena golden modelo 880.", "Ampolleta halogena golden modelo 9006.",
            "Ampolleta LED T10 modelo diamante.","Ampolleta LED T10 RGB + control remoto.","Cinta LED sobre puesta bi-funcional.",
            "Ojos de aguila LED.","Tercera luz de freno triangular."};
    private int[] precioIluminacion = {7000, 8000, 2000, 4500, 10000, 4500, 4500};
    private String[] descripcionIluminacion = {"Ampolleta halogena golden, modelo 880, emision de luz golden (par).",
            "Ampolleta halogena golden, modelo 9006, emision de luz golden (par).", "Ampolleta LED T10, cola de pescado, modelo diamante, emisio de luz blanca (par).",
            "Ampolleta LED T10, cola de pescado RGB + control remoto para cambio de color.","Cinta LED para focos delanteros sobre puesta, bi-funcional, emision de luz blanca para posicion y luz amarilla para direccionales.",
            "Ojos de aguila LED, cuerpo cromado, emision de luz blanca.","Tercera luz de freno triangular auxiliar."};


    public Iluminacion(){

    }

    public Iluminacion(int id, String[] nombreIluminacion, String[] descripcionIluminacion, int[] precioIluminacion) {
        this.id = id;
        this.nombreIluminacion = nombreIluminacion;
        this.descripcionIluminacion = descripcionIluminacion;
        this.precioIluminacion = precioIluminacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getNombreIluminacion() {
        return nombreIluminacion;
    }

    public void setNombreIluminacion(String[] nombreIluminacion) {
        this.nombreIluminacion = nombreIluminacion;
    }

    public int[] getPrecioIluminacion() {
        return precioIluminacion;
    }

    public void setPrecioIluminacion(int[] precioIluminacion) {
        this.precioIluminacion = precioIluminacion;
    }

    public String[] getDescripcionIluminacion() {
        return descripcionIluminacion;
    }

    public void setDescripcionIluminacion(String[] descripcionIluminacion) {
        this.descripcionIluminacion = descripcionIluminacion;
    }
}
