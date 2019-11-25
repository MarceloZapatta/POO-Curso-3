/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author notebook
 */
public class Curso {

    private String sigla;
    private String nome;
    private int cargaHoraria;
    private double valor;
    private String dataVigencia;
    private double valorHoraInstrutor;
    private String programa;
    private ArrayList<Turma> turmas;

    public Curso(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;

        turmas = new ArrayList<Turma>();
    }

    //SET
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setValor(double Valor) {
        this.valor = Valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataVigencia(String dataVigencia) {
        this.dataVigencia = dataVigencia;
    }

    public void setValorHoraInstrutor(double valorHoraInstrutor) {
        this.valorHoraInstrutor = valorHoraInstrutor;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    //GET
    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public String getDataVigencia() {
        return dataVigencia;
    }

    public double getValorHoraInstrutor() {
        return valorHoraInstrutor;
    }

    public String getPrograma() {
        return programa;
    }

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }
}
