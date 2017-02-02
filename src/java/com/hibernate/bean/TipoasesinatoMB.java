/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.bean;

import com.hibernate.dao.ITipoAsesinatoDAO;
import com.hibernate.dao.TipoAsesinatoDAO;
import com.hibernate.dominio.Tipoasesinato;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author XndyPxndx
 */
@ManagedBean(name="tipoAsesinatoMB")
@RequestScoped
public class TipoasesinatoMB {

    private Tipoasesinato tipoasesinato;
    private ITipoAsesinatoDAO iTipoAsesinatoDAO;
    private List<Tipoasesinato> tipoasesinatoList;
    
    
    public List<Tipoasesinato> getTipoasesinatoList(){
        iTipoAsesinatoDAO = new TipoAsesinatoDAO();
        tipoasesinatoList = new ArrayList<Tipoasesinato>();
        tipoasesinatoList = iTipoAsesinatoDAO.tipoAsesinatoList();
        return tipoasesinatoList;
    }
    
    
    /**
     * Creates a new instance of TipoasesinatoMB
     */
    public TipoasesinatoMB() {
        if(iTipoAsesinatoDAO == null && tipoasesinato == null){
            
            tipoasesinato = new Tipoasesinato();
            
        }
    }

    public Tipoasesinato getTipoasesinato() {
        return tipoasesinato;
    }

    public void setTipoasesinato(Tipoasesinato tipoasesinato) {
        this.tipoasesinato = tipoasesinato;
    }
    
    
    
}
