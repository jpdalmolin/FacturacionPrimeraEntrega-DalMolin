package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.modelos.Cliente;
import com.coderhouse.modelos.Producto;
import com.coderhouse.modelos.Venta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void createCliente(Cliente cliente) {
		em.persist(cliente);
	}
	@Transactional
	public void createProducto(Producto producto) {
		em.persist(producto);
	}
	@Transactional
	public void createVenta(Venta venta) {
		em.persist(venta);
	}
}
