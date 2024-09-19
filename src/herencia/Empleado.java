package herencia;

import java.time.LocalDate;

public class Empleado extends Persona {
	private long legajo;
	
	public Empleado(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.legajo = legajo;
		
	}

	private long getLegajo() {
		return legajo;
	}
	
	public float calcularSueldo() {
		return 0;
	}

}
