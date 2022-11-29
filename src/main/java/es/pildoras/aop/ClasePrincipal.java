package es.pildoras.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.dao.ClienteDAO;

public class ClasePrincipal {
	public static void main(String[] args) {
		// Leer la configuraci�n de Spring
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		// Obtener el BEAN del contenedor de Spring
		ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);
		//Llamar al m�todo
		elCliente.insertaCliente();
		//Cerrar el contexto
		contexto.close();
	}
}
