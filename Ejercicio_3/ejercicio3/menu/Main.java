package ejercicio3.menu;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import ejercicio3.asistencia.AsistenciaMedica;
import ejercicio3.seguro.Enfermedades;
import ejercicio3.seguro.Seguro;


public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
        SessionFactory sessionFactory;
        Set<AsistenciaMedica> asistenciaMedica = new HashSet<>();
        Enfermedades e = new Enfermedades(1,1,1,1,"Todo mal");
        Seguro s = new Seguro(6, "1", "Pedro", 23, 0, new Date(System.currentTimeMillis()),asistenciaMedica,e);
        asistenciaMedica.add(new AsistenciaMedica(6, s , "Hola", "Madrid"));
        
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session sesion = sessionFactory.openSession();
        
        //sesion.beginTransaction();
        
        //sesion.save(new AsistenciaMedica(2,s,"adios","Madrid"));
        //sesion.save(s);
        String linea = "6";
        Query query = sesion.createQuery("Select c from Seguro c where idSeguro =  6");
        
        ArrayList<Seguro> seguros = (ArrayList<Seguro>) query.list();
        
        seguros.forEach(a -> a.verDatos());
        
        Seguro seg1 = (Seguro)sesion.createQuery("Select c from Seguro c where idSeguro =  6").uniqueResult();
       
        seg1.setEdad(45);
        
        sesion.delete(seg1);
        //seguros.forEach(a -> a.setIdSeguro(8));
        //sesion.getTransaction().commit(); ///Quita enlace
      
       
        seguros.forEach(a -> a.verDatos());
        
		sesion.close();
		sessionFactory.close();
		
	}
}
