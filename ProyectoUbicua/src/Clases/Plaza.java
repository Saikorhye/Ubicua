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
public class Plaza {
    
    private String calle;
    private String numero;
    private String tipo;
    private String coste;
    private String estado;
    private String max;
    
    public Plaza(String ca, String num, String es, String tip, String cost,  String m){
        this.calle=ca;
        this.numero=num;
        this.tipo=tip;
        this.coste=cost;
        this.estado=es;
        this.max=m;
    }
    
    public String getCalle(){
        return this.calle;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getCoste(){
        return this.coste;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public String getMaximo(){
        return this.max;
    }
    
    public void setEstado(String es){
        this.estado=es;
    }
    
}
