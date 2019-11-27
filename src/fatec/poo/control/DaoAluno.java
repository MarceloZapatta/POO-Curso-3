/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author notebook
 */
public class DaoAluno {

    private Connection conn;

    public DaoAluno(Connection conn) {
        this.conn = conn;
    }

    //Inserir
    public void inserir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TbAluno "
                    + "(CPF_Aluno, Nome_Aluno, Bairro_Aluno, Celular_Aluno, "
                    + "CEP_Aluno,Cidade_Aluno, DataNasc_Aluno, Email_Aluno, "
                    + "Endereco_Aluno, Escolaridade_Aluno, "
                    + "Estado_Aluno, EstadoCivil_Aluno, RG_Aluno, Sexo_Aluno, "
                    + "Telefone_Aluno, Numero_Aluno)"
                    + " VALUES "
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, aluno.getCPF());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getBairro());
            ps.setString(4, aluno.getCelular());
            ps.setString(5, aluno.getCEP());
            ps.setString(6, aluno.getCidade());
            ps.setString(7, aluno.getDataNasc());
            ps.setString(8, aluno.getEmail());
            ps.setString(9, aluno.getEndereco());
            ps.setString(10, aluno.getEscolaridade());
            ps.setString(11, aluno.getEstado());
            ps.setString(12, aluno.getEstadoCivil());
            ps.setString(13, aluno.getRG());
            ps.setString(14, aluno.getSexo());
            ps.setString(15, aluno.getTelefone());
            ps.setInt(16, aluno.getNumero());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    //Alterar
    public void alterar(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TbAluno SET"
                    + "Nome_Aluno = ?, "
                    + "Bairro_Aluno = ?, "
                    + "Celular_Aluno = ?, "
                    + "CEP_Aluno = ?, "
                    + "Cidade_Aluno = ?, "
                    + "DataNasc_Aluno = ?, "
                    + "Email_Aluno = ?, "
                    + "Endereco_Aluno = ?, "
                    + "Escolaridade_Aluno = ?, "
                    + "Estado_Aluno = ?, "
                    + "EstadoCivil_Aluno = ?, "
                    + "RG_Aluno = ?, "
                    + "Sexo_Aluno = ?, "
                    + "Telefone_Aluno = ?, "
                    + "Numero_Aluno = ? "
                    + "WHERE "
                    + "CPF_Aluno = ?");

            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getBairro());
            ps.setString(3, aluno.getCelular());
            ps.setString(4, aluno.getCEP());
            ps.setString(5, aluno.getCidade());
            ps.setString(6, aluno.getDataNasc());
            ps.setString(7, aluno.getEmail());
            ps.setString(8, aluno.getEndereco());
            ps.setString(9, aluno.getEscolaridade());
            ps.setString(10, aluno.getEstado());
            ps.setString(11, aluno.getEstadoCivil());
            ps.setString(12, aluno.getRG());
            ps.setString(13, aluno.getSexo());
            ps.setString(14, aluno.getTelefone());
            ps.setInt(15, aluno.getNumero());
            ps.setString(16, aluno.getCPF());
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    //Consultar

    public Aluno consultar(String cpf) {
        Aluno aluno = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TbAluno WHERE "
                    + "CPF_Aluno = ?");

            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                aluno = new Aluno(cpf, rs.getString("Nome_Aluno"));
                aluno.setBairro(rs.getString("Bairro_Aluno"));
                aluno.setCelular(rs.getString("Celular_Aluno"));
                aluno.setCEP(rs.getString("CEP_Aluno"));
                aluno.setCidade(rs.getString("Cidade_Aluno"));
                aluno.setDataNasc(rs.getString("DataNasc_Aluno"));
                aluno.setEmail(rs.getString("Email_Aluno"));
                aluno.setEndereco(rs.getString("Endereco_Aluno"));
                aluno.setEscolaridade(rs.getString("Escolaridade_Aluno"));
                aluno.setEstado(rs.getString("Estado_Aluno"));
                aluno.setEstadoCivil(rs.getString("EstadoCivil_Aluno"));
                aluno.setRG(rs.getString("RG_Aluno"));
                aluno.setSexo(rs.getString("Sexo_Aluno"));
                aluno.setTelefone(rs.getString("Telefone_Aluno"));
                aluno.setNumero(rs.getInt("Numero_Aluno"));

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (aluno);
    }

    //Excluir
    public void excluir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TbAluno WHERE CPF_Aluno = ?");

            ps.setString(1, aluno.getCPF());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
