import Persona.Administrador;
import Persona.Cliente;
import Persona.GestorViaje;
import Viaje.Viaje;
import Viaje.Proveedor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Instancia y seteo clientes

        Cliente cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNombre("Camilo");
        cliente1.setApellido("Valencia");
        cliente1.setDireccion("Carrera 1 # 2-3");
        cliente1.setTelefono("1234567890");
        cliente1.setCiudad("Medellin");

        Cliente cliente2 = new Cliente(2, "Carlos", "Valederrama", LocalDate.of(1965, 12, 01),"Calle 2 # 3-4", "0987654321", "Barranquilla");

        // Instancia y seteo administradores

        Administrador admin1 = new Administrador();
        admin1.setId(1);
        admin1.setNombre("Joaquin");
        admin1.setApellido("Bedoya");
        admin1.setDireccion("Calle 3 # 4-5");
        admin1.setTelefono("0987654321");
        admin1.setSalario(1000000.0);
        admin1.setDependencia("Gerencia");

        Administrador admin2 = new Administrador(2, "René", "Higita", LocalDate.of(1980, 10, 15), "Carrera 4 # 5-6", "1234567890", "Contabilidad", 2000000.0);

        // Instancia y seteo gestores

        GestorViaje gestor1 = new GestorViaje();
        gestor1.setId(1);
        gestor1.setNombre("Olga");
        gestor1.setApellido("Ramirez");
        gestor1.setDireccion("Calle 5 # 6-7");
        gestor1.setTelefono("1234567890");
        gestor1.setSalario(1500000.0);
        gestor1.setCodigoGestor(1201);

        GestorViaje gestor2 = new GestorViaje(2, "Luisa", "Gomez", LocalDate.of(1990, 05, 20), "Carrera 6 # 7-8", "0987654321", 1202, 1800000.0);

        // Instancia y seteo viajes

        Viaje viaje1 = new Viaje();
        viaje1.setIdViaje(1);
        viaje1.setCiudad("Bogotá");

        Viaje viaje2 = new Viaje(2, "New York");

        // Instancia y seteo proveedor

        Proveedor proveedor1 = new Proveedor();
        proveedor1.setIdProveedor(1);
        proveedor1.setNombrePlataforma("Booking");

        Proveedor proveedor2 = new Proveedor(2, "Airbnb");

    }
}