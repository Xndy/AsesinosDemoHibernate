
import com.hibernate.dominio.Asesinos;
import com.hibernate.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XndyPxndx
 */
public class pruebitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Asesinos.class);
        List<Asesinos> asesinosList = crit.list(); 
        for(Asesinos a : asesinosList )
            System.out.println(a.getTipoasesinato().getTipoasesinato());
        
    }
    
}
