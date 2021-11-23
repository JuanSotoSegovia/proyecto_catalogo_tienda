package Object_Class;

public class Reparaciones {

    private int[] id = {21};
    private String[] nombreReparaciones = {"Kit cierre centralizado 4 puertas."};
    private int[] precioReparaciones = {10000};
    private String[] detalleReparaciones = {"Kit cierre centralizado para 4 puertas."};
    private int[] calificacion = {5};

    public Reparaciones(){

    }

    public Reparaciones(int[] id, String[] nombreReparaciones, int[] precioReparaciones, String[] detalleReparaciones, int[] calificacion) {
        this.id = id;
        this.nombreReparaciones = nombreReparaciones;
        this.precioReparaciones = precioReparaciones;
        this.detalleReparaciones = detalleReparaciones;
        this.calificacion = calificacion;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
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

    public int[] getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int[] calificacion) {
        this.calificacion = calificacion;
    }
}
