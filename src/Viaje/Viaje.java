package Viaje;

public class Viaje {

    private int idViaje;
    private String ciudad;

    public Viaje() {
    }

    public Viaje(int idViaje, String ciudad) {
        this.idViaje = idViaje;
        this.ciudad = ciudad;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
