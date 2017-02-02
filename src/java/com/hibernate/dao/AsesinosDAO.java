/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.dao;

import com.hibernate.dominio.Asesinos;
import com.hibernate.util.HibernateUtil;
import java.util.List;
import org.hibernate.Filter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author XndyPxndx
 */
public class AsesinosDAO implements IAsesinosDAO {

    Session session = HibernateUtil.getSessionFactory().openSession();
    
    @Override
    public List<Asesinos> getAsesinoList() {
        Criteria crit = session.createCriteria(Asesinos.class);
        List<Asesinos> personaList = crit.list(); 
        return personaList;
    }

    @Override
    public List<Asesinos> getAsesinoListRestrictions() {
           Criteria c=session.createCriteria(Asesinos.class);  
          // c.add(Restrictions.gt("idpersona",1));
           c.add(Restrictions.like("nombre", "%A%"));
           List<Asesinos> personaList = c.list(); 
        return personaList;
    }

    @Override
    public List<Asesinos> getAsesinoListOrder() {
        Criteria c=session.createCriteria(Asesinos.class);  
            c.addOrder(Order.desc("idasesino"));  
            List<Asesinos> personaList = c.list(); 
        return personaList;}

    @Override
    public List<Asesinos> getAsesinoByCantidadAsesinato(int cantasesinato) {
        Filter filter = session.enableFilter("asesinosFilter");
        filter.setParameter("maxcantasesinatos", cantasesinato);
        session.beginTransaction();
        List<Asesinos> personaEdadList = session.createQuery("from Asesinos").list();
        return personaEdadList;
    }

    @Override
    public List<Asesinos> getAsesinosListByProjection() {
        
        List<Asesinos> peliculas1 =session.createCriteria(Asesinos.class)//.list();
        .setProjection( Projections.projectionList()
        .add( Projections.rowCount() )
        .add( Projections.avg("personasasesinadas") )
        .add( Projections.max("personasasesinadas") )
        .add( Projections.groupProperty("formato").as("año") )
       
        ).list(); 
    
        return peliculas1;
    }

    @Override
    public void addAsesino(Asesinos asesino) {
        session.beginTransaction();
        session.save(asesino);
        session.getTransaction().commit();
        
    }

    
    
    
    
    
}
