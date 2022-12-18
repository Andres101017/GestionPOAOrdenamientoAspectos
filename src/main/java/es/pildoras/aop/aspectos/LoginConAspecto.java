package es.pildoras.aop.aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import es.pildoras.aop.Cliente;

@Aspect
@Component
@Order(2)
public class LoginConAspecto {
	
	//@Pointcut("execution(public * insertaCliente(..))")
	@Pointcut("execution(* es.pildoras.aop.dao.*.*(..))")
	public void paraClientes() {}
	
	//@Before("execution(public void es.pildoras.aop.dao.ClienteVIPDAO.insertaCliente())")
	//@Before("execution(public Void insertaCliente*())")
	//@Before("execution(public String insertaCliente*())")
	@Before("paraClientes()")
	//@Before("paqueteExceptoGetterSetter()")
	public void antesInsertarCliente(JoinPoint miJoin) {
		System.out.println("El usuario esta logueado.");
		System.out.println("El perfil para insertar clientes es correcto.");
		
		Object[] argumentos = miJoin.getArgs();
		
		for(Object temp:argumentos) {
			if(temp instanceof Cliente) {
				Cliente elCliente=(Cliente)temp;
				
				System.out.println("Nombre del cliente: " + elCliente.getNombre());
				
				System.out.println("Tipo del cliente: " + elCliente.getTipo());
			}
		}
	}
}
