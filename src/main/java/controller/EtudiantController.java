/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Etudiant;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import session.EtudiantFacadeLocal;

/**
 *
 * @author Dell
 */
@Named(value = "etudiantController")
@RequestScoped
public class EtudiantController {

    @EJB
    private EtudiantFacadeLocal etudiantFacade;
    private Etudiant p = new Etudiant();

    
    public EtudiantController() {
    }
     public List<Etudiant> malist(){
         return etudiantFacade.findAll() ;
                 
     }

    public Etudiant getP() {
        return p;
    }

    public void setP(Etudiant p) {
        this.p = p;
    }
     public String avanajou(Etudiant p){
        etudiantFacade.create(p);
        return "index" ;
        
        
    }
    public String avanmodif(int id){
        etudiantFacade.find(id);
        return "avanmod" ;
    }
    public String modif(Etudiant p){
        etudiantFacade.edit(p);
        return "index";
    }
    public String supprimer(int id){
        Etudiant t=etudiantFacade.find(id) ;
        etudiantFacade.remove(t);
        return "index" ;
    }
     
    
    
}
