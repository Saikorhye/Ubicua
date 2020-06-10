/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * 
 */
public class Vehiculo implements Serializable{
    
    private String matricula;
    private String descripcion;
    
    public Vehiculo(String matri, String descrip){
        this.descripcion=descrip;
        this.matricula=matri;
    }
    
    public String getMatricula(){
        return this.matricula;
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
