package com.alisson.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alisson.springboot.di.app.service.IServicio;
import com.alisson.springboot.di.app.service.MiServicio;
import com.alisson.springboot.di.app.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	@Bean("miServicioSimple")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
}
