package Object_Class;

public class Escape {

    private int id;
    private String[] nombreEscape = {"Cola escape doble modelo 407.","Cola escape modelo 146.","Cola escape modelo 233.",
            "Cola escape modelo A-2."};
    private int[] precioEscape = {15000, 10000, 8000, 9000};
    private String[] detalleEscape = {"Cola de escape salida doble cromada, modelo 407, entrada recta.","Cola de escape cromada, modelo 146, entrada recta.",
            "Cola de escape cromada, modelo 233, entrada recta.","Cola de escape cromada, modelo A-2, entrada recta."};

    public Escape(){
        id = 1;
    }

    public Escape(int id, String[] nombreEscape, int[] precioEscape, String[] detalleEscape) {
        this.id = id;
        this.nombreEscape = nombreEscape;
        this.precioEscape = precioEscape;
        this.detalleEscape = detalleEscape;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getNombreEscape() {
        return nombreEscape;
    }

    public void setNombreEscape(String[] nombreEscape) {
        this.nombreEscape = nombreEscape;
    }

    public int[] getPrecioEscape() {
        return precioEscape;
    }

    public void setPrecioEscape(int[] precioEscape) {
        this.precioEscape = precioEscape;
    }

    public String[] getDetalleEscape() {
        return detalleEscape;
    }

    public void setDetalleEscape(String[] detalleEscape) {
        this.detalleEscape = detalleEscape;
    }
}
