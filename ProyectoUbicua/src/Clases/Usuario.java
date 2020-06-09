
package Clases;

import java.util.ArrayList;


public class Usuario {
    
    private String nombre;
    private String correo;
    private String contrasena;
    private String metodoPago;
    private String telefono;
    private ArrayList<Notificacion> notificaciones;
    private ArrayList<Multa> multas;
    
    public Usuario(String nombr, String corre, String contrasen, String metodoPag, String telefon){
        this.nombre=nombr;
        this.correo=corre;
        this.contrasena=contrasen;
        this.metodoPago=metodoPag;
        this.telefono=telefon;
        this.notificaciones = new ArrayList<>();
        this.multas = new ArrayList<>();
    
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
    
    public ArrayList<Notificacion> getNotificaciones(){
        return this.notificaciones;
    }
    
     public ArrayList<Multa> getMultas(){
        return this.multas;
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
    
     public void setNotificaciones(ArrayList<Notificacion> notificacions){
       this.notificaciones = notificacions;
    }
    
     public void setMultas(ArrayList<Multa> multas){
        this.multas = multas;
    }
     
     public void addNotificacion(Notificacion n){
         notificaciones.add(n);
     }
     
     public void addMulta(Multa m){
         multas.add(m);
     }
}
