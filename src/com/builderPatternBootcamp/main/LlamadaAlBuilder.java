package com.builderPatternBootcamp.main;

import com.builderPatternBootcamp.entities.Builder;
import com.builderPatternBootcamp.entities.Persona;

public class LlamadaAlBuilder {

	public static void main(String[] args) {


		Builder builder = new Builder(1234567);
		
		Persona persona = builder.withNombre("Massimiliano")
		.withApellido("Utzeri")
		.withEdad(28)
		.build();
		
		System.out.println(persona);

	}

}
