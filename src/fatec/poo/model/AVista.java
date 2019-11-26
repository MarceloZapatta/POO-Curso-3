/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 *         Marcelo
 *         Savini
 */
public class AVista {

    private double valor;
    private int agencia;
    private int nCheque;
    private String preData;
    private Matricula matricula;

    //SET
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNcheque(int nCheque) {
        this.nCheque = nCheque;
    }

    public void setPreData(String preData) {
        this.preData = preData;
    }

    //GET
    public double getValor() {
        return valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNcheque() {
        return nCheque;
    }

    public String getPreData() {
        return preData;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
