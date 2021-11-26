package Object_Class;

public class Ventas {
    private int[] nVenta = {1,2,3,4,5};
    private int[] id = {1,2};
    private String[] tipoVenta = {"Efectivo","Virtual"};

    public Ventas(){

    }

    public Ventas(int[] nVenta, int[] id, String[] tipoVenta) {
        this.nVenta = nVenta;
        this.id = id;
        this.tipoVenta = tipoVenta;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    public String[] getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String[] tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public int[] getnVenta() {
        return nVenta;
    }

    public void setnVenta(int[] nVenta) {
        this.nVenta = nVenta;
    }
}
