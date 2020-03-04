package com.alisson.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alisson.springboot.di.app.domain.ItemFactura;
import com.alisson.springboot.di.app.domain.Producto;
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
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("Camara Sony",100);
		Producto producto2 = new Producto("Bicicleta Blanca",200);
		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,4);
		return Arrays.asList(linea1,linea2);

	}
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {
		Producto producto1 = new Producto("Monitor LG LCD 24",230);
		Producto producto2 = new Producto("Notebook Asus Blanca",500);
		Producto producto3 = new Producto("Impresora HP Multifuncional",80);
		Producto producto4 = new Producto("Escritorio oficina",300);

		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,1);
		ItemFactura linea3 = new ItemFactura(producto3,1);
		ItemFactura linea4 = new ItemFactura(producto4,1);

		return Arrays.asList(linea1,linea2,linea3,linea4);

	}

}
