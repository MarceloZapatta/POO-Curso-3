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
 * @author Lucas Marcelo Savini
 */
public class DaoCurso {

    private Connection conn;

    public DaoCurso(Connection conn) {
        this.conn = conn;
    }

    /**
     * ************************** INSERIR **************************
     */
    public void inserir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TbCurso"
                    + " (Sigla_Curso,"                                          //1- Sigla
                    + " Nome_Curso,"                                            //2 - Nome
                    + " CargaHoraria_Curso,"                                    //3 - Carga Horária
                    + " DataVigencia_Curso,"                                    //4 - Data Vigência
                    + " Valor_Curso,"                                           //5 - Valor
                    + " ValorHrInstrutor_Curso,"                                //6 - Valor Hora Instrutor
                    + " Programa_Curso) "                                       //7 - Programa
                    + " VALUES "
                    + "(?,?,?,?,?,?,?)");
                       //1,2,3,4,5,6,7
            ps.setString(1, curso.getSigla());                                  //1 - Sigla 
            ps.setString(2, curso.getNome());                                   //2 - Nome
            ps.setInt(3, curso.getCargaHoraria());                              //3 - Carga Horária
            ps.setString(4, curso.getDataVigencia());                           //4 - Data Vigência
            ps.setDouble(5, curso.getValor());                                  //5 - Valor
            ps.setDouble(6, curso.getValorHoraInstrutor());                     //6 - Valor Hora
            ps.setString(7, curso.getPrograma());                               //7 - Programa

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * ************************** ALTERAR **************************
     */
    public void alterar(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TbCurso SET"
                    + " Nome_Curso = ?," //1 - Nome 
                    + " CargaHoraria_Curso = ?," //2 - Carrga
                    + " DataVigencia_Curso = ?," //3 - Data Vigência
                    + " Valor_Curso = ?," //4 - Valor
                    + " ValorHrInstrutor_Curso = ?," //5 - Valor Hora inst
                    + " Programa_Curso = ?" //6 - Programa
                    + " WHERE" //WHERE
                    + " Sigla_Curso = ?");                                      //Sigla

            ps.setString(1, curso.getNome());                                   //1 - Nome
            ps.setInt(2, curso.getCargaHoraria());                              //2 - Carga Horaria
            ps.setString(3, curso.getDataVigencia());                           //3 - Data vigência
            ps.setDouble(4, curso.getValor());                                  //4 - Valor
            ps.setDouble(5, curso.getValorHoraInstrutor());                     //5 - Valor Hora Inst
            ps.setString(6, curso.getPrograma());                               //6 - Programa
            ps.setString(7, curso.getSigla());                                  //7 - Sigla
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * ************************** CONSULTAR **************************
     */
    public Curso consultar(String sigla) {
        Curso curso = null;
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("SELECT * FROM TbCurso WHERE"
                    + " Sigla_Curso = ?");                                      //1 - SIGLA

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                curso = new Curso(sigla, rs.getString("Nome_Curso"));           //2 - NOme
                curso.setCargaHoraria(rs.getInt("CargaHoraria_Curso"));         //3 - Carga Horaria
                curso.setDataVigencia(rs.getString("DataVigencia_Curso"));      //4 - Data Vigência
                curso.setValor(rs.getDouble("Valor_Curso"));                    //5 - Valor
                curso.setValorHoraInstrutor(rs.getDouble("ValorHrInstrutor_Curso")); //6 - Valor Hora Instrutor
                curso.setPrograma(rs.getString("Programa_Curso"));              //7 - Programa
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (curso);
    }

    /**
     * ************************** EXCLUIR **************************
     */
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

    /**
     * ************************** Listar Siglas **************************
     */
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
