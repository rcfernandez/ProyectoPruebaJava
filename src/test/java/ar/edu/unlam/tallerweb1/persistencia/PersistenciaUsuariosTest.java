package ar.edu.unlam.tallerweb1.persistencia;

import static org.assertj.core.api.Assertions.assertThat;
import org.hibernate.Session;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public class PersistenciaUsuariosTest extends SpringTest
{
	
	@Test
	@Transactional
	public void CrearUsuario()
	{
	
		Usuario seba = new Usuario();
		
		//seba.setId((long) 1);
		seba.setEmail("admin@admin.com");
		seba.setPassword("1234");
		seba.setRol("admin");

		Session sesion = getSession();
		
		sesion.save(seba);

		Usuario buscado = sesion.get(Usuario.class,seba.getId());
		
		assertThat(buscado).isNotNull();

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
