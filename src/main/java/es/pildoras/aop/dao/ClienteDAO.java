package es.pildoras.aop.dao;

import org.springframework.stereotype.Component;

import es.pildoras.aop.Cliente;

@Component
public class ClienteDAO {
	public void insertaCliente(Cliente cliente, String tipo) {
		System.out.println("Trabajo realizado OK, CLiente insertado con éxito.");
	}
	
	
	public String getValoracionClienteNormal() {
		System.out.println("Obteniendo valoración del Cliente.");
		return valoracionClienteNormal;
	}
	public void setValoracionClienteNormal(String valoracionClienteNormal) {
		System.out.println("Estableciendo valoración del Cliente.");
		this.valoracionClienteNormal = valoracionClienteNormal;
	}
	public String getCodigoClienteNormal() {
		System.out.println("Obteniendo Código del Cliente.");
		return codigoClienteNormal;
	}
	public void setCodigoClienteNormal(String codigoClienteNormal) {
		System.out.println("Estableciendo Código del Cliente.");
		this.codigoClienteNormal = codigoClienteNormal;
	}


	private String valoracionClienteNormal;
	private String codigoClienteNormal;
}
