package herencia;

import java.time.LocalDate;

public class Operario extends Empleado {

	private float valorHora;

	public Operario(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo, float valorHora) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.valorHora = valorHora;
	}

}
