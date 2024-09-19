package TestHerencia;

import java.time.LocalDate;

import herencia.Persona;

public class TestHerencia {

	public static void main(String[] args) {
		LocalDate fechaEspecifica = LocalDate.of(2001, 7, 19);
		Persona persona = new Persona("Ariel", "Serato",43515134,fechaEspecifica);
		
		System.out.println(persona.toString());
	}

}
