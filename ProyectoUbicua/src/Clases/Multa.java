/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author pablo
 */
public class Multa {
    private String texto;
    private double importe;

    public Multa(String texto, double importe) {
        this.texto = texto;
        this.importe = importe;
    }

    public String getTexto() {
        return texto;
    }

    public double getImporte() {
        return importe;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

}