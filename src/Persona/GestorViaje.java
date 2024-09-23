package Persona;

import java.time.LocalDate;

public class GestorViaje extends Persona{

    private int codigoGestor;
    private double salario;

    public GestorViaje() {
    }

    public GestorViaje(int id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String telefono, int codigoGestor, double salario) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.codigoGestor = codigoGestor;
        this.salario = salario;
    }

    public int getCodigoGestor() {
        return codigoGestor;
    }

    public void setCodigoGestor(int codigoGestor) {
        this.codigoGestor = codigoGestor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
