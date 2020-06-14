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
        Usuario usu1 = new Usuario("Eva Suarez Vazquez", "eva@gmail.com", "1234", "Tarjeta de Crédito", "666666666");
        Usuario usu2 = new Usuario("admin admin", "admin", "admin", "Tarjeta de Crédito", "666666666");
     
        //Notificaciones
        Notificacion noti = new Notificacion("Nueva multa!!", "Debe abonar el pago en la seccion de multas.\nPara ello haga click en 'Menu' > 'Multas', y una vez alli siga las instrucciones");
        Notificacion noti2 = new Notificacion("Nueva actualización!", "Versión 0.9.3 ya disponible!");
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
        usu1.addNotificacion(noti2);
        usu2.addMulta(mul);
        usu2.addNotificacion(noti);
        usu2.addNotificacion(noti2);
        usu1.addVehiculo(vehi1);
        usu2.addVehiculo(vehi1);
        usu2.addVehiculo(vehi2);
        //Nuevos usuarios
        usuarios.add(usu1);
        usuarios.add(usu2);
        
        //Creacion plazas
        Plaza p1 = new Plaza("San Pedro de Mezonzo", "21", "Libre", "Zona ORA", "1,05€/hora", "4 horas");
        Plaza p2 = new Plaza("República Argentina", "32", "ocupada", "Zona ORA", "1,05€/hora", "4 horas");
        Plaza p3 = new Plaza("Santiago León de Caracas", "2", "ocupada", "Carga descarga", "Ninguno", "30 minutos");
        Plaza p4 = new Plaza("Avenida de Vigo", "8", "libre", "Zona ORA", "1,05€/hora", "4 horas");
        Plaza p5 = new Plaza("Avenida das Ciencias", "12", "libre", "Zona ORA", "1,05€/hora", "4 horas");
        Plaza p6 = new Plaza("Avenida do Doutor Ángel", "2", "libre", "Carga o descarga", "Ninguno", "30 minutos");
        Plaza p7 = new Plaza("Avenida das Ciencias", "12", "libre", "Carga o descarga", "Ninguno", "30 minutos");
        Plaza p8 = new Plaza("Avenida do Doutor Ángel", "7", "libre", "Carga o descarga", "Ninguno", "30 minutos");
        Plaza p9 = new Plaza("Avenida das Ciencias", "3", "libre", "Zona ORA", "1,05€/hora", "4 horas");
        
        ArrayList<Plaza> plazas = new ArrayList<>();
        plazas.add(p1);
        plazas.add(p2);
        plazas.add(p3);
        plazas.add(p4);
        plazas.add(p5);
        plazas.add(p6);
        plazas.add(p7);
        plazas.add(p8);
        plazas.add(p9);
        
        //Ventana inicial
        IniciarSesion pp=new IniciarSesion(usuarios, plazas);
        VInicial v = new VInicial();
        pp.setV(v);
        v.setContentPane(pp);
        v.setVisible(true);
    }
    
}
