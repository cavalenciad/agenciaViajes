package Persona;

import java.time.LocalDate;

public class Administrador extends Persona{

    private String dependencia;
    private double salario;

    public Administrador() {
    }

    public Administrador(int id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String telefono, String dependencia, double salario) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.dependencia = dependencia;
        this.salario = salario;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
