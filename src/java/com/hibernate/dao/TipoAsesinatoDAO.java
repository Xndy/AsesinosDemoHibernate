/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.dao;

import com.hibernate.dominio.Tipoasesinato;
import com.hibernate.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
/**
 *
 * @author XndyPxndx
 */
public class TipoAsesinatoDAO implements ITipoAsesinatoDAO{

    
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    @Override
    public List<Tipoasesinato> tipoAsesinatoList() {
        
        Criteria crit = session.createCriteria(Tipoasesinato.class);
        List<Tipoasesinato> tipoasesinatosList = crit.list(); 
        return tipoasesinatosList;
    
    }
    
   
}
