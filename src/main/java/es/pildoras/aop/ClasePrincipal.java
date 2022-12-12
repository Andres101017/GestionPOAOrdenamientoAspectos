package es.pildoras.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.dao.ClienteDAO;
import es.pildoras.aop.dao.ClienteVIPDAO;

public class ClasePrincipal {
	public static void main(String[] args) {
		// Leer la configuración de Spring
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		// Obtener el BEAN del contenedor de Spring
		ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);
		ClienteVIPDAO elClienteVIP = contexto.getBean("clienteVIPDAO", ClienteVIPDAO.class);
		//Llamar al método
		Cliente cl1 = new Cliente();
		elCliente.insertaCliente(cl1, "Normal"); // Este es el nombre del metodo que debe coincidir con la anotación @Before
		elClienteVIP.insertaClienteVIP(); // Este es el nombre del metodo que debe coincidir con la anotación @Before
		//Cerrar el contexto
		elCliente.setCodigoClienteNormal("56465465465");
		elCliente.setValoracionClienteNormal("Positiva");

		String codigoCl = elCliente.getCodigoClienteNormal();
		String valoraCl = elCliente.getValoracionClienteNormal();
		contexto.close();
	}
}
