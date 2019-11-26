/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Instrutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 *         Marcelo
 *         Savini
 */
public class DaoInstrutor {

    private Connection conn;

    public DaoInstrutor(Connection conn) {
        this.conn = conn;
    }

    //Inserir
    public void inserir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TbInstrutor "
                    + "(CPF_Instrutor, Nome_Instrutor, AreaAtuacao_Instrutor, "
                    + "Bairro_Instrutor, Celular_Instrutor, CEP_Instrutor, "
                    + "Cidade_Instrutor, DataNasc_Instrutor, Email_Instrutor, "
                    + "Endereco_Instrutor, Estado_Instrutor, EstadoCivil_Instrutor, "
                    + "Formacao_Instrutor, RG_Instrutor, "
                    + "Sexo_Instrutor, Telefone_Instrutor, Numero_Instrutor)"
                    + " VALUES "
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, instrutor.getCPF());
            ps.setString(2, instrutor.getNome());
            ps.setString(3, instrutor.getAreaAtuacao());
            ps.setString(4, instrutor.getBairro());
            ps.setString(5, instrutor.getCelular());
            ps.setString(6, instrutor.getCEP());
            ps.setString(7, instrutor.getCidade());
            ps.setString(8, instrutor.getDataNasc());
            ps.setString(9, instrutor.getEmail());
            ps.setString(10, instrutor.getEndereco());
            ps.setString(11, instrutor.getEstado());
            ps.setString(12, instrutor.getEstadoCivil());
            ps.setString(13, instrutor.getFormacao());
            ps.setString(14, instrutor.getRG());
            ps.setString(15, instrutor.getSexo());
            ps.setString(16, instrutor.getTelefone());
            ps.setInt(17, instrutor.getNumero());
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

//Alterar
    public void alterar(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TbInstrutor SET "
                    + "AreaAtuacao_Instrutor = ?, "
                    + "Bairro_Instrutor = ?, "
                    + "Celular_Instrutor = ?, "
                    + "CEP_Instrutor = ?, "
                    + "Cidade_Instrutor = ?, "
                    + "DataNasc_Instrutor = ?, "
                    + "Email_Instrutor = ?, "
                    + "Endereco_Instrutor = ?, "
                    + "Estado_Instrutor = ?, "
                    + "EstadoCivil_Instrutor = ?, "
                    + "Formacao_Instrutor = ?, "
                    + "Nome_Instrutor = ?, "
                    + "RG_Instrutor = ?, "
                    + "Sexo_Instrutor = ?, "
                    + "Telefone_Instrutor = ?, "
                    + "Numero_Instrutor = ? "
                    + "WHERE "
                    + "CPF_Instrutor = ?");

            ps.setString(1, instrutor.getAreaAtuacao());
            ps.setString(2, instrutor.getBairro());
            ps.setString(3, instrutor.getCelular());
            ps.setString(4, instrutor.getCEP());
            ps.setString(5, instrutor.getCidade());
            ps.setString(6, instrutor.getDataNasc());
            ps.setString(7, instrutor.getEmail());
            ps.setString(8, instrutor.getEndereco());
            ps.setString(9, instrutor.getEstado());
            ps.setString(10, instrutor.getEstadoCivil());
            ps.setString(11, instrutor.getFormacao());
            ps.setString(12, instrutor.getNome());
            ps.setString(13, instrutor.getRG());
            ps.setString(14, instrutor.getSexo());
            ps.setString(15, instrutor.getTelefone());
            ps.setInt(16, instrutor.getNumero());
            ps.setString(17, instrutor.getCPF());
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    //Consultar

    public Instrutor consultar(String cpf) {
        Instrutor instrutor = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TbInstrutor WHERE "
                    + "CPF_Instrutor = ?");

            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                instrutor = new Instrutor(cpf, rs.getString("AreaAtuacao_Instrutor"));
                instrutor.setBairro(rs.getString("Bairro_Instrutor"));
                instrutor.setCelular(rs.getString("Celular_Instrutor"));
                instrutor.setCEP(rs.getString("CEP_Instrutor"));
                instrutor.setCidade(rs.getString("Cidade_Instrutor"));
                instrutor.setDataNasc(rs.getString("DataNasc_Instrutor"));
                instrutor.setEmail(rs.getString("Email_Instrutor"));
                instrutor.setEndereco(rs.getString("Endereco_Instrutor"));
                instrutor.setEstado(rs.getString("Estado_Instrutor"));
                instrutor.setEstadoCivil(rs.getString("EstadoCivil_Instrutor"));
                instrutor.setFormacao(rs.getString("Formacao_Instrutor"));
                instrutor.setNome(rs.getString("Nome_Instrutor"));
                instrutor.setRG(rs.getString("RG_Instrutor"));
                instrutor.setSexo(rs.getString("Sexo_Instrutor"));
                instrutor.setTelefone(rs.getString("Telefone_Instrutor"));
                instrutor.setNumero(rs.getInt("Numero_Instrutor"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return instrutor;
    }

    //Excluir
    public void excluir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TbInstrutor WHERE "
                    + "CPF_Instrutor = ?");

            ps.setString(1, instrutor.getCPF());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
