/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author celia
 */
public class GuardaDatos implements Serializable{
    private final ArrayList<Usuario> lista;
    
    public GuardaDatos(ArrayList<Usuario> usuarios){
        this.lista = new ArrayList<>();
        this.lista.addAll(usuarios);
    }
    
    public ArrayList<Usuario> getUsuario(){
        return this.lista;
    }
}
