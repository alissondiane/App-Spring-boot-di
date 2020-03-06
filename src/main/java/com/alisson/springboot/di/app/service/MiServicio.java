package com.alisson.springboot.di.app.service;


//@Service("miServicioSimple")
//@Primary
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante simple...";
	}	
}
