/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import GUI.IniciarSesion;
import GUI.VInicial;
import java.util.ArrayList;

/**
 *
 * @author evinha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario usu1 = new Usuario("Eva Suarez Vazquez", "eva@gmail.com", "1234", "Tarjeta", "666666666");
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usu1);
        IniciarSesion pp=new IniciarSesion(usuarios);
        VInicial v = new VInicial();
        pp.setV(v);
        v.setContentPane(pp);
        v.setVisible(true);
    }
    
}
