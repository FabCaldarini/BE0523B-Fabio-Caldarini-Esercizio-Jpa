package it.epicode.dao;

import it.epicode.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EventoDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public EventoDAO() {
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();

    }
    public Evento nuovoEvento(Evento e){
        EntityTransaction et = em.getTransaction();
       et.begin();
        em.persist(e);
        et.commit();
        em.refresh(e);
        return e;

    }
    public Evento getById(int id){
        return em.find(Evento.class, id);

    }
    public void deleteEvento(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();
        Evento arraffa = getById(id);
        em.remove(arraffa);
        et.commit();

    }


}
