package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.modelos.Cliente;
import com.coderhouse.modelos.Producto;
import com.coderhouse.modelos.Venta;

@SpringBootApplication
public class Clase08Application implements CommandLineRunner {
	
	@Autowired
	private DaoFactory dao;
	
	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}
	
	@Override
	public void run(String... arg) throws Exception {
		try {
			
			Venta venta1= new Venta("Venta1");
			Venta venta2= new Venta("Venta2");
			
					
			Producto producto1=new Producto("Procesador",venta1);
			Producto producto2=new Producto("Mother",venta2);
			Producto producto3=new Producto("PlacaVideo",venta1);
					
			Cliente cliente1=new Cliente("juan","dalmo", 4564564, "L654565");
			Cliente cliente2=new Cliente("fede","nahue", 123123213, "L122135");
			Cliente cliente3=new Cliente("bruno","tardeli", 45645264, "L6542565");
			
			dao.createVenta(venta1);
			dao.createVenta(venta2);
			
			dao.createCliente(cliente3);
			dao.createCliente(cliente2);
			dao.createCliente(cliente1);
			
			dao.createProducto(producto3);
			dao.createProducto(producto2);
			dao.createProducto(producto1);
			
		}catch(Exception e) {
			e.printStackTrace(System.err);
		}
		
	}
}
