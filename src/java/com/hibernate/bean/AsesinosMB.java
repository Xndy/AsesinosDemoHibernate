/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.bean;

import com.hibernate.dao.AsesinosDAO;
import com.hibernate.dominio.Asesinos;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.AjaxBehaviorEvent;
import com.hibernate.dao.IAsesinosDAO;
import com.hibernate.dominio.Tipoasesinato;
/**
 *
 * @author XndyPxndx
 */
@ManagedBean(name="personaMB")
@RequestScoped
public class AsesinosMB {

    private Asesinos persona;
    public List<Asesinos> personaList;
    private List<Asesinos> personaEdadList = new ArrayList<Asesinos>();
    private IAsesinosDAO iPersonaDAO = new AsesinosDAO(); 
    
    private Integer cantidadasesinatos;
    
    
    private int idtipoAsesinato;
    
    /**
     * Creates a new instance of PersonaMB
     */
    public AsesinosMB() {
        if(persona == null){
            persona = new Asesinos();
        }
    }
    
    public List<Asesinos> getPersonaList(){
        personaList = iPersonaDAO.getAsesinoList();
        return personaList;
    }

    public List<Asesinos> getPersonaListOrder(){
        personaList = iPersonaDAO.getAsesinoListOrder();
        return personaList;
    }
    
    public List<Asesinos> getPersonaListRestrictions(){
        personaList = iPersonaDAO.getAsesinoListRestrictions();
        return personaList;
    }
    
    public void llenarTablaEdad(AjaxBehaviorEvent  event){
        this.personaEdadList = iPersonaDAO.getAsesinoByCantidadAsesinato(this.cantidadasesinatos);
    }

    public List<Asesinos> getPersonaEdadList() {
        return personaEdadList;
    }

    public void setPersonaEdadList(List<Asesinos> personaEdadList) {
        this.personaEdadList = personaEdadList;
    }
    
    public void saveAsesinato(){
        Tipoasesinato t = new Tipoasesinato();
        System.out.println("el id es " + idtipoAsesinato);
        t.setIdasesinato(idtipoAsesinato);
        persona.setTipoasesinato(t);
        iPersonaDAO.addAsesino(persona);
    }
    
    
    public Asesinos getPersona() {
        return persona;
    }

    public void setPersona(Asesinos persona) {
        this.persona = persona;
    }

    public Integer getCantidadasesinatos() {
        return cantidadasesinatos;
    }

    public void setCantidadasesinatos(Integer cantidadasesinatos) {
        this.cantidadasesinatos = cantidadasesinatos;
    }

    public int getIdtipoAsesinato() {
        return idtipoAsesinato;
    }

    public void setIdtipoAsesinato(int idtipoAsesinato) {
        this.idtipoAsesinato = idtipoAsesinato;
    }

    

   
    
    
    
    
}
