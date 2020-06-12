
package Clases;

import java.io.Serializable;
import java.util.ArrayList;


public class Usuario implements Serializable {
    
    private String nombre;
    private String correo;
    private String contrasena;
    private String metodoPago;
    private String telefono;
    private ArrayList<Notificacion> notificaciones;
    private ArrayList<Multa> multas;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Tarxeta> tarxetas;
    
    public Usuario(String nombr, String corre, String contrasen, String metodoPag, String telefon){
        this.nombre=nombr;
        this.correo=corre;
        this.contrasena=contrasen;
        this.metodoPago=metodoPag;
        this.telefono=telefon;
        this.notificaciones = new ArrayList<>();
        this.multas = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.tarxetas = new ArrayList<>();
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
     
    public ArrayList<Vehiculo> getVehiculos(){
        return this.vehiculos;
    }
    
    public ArrayList<Tarxeta> getTarxetas(){
        return this.tarxetas;
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
     
    public void setVehiculos(ArrayList<Vehiculo> veh){
        this.vehiculos=veh;
    }
    
    public void setTarxetas(ArrayList<Tarxeta> tar){
        this.tarxetas=tar;
    }
     
     public void addNotificacion(Notificacion n){
         notificaciones.add(n);
     }
     
     public void addMulta(Multa m){
         multas.add(m);
     }
     
     public void addVehiculo(Vehiculo ve){
         this.vehiculos.add(ve);
     }
     
    public void addTarxeta(Tarxeta a){
        this.tarxetas.add(a);
    }
     
     public void removeVehiculo(String matricula) {
         for (int i = 0; i < this.vehiculos.size(); i++) {
             if (this.vehiculos.get(i).getMatricula().equals(matricula)) {
                 this.vehiculos.remove(i);
                 break;
             }
         }
     }
     
        public void removeNotificacion(String titulo) {
         for (int i = 0; i < this.notificaciones.size(); i++) {
             if (this.notificaciones.get(i).getTitulo().equals(titulo)) {
                 this.notificaciones.remove(i);
                 break;
             }
         }
     }
}
