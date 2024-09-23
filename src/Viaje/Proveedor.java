package Viaje;

public class Proveedor {

    private int idProveedor;
    private String nombrePlataforma;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombrePlataforma) {
        this.idProveedor = idProveedor;
        this.nombrePlataforma = nombrePlataforma;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }
}
