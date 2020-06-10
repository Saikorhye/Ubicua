/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import GUI.IniciarSesion;
import GUI.VInicial;
import java.util.ArrayList;
import java.io.*;

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
        Usuario usu2 = new Usuario("admin", "admin", "admin", "Tarjeta", "666666666");
        Vehiculo v1 = new Vehiculo("2800HVM", "Opel 306 gris");
        Vehiculo v2 = new Vehiculo("3000CCC", "Seat Ibiza Rojo");
        usu2.addVehiculo(v2);
        usu2.addVehiculo(v1);
        //Multas
        Multa mul = new Multa("Estacionamiento indebido en Rua do Franco del dia 13-05-2020", 45.84);
        //Notificaciones
        Notificacion noti = new Notificacion("Nueva multa!!", "Debe abonar el pago en la seccion de multas. \nPara ello haga click en 'Menu' > 'Multas', y una vez alli siga las instrucciones");

        //Anhadimos las notificaciones y multas a los usuarios
        usu1.addMulta(mul);
        usu1.addNotificacion(noti);
        usu2.addMulta(mul);
        usu2.addNotificacion(noti);
        //Nuevos usuarios
        usuarios.add(usu1);
        usuarios.add(usu2);

        //Ventana inicial
        IniciarSesion pp = new IniciarSesion(usuarios);
        VInicial v = new VInicial();
        pp.setV(v);
        v.setContentPane(pp);
        v.setVisible(true);
    }

}
