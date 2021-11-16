package com.builderPatternBootcamp.entities;

public class Builder implements BuilderInterface {

	
	private String nombre;
	private String apellido;
	private int edad;
	private int docId;
	
	public Builder (int docId) {
		this.docId = docId;
	}
	
	public Builder withNombre(String nombre) {
		this.nombre = nombre;	
		return this;
	}

	public Builder withApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

	public Builder withEdad(int edad) {
		this.edad = edad;
		return this;
	}

	@Override
	public Persona build() {
		
		Persona persona = new Persona();
		persona.setDocId(docId);
		persona.setNombre(this.nombre);
		persona.setApellido(this.apellido);
		persona.setEdad(this.edad);
		return persona;
	}

	
	

	
	
	
}
