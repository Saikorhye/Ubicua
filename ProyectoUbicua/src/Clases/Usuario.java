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
public class Usuario {
    
    private String nombre;
    private String correo;
    private String contrasena;
    private String metodoPago;
    private String telefono;
    
    public Usuario(String nombr, String corre, String contrasen, String metodoPag, String telefon){
        this.nombre=nombr;
        this.correo=corre;
        this.contrasena=contrasen;
        this.metodoPago=metodoPag;
        this.telefono=telefon;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
    public String getContrasena(){
        return this.contrasena;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public String getMetodoPago(){
        return this.metodoPago;
    }
    
    public void setContrasena(String nova){
        this.contrasena=nova;
    }
    
    public void setMetodoPago(String novo){
        this.metodoPago=novo;
    }
    
    public void setTelefono(String novo){
        this.telefono=novo;
    }
}
