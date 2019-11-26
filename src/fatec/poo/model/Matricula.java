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
public class Matricula {

    private String data;
    private int quantidadeFaltas;
    private double nota;
    private Aluno aluno;
    private Turma turma;
    private AVista aVista;
    private APrazo aPrazo;

    public Matricula(String data) {
        this.data = data;
    }

    public void setQuantidadeFaltas(int quantidadeFaltas) {
        this.quantidadeFaltas = quantidadeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getData() {
        return data;
    }

    public int getQuantidadeFaltas() {
        return quantidadeFaltas;
    }

    public double getNota() {
        return nota;
    }

    public void setAluno() {
        this.aluno = aluno;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void setAVista(AVista aVista) {
        this.aVista = aVista;
    }

    public void setAPrazo(APrazo aPrazo) {
        this.aPrazo = aPrazo;
    }
    
    public void EmitirCarne(){
    }
}
