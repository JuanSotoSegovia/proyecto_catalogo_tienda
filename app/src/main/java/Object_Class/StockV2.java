package Object_Class;

public class StockV2 {
    private int[] ids = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
    private String[] productos = {"Cola escape doble modelo 407.","Cola escape modelo 146.","Cola escape modelo 233."
            ,"Cola escape modelo A-2.","Antena modelo aleta de tiburon blanca."
            ,"Antena modelo aleta de tiburon negra.","Broche parachoque grande metalico."
            ,"Broche parachoque mediano metalico.","Cinta remolque azul tuning."
            ,"Cinta remolque roja tuning.","Gancho remolque recto negro.","Gancho remolque recto rojo."
            ,"Guarda fangos de goma 2pzs/4pzs.","Lip parachoque frontal."
            ,"Ampolleta halogena golden modelo 880.","Ampolleta halogena golden modelo 9006."
            ,"Ampolleta halogena golden modelo H4.","Ampolleta LED T10 modelo diamante."
            ,"Ampolleta LED T10 RGB + control remoto.","Cinta LED para focos sobre puesta bi-funcional."
            ,"Ojos de aguila LED.","Tercera luz de freno triangular.","Kit cierre centralizado 4 puertas."};
    private int[] stocks = {1,3,2,1,2,5,2,1,2,1,2,0,1,2,3,4,0,3,5,4,1,0,1};

    public StockV2() {
    }

    public StockV2(int[] ids, String[] productos, int[] stocks) {
        this.ids = ids;
        this.productos = productos;
        this.stocks = stocks;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public int[] getStocks() {
        return stocks;
    }

    public void setStocks(int[] stocks) {
        this.stocks = stocks;
    }
}
