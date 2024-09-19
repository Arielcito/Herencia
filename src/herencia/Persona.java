package herencia;

import java.time.LocalDate;
import java.time.Period;
import java.util.GregorianCalendar;

public class Persona {

	protected String nombre;
	protected String apellido;
	protected long dni;
	protected GregorianCalendar  fechaNacimiento;
	
	public Persona(String nombre, String apellido, long dni, GregorianCalendar  fechaNacimiento) {
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
	
	private GregorianCalendar  getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int calcularEdad(LocalDate fecha)  {
		 LocalDate fechaNac = LocalDate.of(
		            fechaNacimiento.get(GregorianCalendar.YEAR),
		            fechaNacimiento.get(GregorianCalendar.MONTH) + 1, 
		            fechaNacimiento.get(GregorianCalendar.DAY_OF_MONTH)
		        );
		        return Period.between(fechaNac, fecha).getYears();
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
