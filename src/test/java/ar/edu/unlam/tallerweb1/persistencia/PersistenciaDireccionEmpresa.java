package ar.edu.unlam.tallerweb1.persistencia;

import static org.junit.Assert.assertSame;

import org.hibernate.Session;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Direccion;
import ar.edu.unlam.tallerweb1.modelo.Empresa;

public class PersistenciaDireccionEmpresa extends SpringTest {

	@Test
	@Transactional
	public void relacionEmpresaDireccion()
	{
	
		Direccion direccion = new Direccion();
		direccion.setCalle("Calle falsa");
		direccion.setNumero("1234");
			
		Empresa empresa = new Empresa();
		empresa.setNombre("Intel Corporation");
		empresa.setDireccion(direccion);
				

		Session sesion = getSession();
		
		sesion.save(direccion);
		sesion.save(empresa);
		
		
		Empresa empresabuscada = sesion.get(Empresa.class,empresa.getDireccion().getCalle());
		
		Direccion direccionbuscada = sesion.get(Direccion.class,direccion.getCalle());
		
		assertSame(empresabuscada, direccionbuscada);
		
		
		
		//assertThat(sesion.get(Empresa.class,direccion.getId()).equals(sesion.get(Direccion.class,direccion.getId());
		
		

	}
	
	
}
