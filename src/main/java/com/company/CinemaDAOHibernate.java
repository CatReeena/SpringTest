package com.company;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.UUID;

/**
 * Created by Shera on 06.07.2017.
 */
public class CinemaDAOHibernate implements CinemaDAO  {

    @PersistenceContext
    private EntityManager em;



    public void add(Cinema cinema)
    {
        em.persist(cinema);
    }

    public void delete(UUID id)
    {
        em.remove(em.find(Cinema.class, id));
    }

    public List<Cinema> findAll()
    {
       List<Cinema> cinemaList = em.createQuery("from " + getEntityName(),
               Cinema.class).getResultList();
       return cinemaList;
    }


    public String getEntityName()
    {
        return "Cinema";
    }
}
