package es.pildoras.aop.dao;

import org.springframework.stereotype.Component;

import es.pildoras.aop.Cliente;

@Component
public class ClienteDAO {
	public void insertaCliente(Cliente cliente, String tipo) {
		System.out.println("Trabajo realizado OK, CLiente insertado con �xito.");
	}
	
	
	public String getValoracionClienteNormal() {
		System.out.println("Obteniendo valoraci�n del Cliente.");
		return valoracionClienteNormal;
	}
	public void setValoracionClienteNormal(String valoracionClienteNormal) {
		System.out.println("Estableciendo valoraci�n del Cliente.");
		this.valoracionClienteNormal = valoracionClienteNormal;
	}
	public String getCodigoClienteNormal() {
		System.out.println("Obteniendo C�digo del Cliente.");
		return codigoClienteNormal;
	}
	public void setCodigoClienteNormal(String codigoClienteNormal) {
		System.out.println("Estableciendo C�digo del Cliente.");
		this.codigoClienteNormal = codigoClienteNormal;
	}


	private String valoracionClienteNormal;
	private String codigoClienteNormal;
}
