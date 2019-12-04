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
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 *         Marcelo
 *         Savini
 */
public class DaoTurma {

    private Connection conn;

    public DaoTurma(Connection conn) {
        this.conn = conn;
    }
    //************ Observação: Precisa verificar a ordem das Siglas em todos os métodos

    /**
     * ************************** INSERIR **************************
     */
    public void inserir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TbTurma"
                    + " (Sigla_Turma,"                                         //1 - SiglaCTurma
                    + " Descricao_Turma,"                                       //2 - Descrição
                    + " DataInicio_Turma,"                                      //3 - Data Inicio
                    + " DataTermino_Turma,"                                     //4 - Data Término
                    + " Periodo_Turma,"                                         //5 - Periodo
                    + " QtdVagas_Turma,"                                        //6 - Qtd Vagas
                    + " Observacoes_Turma,"                                     //7 - Observações
                    + " SiglaCurso_Turma)"                                      //8 - SiglaCurso
                    + " VALUES"
                    + " (?,?,?,?,?,?,?,?)");
            ps.setString(1, turma.getSiglaTurma());                             //1 - SiglaCTurma
            ps.setString(2, turma.getDescricao());                              //2 - Descrição
            ps.setString(3, turma.getDataInicio());                             //3 - Data Inicio
            ps.setString(4, turma.getDataTermino());                            //4 - Data Término
            ps.setString(5, turma.getPeriodo());                                //5 - Periodo
            ps.setInt(6, turma.getQtdVagas());                                  //6 - Qtd Vagas
            ps.setString(7, turma.getObservacoes());                            //7 - Observações
            ps.setString(8, turma.getCurso().getSigla());                       //8 - SiglaCurso

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o instrutor:\n" + ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * ************************** ALTERAR **************************
     */
    public void alterar(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TbTurma SET"
                    + " Descricao_Turma = ?,"                                   //1 - Descrição
                    + " DataInicio_Turma = ?,"                                  //2 - Data Inicio
                    + " DataTermino_Turma = ?,"                                 //3 - Data Término
                    + " Periodo_Turma = ?,"                                     //4 - Periodo
                    + " QtdVagas_Turma = ?,"                                    //5 - Qtd Vagas
                    + " Observacoes_Turma = ?,"                                 //6 - Observações
                    + " SiglaCurso_Turma = ?"                                   //7 - SiglaCurso                            
                    + " WHERE"                                                  //WHERE
                    + " Sigla_Turma = ?");                                     //8 - SiglaCTurma

            ps.setString(1, turma.getDescricao());                              //1 - Descrição
            ps.setString(2, turma.getDataInicio());                             //2 - Data Inicio
            ps.setString(3, turma.getDataTermino());                            //3 - Data Término
            ps.setString(4, turma.getPeriodo());                                //4 - Periodo
            ps.setInt(5, turma.getQtdVagas());                                  //5 - Qtd Vagas
            ps.setString(6, turma.getObservacoes());                            //6 - Observações
            ps.setString(7, turma.getSiglaTurma());                             //7 - SiglaCurso
            ps.setString(8, turma.getCurso().getSigla());                       //SiglaCTurma

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Erro ao consultar a turma:\n" + ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * ************************** CONSULTAR **************************
     */
    public Turma consultar(String sigla) {
        Turma turma = null;
        Curso curso = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT t.Sigla_Turma,"                   //1 - SiglaCTurma
                    + " t.Descricao_Turma,"                                       //2 -Descricao 
                    + " t.DataInicio_Turma,"                                      //3 - Data Inicio
                    + " t.DataTermino_Turma,"                                     //4 - Data Termino
                    + " t.Periodo_Turma,"                                         //5 - Periodo
                    + " t.QtdVagas_Turma,"                                        //6 - Qtde Vagas
                    + " t.Observacoes_Turma,"                                     //7 - Observações
                    + " t.SiglaCurso_Turma,"
                    + " c.Nome_Curso"                                            //8 - Sigla Curso
                    + " FROM TbTurma t INNER JOIN TbCurso c "
                    + " ON t.SiglaCurso_Turma = c.Sigla_Curso"
                    + " WHERE"
                    + " t.SiglaCurso_Turma = ?");

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                turma = new Turma(rs.getString("Sigla_Turma"), 
                        rs.getString("Descricao_Turma"));      
                turma.setDataInicio(rs.getString("DataInicio_Turma"));          //2 - Data Inicio
                turma.setDataTermino(rs.getString("DataTermino_Turma"));        //3 - Data Término
                turma.setPeriodo(rs.getString("Periodo_Turma"));                //4 - Periodo
                turma.setQtdVagas(rs.getInt("QtdVagas_Turma"));                 //5 - Qtde Vagas
                turma.setObservacoes(rs.getString("Observacoes_Turma"));        //6 - Observações

                curso = new Curso(rs.getString("SiglaCurso_Turma"),                  //7 -  Sigla Curso
                        rs.getString("Nome_Curso"));                            //8 -  Nome Curso
                turma.setCurso(curso);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Erro ao consultar a turma:\n" + ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        return turma;
    }

    /**
     * ************************** EXCLUIR **************************
     */
    public void excluir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TbTurma WHERE Sigla_Turma = ?");

            ps.setString(1, turma.getSiglaTurma());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Erro ao excluir a turma:\n" + ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
