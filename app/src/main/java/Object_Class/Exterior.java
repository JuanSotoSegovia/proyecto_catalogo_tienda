package Object_Class;

public class Exterior {

    private int id;
    private String[] nombreExterior = {"Antena modelo aleta de tiburon blanca.","Antena modelo aleta de tiburon negra.",
            "Broche parachoque mediano metalico.","Cinta remolque azul tuning.","Cinta remolque roja tuning.","Gancho remolque recto negro.",
            "Gancho remolque recto rojo.","Guarda fangos de goma 2pzs/4pzs.","Lip parachoque frontal."};
    private int[] precioExterior = {5000, 5000, 4500, 5000, 5000, 9000, 9000, 6000, 8000};
    private int[] precioPackExterior = {10000};
    private String[] detalleExterior = {"Antena modelo aleta de tiburon funcional, color blanco.","Antena modelo aleta de tiburon funcional, color negro.",
            "Broche sujeta parachoque metalico mediano, color negro.","Cinta para remolque tuning, colo azul.","Cinta para remolque tuning, color rojo.",
            "Gancho para remolque recto, color negro.","Gancho para remolque recto, color rojo.","Guarda fangos de goma, color negro, 2pzs/4pzs",
            "Lip para parachoque frontal, marca samurai, modelo fibra de carbono."};

    public Exterior(){
        id = 1;
    }

    public Exterior(int id, String[] nombreExterior, int[] precioExterior, int[] precioPackExterior, String[] detalleExterior) {
        this.id = id;
        this.nombreExterior = nombreExterior;
        this.precioExterior = precioExterior;
        this.precioPackExterior = precioPackExterior;
        this.detalleExterior = detalleExterior;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getNombreExterior() {
        return nombreExterior;
    }

    public void setNombreExterior(String[] nombreExterior) {
        this.nombreExterior = nombreExterior;
    }

    public int[] getPrecioExterior() {
        return precioExterior;
    }

    public void setPrecioExterior(int[] precioExterior) {
        this.precioExterior = precioExterior;
    }

    public int[] getPrecioPackExterior() {
        return precioPackExterior;
    }

    public void setPrecioPackExterior(int[] precioPackExterior) {
        this.precioPackExterior = precioPackExterior;
    }

    public String[] getDetalleExterior() {
        return detalleExterior;
    }

    public void setDetalleExterior(String[] detalleExterior) {
        this.detalleExterior = detalleExterior;
    }
}
