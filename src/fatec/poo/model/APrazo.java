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
public class APrazo {

    private double valor;
    private String dataVencimento;
    private double taxaJuros;
    private int mensalidade;
    private Matricula matricula;

    //SET
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDtVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }

    //GET
    public double getValor() {
        return valor;
    }

    public String getDtVencimento() {
        return dataVencimento;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
