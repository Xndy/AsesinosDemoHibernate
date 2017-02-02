/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.dao;

import com.hibernate.dominio.Asesinos;
import java.util.List;

/**
 *
 * @author XndyPxndx
 */
public interface IAsesinosDAO {
    
    public List<Asesinos> getAsesinoList();
    public List<Asesinos> getAsesinoListRestrictions();
    public List<Asesinos> getAsesinoListOrder();
    
    public List<Asesinos> getAsesinoByCantidadAsesinato(int maxedad);
    
    public List<Asesinos> getAsesinosListByProjection();
    
    public void addAsesino(Asesinos asesino);
   
    
    
}
