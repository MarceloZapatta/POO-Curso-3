/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 *         Marcelo
 *         Savini
 */
public class DaoCurso {

    private Connection conn;

    public DaoCurso(Connection conn) {
        this.conn = conn;
    }

    //Inserir
    public void inserir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TbCurso "
                    + "(Sigla_Curso, Nome_Curso, CargaHoraria_Curso, "
                    + "DataVigencia_Curso, Valor_Curso, ValorHrInstrutor_Curso, "
                    + "Programa_Curso) "
                    + " VALUES "
                    + "(?,?,?,?,?,?,?)");
            ps.setString(1, curso.getSigla());
            ps.setString(2, curso.getNome());
            ps.setInt(3, curso.getCargaHoraria());
            ps.setString(4, curso.getDataVigencia());
            ps.setDouble(5, curso.getValor());
            ps.setDouble(6, curso.getValorHoraInstrutor());
            ps.setString(7, curso.getPrograma());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    //Alterar
    public void alterar(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TbCurso SET "
                    + "Nome_Curso = ?, "
                    + "CargaHoraria_Curso = ?, "
                    + "DataVigencia_Curso = ?, "
                    + "Valor_Curso = ?, "
                    + "ValorHrInstrutor_Curso = ?, "
                    + "Programa_Curso = ? "
                    + "WHERE "
                    + "Sigla_Curso = ?");

            ps.setString(1, curso.getNome());
            ps.setInt(2, curso.getCargaHoraria());
            ps.setString(3, curso.getDataVigencia());
            ps.setDouble(4, curso.getValor());
            ps.setDouble(5, curso.getValorHoraInstrutor());
            ps.setString(6, curso.getPrograma());
            ps.setString(7, curso.getSigla());
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    //Consultar
    public Curso consultar(String sigla) {
        Curso curso = null;
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("SELECT * FROM TbCurso WHERE "
                    + "Sigla_Curso = ?");

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                curso = new Curso(sigla, rs.getString("Nome_Curso"));
                curso.setCargaHoraria(rs.getInt("CargaHoraria_Curso"));
                curso.setDataVigencia(rs.getString("DataVigencia_Curso"));
                curso.setValor(rs.getDouble("Valor_Curso"));
                curso.setValorHoraInstrutor(rs.getDouble("ValorHrInstrutor_Curso"));
                curso.setPrograma(rs.getString("Programa_Curso"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (curso);
    }

    //Excluir
    public void excluir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TbCurso WHERE  Sigla_Curso = ?");

            ps.setString(1, curso.getSigla());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    //Falta Terminar
    public ArrayList<String> listarSiglasCursos() {
        ArrayList<String> siglasCurso = new ArrayList<String>();
        PreparedStatement ps = null;        
        
        try {
            ps = conn.prepareStatement("SELECT Sigla_Curso FROM TbCurso");
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                siglasCurso.add(rs.getString("Sigla_Curso"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return siglasCurso;
    }
}
