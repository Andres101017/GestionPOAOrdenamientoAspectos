package es.pildoras.aop.dao;

import org.springframework.stereotype.Component;

import es.pildoras.aop.Cliente;

@Component
public class ClienteDAO {
	public void insertaCliente(Cliente cliente, String tipo) {
		System.out.println("Trabajo realizado OK, CLiente insertado con éxito.");
	}
}
