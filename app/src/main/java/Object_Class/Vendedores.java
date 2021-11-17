package Object_Class;

public class Vendedores {

    private int[] ids = {1};
    private String[] usuarios = {"Juan","Claudia","Cristobal"};
    private String[] passwords = {"Juan123","Clau21","Cris21"};

    private String[] nombreApe = {"Juan Soto","Claudia Prado","Cristobal Cerda"};

    public Vendedores(){

    }

    public Vendedores(int[] ids, String[] usuarios, String[] passwords, String[] nombreApe) {
        this.ids = ids;
        this.usuarios = usuarios;
        this.passwords = passwords;
        this.nombreApe = nombreApe;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    public String[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String[] usuarios) {
        this.usuarios = usuarios;
    }

    public String[] getPasswords() {
        return passwords;
    }

    public void setPasswords(String[] passwords) {
        this.passwords = passwords;
    }

    public String[] getNombreApe() {
        return nombreApe;
    }

    public void setNombreApe(String[] nombreApe) {
        this.nombreApe = nombreApe;
    }
}
