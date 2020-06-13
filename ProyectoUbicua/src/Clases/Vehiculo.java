/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * 
 */
public class Vehiculo implements Serializable{
    
    private String matricula;
    private String descripcion;
    private Timestamp ticket;
    
    public Vehiculo(String matri, String descrip){
        this.descripcion=descrip;
        this.matricula=matri;
        this.ticket = null;
    }

    public Timestamp getTicket() {
        return ticket;
    }
    
    public String getMatricula(){
        return this.matricula;
    }

    public void setTicket(Timestamp ticket) {
        this.ticket = ticket;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setMatricula(String mat){
        this.matricula=mat;
    }
    
    public void setDescripcion(String des){
        this.descripcion=des;
    }
    
    
    
}
