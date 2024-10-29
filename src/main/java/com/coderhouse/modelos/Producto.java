package com.coderhouse.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Productos")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nombre;
	
	@ManyToMany(fetch= FetchType.EAGER)
	@JoinTable(
			name="producto_cliente", 
			joinColumns = @JoinColumn(name="producto_id"),
			inverseJoinColumns= @JoinColumn(name="cliente_id")
			)
	private List<Cliente> clientes= new ArrayList<>();
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Venta venta;

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Producto(String nombre, Venta venta) {
		super();
		this.nombre = nombre;
		this.venta=venta;
		
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	
	
	public Venta getVenta() {
		return venta;
	}



	public void setVenta(Venta venta) {
		this.venta = venta;
	}



	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", clientes=" + clientes + ", venta=" + venta + "]";
	}



	
	
	
}
