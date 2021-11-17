package Object_Class;

public class Reparaciones {

    private int id;
    private String[] nombreReparaciones = {"Kit cierre centralizado 4 puertas."};
    private int[] precioReparaciones = {10000};
    private String[] detalleReparaciones = {"Kit cierre centralizado para 4 puertas."};

    public Reparaciones(){
        id = 1;
    }

    public Reparaciones(int id, String[] nombreReparaciones, int[] precioReparaciones, String[] detalleReparaciones) {
        this.id = id;
        this.nombreReparaciones = nombreReparaciones;
        this.precioReparaciones = precioReparaciones;
        this.detalleReparaciones = detalleReparaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getNombreReparaciones() {
        return nombreReparaciones;
    }

    public void setNombreReparaciones(String[] nombreReparaciones) {
        this.nombreReparaciones = nombreReparaciones;
    }

    public int[] getPrecioReparaciones() {
        return precioReparaciones;
    }

    public void setPrecioReparaciones(int[] precioReparaciones) {
        this.precioReparaciones = precioReparaciones;
    }

    public String[] getDetalleReparaciones() {
        return detalleReparaciones;
    }

    public void setDetalleReparaciones(String[] detalleReparaciones) {
        this.detalleReparaciones = detalleReparaciones;
    }
}
