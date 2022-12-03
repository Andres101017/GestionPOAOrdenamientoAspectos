package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginConAspecto {
	
	//@Before("execution(public void es.pildoras.aop.dao.ClienteVIPDAO.insertaCliente())")
	//@Before("execution(public Void insertaCliente*())")
	//@Before("execution(public String insertaCliente*())")
	@Before("execution(public * insertaCliente*(..))")
	public void antesInsertar() {
		System.out.println("El usuario esta logueado.");
		System.out.println("El perfil para insertar clientes es correcto.");
	}
}
