package TestHerencia;

import java.time.LocalDate;

import herencia.Administrativo;
import herencia.Cliente;
import herencia.Operario;
import herencia.Persona;
import herencia.Vendedor;
import test.Cobrador;

public class TestHerencia {

	public static void main(String[] args) {
		 // Crear una instancia de Cliente
        Cliente  cliente1 = new Cliente("Juan", "Perez", 12345678L, new GregorianCalendar(1985, 5, 15), "20-12345678-9", 50000.0f);
        System.out.println("Cliente: " + cliente1.estadoCredito());

        // Crear una instancia de Cobrador
        Cobrador cobrador1 = new Cobrador("Carlos", "Lopez", 87654321L, new GregorianCalendar(1990, 3, 10), 1001L, cliente1, 5000.0f);
        System.out.println("Cobrador Sueldo: " + cobrador1.calcularSueldo());

        // Crear una instancia de Vendedor
        Vendedor vendedor1 = new Vendedor("Ana", "Gomez", 11223344L, new GregorianCalendar(1992, 7, 20), 1002L, cliente1, 0.10f);
        System.out.println("Vendedor Sueldo: " + vendedor1.calcularSueldo());

        // Crear una instancia de Administrativo
        Administrativo admin1 = new Administrativo("María", "Rodriguez", 55667788L, new GregorianCalendar(1980, 2, 25), 1003L, 30000.0f);
        System.out.println("Administrativo Sueldo: " + admin1.calcularSueldo());

        // Crear una instancia de Operario
        Operario operario1 = new Operario("Pedro", "Gonzalez", 99887766L, new GregorianCalendar(1995, 9, 5), 1004L, 200.0f);
        System.out.println("Operario Sueldo: " + operario1.calcularSueldo());

        // Calcular edades de las personas
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Edad de Cliente: " + cliente1.calcularEdad(fechaActual));
        System.out.println("Edad de Cobrador: " + cobrador1.calcularEdad(fechaActual));
        System.out.println("Edad de Vendedor: " + vendedor1.calcularEdad(fechaActual));
        System.out.println("Edad de Administrativo: " + admin1.calcularEdad(fechaActual));
        System.out.println("Edad de Operario: " + operario1.calcularEdad(fechaActual));
	}

}
