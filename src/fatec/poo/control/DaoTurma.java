/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Turma;
import fatec.poo.model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author notebook
 */
public class DaoTurma {

    private Connection conn;

    public DaoTurma(Connection conn) {
        this.conn = conn;
    }

    //Inserir
    public void inserir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TbTurma"
                    + "(SiglaC_Turma, "
                    + "Descricao_Turma, "
                    + "DataInicio_Turma, "
                    + "DataTermino_Turma, "
                    + "Periodo_Turma, "
                    + "QtdVagas_Turma,"
                    + "Observacoes_Turma, "
                    + "SiglaCurso_Turma) "
                    + "VALUES (?,?,?,?,?,?, ?)");
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getDescricao());
            ps.setString(3, turma.getDataInicio());
            ps.setString(4, turma.getDataTermino());
            ps.setString(5, turma.getPeriodo());
            ps.setInt(6, turma.getQtdVagas());
            ps.setString(7, turma.getObservacoes());
            ps.setString(8, turma.getCurso().getSigla());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    //Alterar
    public void alterar(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TbTurma SET "
                    + "Descricao_Turma = ?,"
                    + "DataInicio_Turma = ?, "
                    + "DataTermino_Turma = ?, "
                    + "Periodo_Turma = ?, "
                    + "QtdVagas_Turma = ?, "
                    + "Observacoes_Turma = ? ,"
                    + "SiglaCurso_Turma = ? "
                    + "WHERE siglaC_Turma = ?");

            ps.setString(1, turma.getDescricao());
            ps.setString(2, turma.getDataInicio());
            ps.setString(3, turma.getDataTermino());
            ps.setString(4, turma.getPeriodo());
            ps.setInt(5, turma.getQtdVagas());
            ps.setString(6, turma.getSiglaTurma());
            ps.setString(7, turma.getObservacoes());
            ps.setString(8, turma.getCurso().getSigla());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    //Consultar

    public Turma consultar(String sigla) {
        Turma turma = null;
        Curso curso = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT SiglaC_Turma, "
                    + "Descricao_Turma, "
                    + "DataInicio_Turma, "
                    + "DataTermino_Turma, "
                    + "Periodo_Turma, "
                    + "QtdVagas_Turma, "
                    + "Observacoes_Turma, "
                    + "Sigla_Curso "
                    + "FROM TbTurma INNER JOIN TbCurso "
                    + "WHERE "
                    + "SiglaC_Turma = ? AND "
                    + "SiglaCurso_Turma = Sigla_Curso");

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                turma = new Turma(sigla, rs.getString("Descricao_Turma"));
                turma.setDescricao(rs.getString("Descricao_Turma"));
                turma.setDataInicio(rs.getString("DataInicio_Turma"));
                turma.setDataTermino(rs.getString("DataTermino_Turma"));
                turma.setPeriodo(rs.getString("Periodo_Turma"));
                turma.setQtdVagas(rs.getInt("QtdVagas_Turma"));
                turma.setObservacoes(rs.getString("Observacoes_Turma"));
                
                curso = new Curso(rs.getString("Sigla_Curso"), rs.getString("Nome_Curso"));
                turma.setCurso(curso);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return turma;
    }

    //Excluir
    public void excluir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TbTurma WHERE SiglaCTurma = ?");

            ps.setString(1, turma.getSiglaTurma());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
