package Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Persona{

    private String ciudad;
    ArrayList<String> destino = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String telefono, String ciudad) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.ciudad = ciudad;
    }

    public void agregarDestino(String destino){
        this.destino.add(destino);
    }

    public void mostrarDestinos(){
        for (String destino : this.destino) {
            System.out.println(destino);
        }
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
