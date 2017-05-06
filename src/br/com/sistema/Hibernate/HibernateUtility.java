package br.com.sistema.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.com.sistema.Entidades.Agencia;



public class HibernateUtility {

	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration();
		  
		  
		
		/*MAPEAMENTO DAS CLASS QUE USARAM O HIBERNATE*/
		
		configuration.addAnnotatedClass(Agencia.class);
		//configuration.addAnnotatedClass(Bairro.class);
		//configuration.addAnnotatedClass(Cidade.class);
		//configuration.addAnnotatedClass(Contato.class);
		//configuration.addAnnotatedClass(Endereco.class);
		//configuration.addAnnotatedClass(Estado.class);
		//configuration.addAnnotatedClass(Pessoa.class);
		//configuration.addAnnotatedClass(PessoaFisica.class);
		//configuration.addAnnotatedClass(PessoaJuridica.class);
		//configuration.addAnnotatedClass(Terminal.class);
		//configuration.addAnnotatedClass(Usuario.class);
		
		
		configuration.configure();
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = serviceRegistryBuilder
				.buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}

	public static Session getSession() {
		Session session = sessionFactory.openSession();
		return session;
	}

}