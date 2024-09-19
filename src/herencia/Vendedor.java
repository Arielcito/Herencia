package herencia;

import java.time.LocalDate;

import interfaces.IPorComision;

public class Vendedor extends Empleado implements IPorComision{

	private Cliente cartera;
	private float comisionPorcentual;

	public Vendedor(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo, Cliente cartera, float comisionPorcentual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.cartera = cartera;
		this.comisionPorcentual = comisionPorcentual;
	}

	@Override
	public float calcularComision() {
		return comisionPorcentual * 0.05f;
	}

	@Override
	public float calcularSueldo() {
		// TODO Auto-generated method stub
		return comisionPorcentual + calcularComision();
	}
	
	
}
