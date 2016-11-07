package br.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TesteEstudante {
	
	private static SessionFactory f;
	private static Session s;

	public static void main(String[] args) {
		
		//Cria Session Factory
		f = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Estudante.class)
							.buildSessionFactory();

		try {
			TesteEstudante t = new TesteEstudante();
			t.salva();
			t.lista();
			t.pegar();
			t.altera();
			t.remove();
		} finally {
			f.close();
		}
	}
	
	public void lista() {
		//Cria Session
		s = f.getCurrentSession();
		System.out.println("listar");
		//Inicia a Session
		s.beginTransaction();
		//Pega o objeto Estudante
		List<Estudante> l = s.createQuery("from Estudante").list();
		//Exibe o Estudantes
		for (Estudante e : l) {
			System.out.println(e.toString());
		}
		//Comita a transação
		s.getTransaction().commit();
		System.out.println("ok");
	}
	
	public void pegar() {
		//Cria Session
		s = f.getCurrentSession();
		System.out.println("pegar");
		//Inicia a Session
		s.beginTransaction();
		//Pega o objeto Estudante
		Estudante e = s.get(Estudante.class, 0);
		//Exibe o Estudante
		System.out.println(e.toString());
		//Comita a transação
		s.getTransaction().commit();
		System.out.println("ok");
	}
	
	public void remove() {
		//Cria Session
		s = f.getCurrentSession();
		System.out.println("remove");
		//Inicia a Session
		s.beginTransaction();
		//Pega o objeto Estudante
		Estudante e = s.get(Estudante.class, 0);
		//Remove o Estudante
		s.delete(e);
		//Comita a transação
		s.getTransaction().commit();
		System.out.println("ok");
	}
	
	public void altera() {
		//Cria Session
		s = f.getCurrentSession();
		System.out.println("altera");
		//Inicia a Session
		s.beginTransaction();
		//Pega o objeto Estudante
		Estudante e = s.get(Estudante.class, 0);
		e.setNomeCompleto("Beltrano");
		e.setEmail("beltrano@email.com");
		//Comita a transação
		s.getTransaction().commit();
		System.out.println("ok");
	}
	
	public void salva() {
		//Cria Session
		s = f.getCurrentSession();
		System.out.println("save");
		//Cria o objeto Estudante
		Estudante e = new Estudante("Fulano", "fulano@email.com");
		//Inicia a Session
		s.beginTransaction();
		//Sava o objeto Estudante
		s.save(e);
		//Comita a transação
		s.getTransaction().commit();
		System.out.println("ok");
	}
}

