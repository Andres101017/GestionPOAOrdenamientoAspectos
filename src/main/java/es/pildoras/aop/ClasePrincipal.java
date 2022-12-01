package es.pildoras.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.dao.ClienteDAO;
import es.pildoras.aop.dao.ClienteVIPDAO;

public class ClasePrincipal {
	public static void main(String[] args) {
		// Leer la configuraci�n de Spring
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		// Obtener el BEAN del contenedor de Spring
		ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);
		ClienteVIPDAO elClienteVIP = contexto.getBean("clienteVIPDAO", ClienteVIPDAO.class);
		//Llamar al m�todo
		elCliente.insertaCliente(); // Este es el nombre del metodo que debe coincidir con la anotaci�n @Before
		elClienteVIP.insertaClienteVIP(); // Este es el nombre del metodo que debe coincidir con la anotaci�n @Before
		//Cerrar el contexto
		contexto.close();
	}
}
