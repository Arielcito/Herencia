package herencia;

import java.time.LocalDate;

import interfaces.IPorPresentismo;

public class Administrativo extends Empleado implements IPorPresentismo {

	private float sueldoMensual;

	public Administrativo(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo, float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.sueldoMensual = sueldoMensual;
	}

	@Override
	public int diasAusente() {
		return 0;
	}

	@Override
	public float calcularSueldo() {
		return sueldoMensual - (diasAusente() * 100);
	}

}
