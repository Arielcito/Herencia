package herencia;

import java.time.LocalDate;

public class Vendedor extends Empleado {

	private Cliente cartera;
	private float comisionPorcentual;

	public Vendedor(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo, Cliente cartera, float comisionPorcentual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.cartera = cartera;
		this.comisionPorcentual = comisionPorcentual;
	}
	
	
}
