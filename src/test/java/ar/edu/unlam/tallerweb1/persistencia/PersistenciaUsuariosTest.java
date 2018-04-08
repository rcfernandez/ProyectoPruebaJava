package ar.edu.unlam.tallerweb1.persistencia;

import static org.junit.Assert.assertThat;

import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public class PersistenciaUsuariosTest extends SpringTest
{
	
	@Test
	public void guardarUsuario()
	{
	
		Usuario seba = new Usuario();
		
		//seba.setId(1);
		seba.setEmail("admin@admin.com");
		seba.setPassword("1234");
		seba.setRol("admin");

		Session sesion = getSession();
		
		sesion.save(seba);

		Usuario buscado = sesion.get(Usuario.class,seba.getId());
		

		Assert.assertThat(buscado).IsNotNull;
		

	}
	
}

/*
public class PersistenciaUsuarioTest extends SpringTest {

	@Test
    @Transactional @Rollback(true)
    public void guardarUsuario()
	{
		Usuario usu = new Usuario();
		
		
		//usu.setId(id);
		usu.setEmail("admin@admin.com");
		usu.setPassword("1234");
		usu.setRol("admin");
		
		
		Session session = getSession();
		session.save(usu);
		
		Usuario buscado = session.get(Usuario.class, usu.getId());
		
		(assertThat(buscado).isnotNull);
		
    }
	
}

*/
