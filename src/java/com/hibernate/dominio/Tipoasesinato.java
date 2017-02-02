package com.hibernate.dominio;
// Generated 24/08/2016 21:16:44 by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Tipoasesinato generated by hbm2java
 */
@Entity
@Table(name="tipoasesinato"
    ,schema="public"
)
public class Tipoasesinato  implements java.io.Serializable {


     private int idasesinato;
     private String tipoasesinato;
     private List<Asesinos> asesinoses = new ArrayList<Asesinos>();

    public Tipoasesinato() {
    }

	
    public Tipoasesinato(int idasesinato) {
        this.idasesinato = idasesinato;
    }
    public Tipoasesinato(int idasesinato, String tipoasesinato) {
       this.idasesinato = idasesinato;
       this.tipoasesinato = tipoasesinato;
       
    }
   
     @Id 

    
    @Column(name="idasesinato", nullable=false)
    public int getIdasesinato() {
        return this.idasesinato;
    }
    
    public void setIdasesinato(int idasesinato) {
        this.idasesinato = idasesinato;
    }

    
    @Column(name="tipoasesinato")
    public String getTipoasesinato() {
        return this.tipoasesinato;
    }
    
    public void setTipoasesinato(String tipoasesinato) {
        this.tipoasesinato = tipoasesinato;
    }

    @OneToMany(mappedBy="tipoasesinato")
     //@Fetch(FetchMode.SUBSELECT)
     public List<Asesinos> getAsesinoses() {
        return asesinoses;
    }

    public void setAsesinoses(List<Asesinos> asesinoses) {
        this.asesinoses = asesinoses;
    }

    @Override
    public String toString() {
        return tipoasesinato;
    }

   



    
    

}


