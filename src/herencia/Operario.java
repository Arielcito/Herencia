package herencia;

import java.time.LocalDate;

import interfaces.IPorPresentismo;

public class Operario extends Empleado implements IPorPresentismo{

	private float valorHora;

	public Operario(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo, float valorHora) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.valorHora = valorHora;
	}

	@Override
	public int diasAusente() {
		
		return 0;
	}

	@Override
	public float calcularSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
