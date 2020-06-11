/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import GUI.IniciarSesion;
import GUI.VInicial;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author evinha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usu1 = new Usuario("Eva Suarez Vazquez", "eva@gmail.com", "1234", "Tarjeta", "666666666");
        Usuario usu2 = new Usuario("admin admin", "admin", "admin", "Tarjeta", "666666666");
     
        //Notificaciones
        Notificacion noti = new Notificacion("Nueva multa!!", "Debe abonar el pago en la seccion de multas. \nPara ello haga click en 'Menu' > 'Multas', y una vez alli siga las instrucciones");
        //Vehiculos
        Vehiculo vehi1 = new Vehiculo("2332DDD", "Coche rojo");
        Vehiculo vehi2 = new Vehiculo("1655TXC", "Coche azul");
        //Multas
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DATE, c.get(Calendar.DATE) -7);
        
        Multa mul = new Multa("Estacionamiento indebido en Rua do Franco", 45.84, new Timestamp(c.getTimeInMillis()), vehi1.getMatricula());
        
        //Anhadimos las notificaciones y multas a los usuarios
        usu1.addMulta(mul);
        usu1.addNotificacion(noti);
        usu2.addMulta(mul);
        usu2.addNotificacion(noti);
        usu1.addVehiculo(vehi1);
        usu2.addVehiculo(vehi1);
        usu2.addVehiculo(vehi2);
        //Nuevos usuarios
        usuarios.add(usu1);
        usuarios.add(usu2);
        
        //Ventana inicial
        IniciarSesion pp=new IniciarSesion(usuarios);
        VInicial v = new VInicial();
        pp.setV(v);
        v.setContentPane(pp);
        v.setVisible(true);
    }
    
}
