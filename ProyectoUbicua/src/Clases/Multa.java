/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author pablo
 */
public class Multa implements Serializable{
    private String texto;
    private double importe;
    private Timestamp fecha;
    private String matricula;

    public Multa(String texto, double importe, Timestamp fecha, String matricula) {
        this.texto = texto;
        this.importe = importe;
        this.fecha = fecha;
        this.matricula = matricula;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public String getMatricula() {
        return matricula;
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