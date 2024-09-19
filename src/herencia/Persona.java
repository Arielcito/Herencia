package herencia;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, long dni, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	private String getNombre() {
		return nombre;
	}
	
	private String getApellido() {
		return apellido;
	}
	
	private long getDni() {
		return dni;
	}
	
	private LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int calcularEdad(LocalDate fecha)  {
		Period periodo = Period.between( fechaNacimiento, fecha);
		return periodo.getYears();
	}
	
	@Override
    public String toString() {
        return "Persona{" +
               "nombre='" + getNombre() + '\'' +
               "apellido='" + getApellido() + '\'' +
               "dni='" + getDni() + '\'' +
               ", fechaNacimiento=" + getFechaNacimiento() +
               ", edad=" + calcularEdad(LocalDate.now()) +
               '}';
    }
}
