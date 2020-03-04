package com.alisson.springboot.di.app.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {
	//@Value /forma de inyeccion de atributos
	
	@Value("${cliente.nombre}")
	private String nombre;

	@Value("${cliente.apellido}")
	private String apellido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
