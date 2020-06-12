/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author evinha
 */
public class Tarxeta {
    
    private String numero;
    private String caducidad;
    private String numSeg;
    private String titular;
    
    public Tarxeta(String num, String cad, String seg, String tit){
        this.caducidad=cad;
        this.numSeg=seg;
        this.numero=num;
        this.titular=tit;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public String getCaducidad(){
        return this.caducidad;
    }
    
    public String getNumSeg(){
        return this.numSeg;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public void setNumero(String n){
        this.numero = n;
    }
    
    public void setTitular(String n){
        this.titular= n;
    }
    
    public void setcaducidad(String n){
        this.caducidad = n;
    }
    
    public void setNumSeg(String n){
        this.numSeg = n;
    }
    
}
