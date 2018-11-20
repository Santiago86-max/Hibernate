package ejercicio1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ejercicio1.usuario.Usuario;

public class App {

	public static void main(String[] args) {

        SessionFactory sessionFactory;

        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        
        Usuario user = new Usuario("00002", "Pepe", "prueba@gmail.com");
        
        
        Session session=sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        
        session.close();
        sessionFactory.close();

		
	}
}
