package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginConAspecto {
	
	//@Pointcut("execution(public * insertaCliente(..))")
	@Pointcut("execution(* es.pildoras.aop.dao.*.*(..))")
	private void paraClientes() {}
	
	// Pointcut para Getters
	@Pointcut("execution(* es.pildoras.aop.dao.*.get*(..))")
	private void paraGetters() {}
	
	// Pointcut para Setters
	@Pointcut("execution(* es.pildoras.aop.dao.*.set*(..))")
	private void paraSetters() {}
	
	// Combinacion de Pointcut
	@Pointcut("paraClientes() && !(paraGetters() || paraSetters())")
	private void paqueteExceptoGetterSetter() {}
	
	//@Before("execution(public void es.pildoras.aop.dao.ClienteVIPDAO.insertaCliente())")
	//@Before("execution(public Void insertaCliente*())")
	//@Before("execution(public String insertaCliente*())")
	//@Before("paraClientes()")
	@Before("paqueteExceptoGetterSetter()")
	public void antesInsertarCliente() {
		System.out.println("El usuario esta logueado.");
		System.out.println("El perfil para insertar clientes es correcto.");
	}
	
	//@Before("paraClientes()")
	public void requisitosCliente() {
		System.out.println("El cliente cumple los requisitos para ser insertado en la base de datos.");
	}
	
	//@Before("paraClientes()")
	public void requisitosTabla() {
		System.out.println("Hay menos de 3000 registros, en al tabla, puedes insertar el nuevo cliente.");

	}
}
