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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lucas Marcelo Savini
 */
public class DaoInstrutor {

    private Connection conn;

    public DaoInstrutor(Connection conn) {
        this.conn = conn;
    }

    /**
     * ************************** INSERIR **************************
     */
    public void inserir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            /* Acho que eu coloquei no banco o nome primeiro */
            ps = conn.prepareStatement("INSERT INTO TbInstrutor"
                    + " (CPF_Instrutor,"                                        //1  - CPF
                    + " Nome_Instrutor,"                                        //2  - Nome
                    + " AreaAtuacao_Instrutor,"                                 //3  - Area atuacao
                    + " Bairro_Instrutor,"                                      //4  - Bairro
                    + " Celular_Instrutor,"                                     //5  - Celular
                    + " CEP_Instrutor,"                                         //6  - CEP
                    + " Cidade_Instrutor,"                                      //7  - Cidade
                    + " DataNasc_Instrutor,"                                    //8  - Data Nasc
                    + " Email_Instrutor,"                                       //9  - Email
                    + " Endereco_Instrutor,"                                    //10 - Endereco
                    + " Estado_Instrutor,"                                      //11 - Estado
                    + " EstadoCivil_Instrutor,"                                 //12 - Estado civil
                    + " Formacao_Instrutor,"                                    //13 - Formacao
                    + " RG_Instrutor,"                                          //14 - RG
                    + " Sexo_Instrutor,"                                        //15 - Sexo
                    + " Telefone_Instrutor,"                                    //16 - Telefone
                    + " Numero_Instrutor)"                                      //17 - Numero
                    + " VALUES"
                    + " (?,?,?,?,?,?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?)");
                       //1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17

            //Prepared Statement Sets
            ps.setString(1, instrutor.getCPF());                                //1  - CPF                         
            ps.setString(2, instrutor.getNome());                               //2  - Nome          
            ps.setString(3, instrutor.getAreaAtuacao());                        //3  - Area Atuação
            ps.setString(4, instrutor.getBairro());                             //4  - Bairro
            ps.setString(5, instrutor.getCelular());                            //5  - Celular
            ps.setString(6, instrutor.getCEP());                                //6  - CEP
            ps.setString(7, instrutor.getCidade());                             //7  - Cidade
            ps.setString(8, instrutor.getDataNasc());                           //8  - Data Nasc
            ps.setString(9, instrutor.getEmail());                              //9  - Email
            ps.setString(10, instrutor.getEndereco());                          //10 - Endereço
            ps.setString(11, instrutor.getEstado());                            //11 - Estado
            ps.setString(12, instrutor.getEstadoCivil());                       //12 - Estado Civil
            ps.setString(13, instrutor.getFormacao());                          //13 - Formação
            ps.setString(14, instrutor.getRG());                                //14 - RG
            ps.setString(15, instrutor.getSexo());                              //15 - Sexo
            ps.setString(16, instrutor.getTelefone());                          //16 - Telefone
            ps.setInt(17, instrutor.getNumero());                               //17 - Núemro
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o instrutor:\n" + ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * ************************** ALTERAR **************************
     */
    public void alterar(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            //Comandos Sql Prepared Statement
            ps = conn.prepareStatement("UPDATE TbInstrutor SET"
                    + " Nome_Instrutor = ?,"                                    //1  - Nome
                    + " AreaAtuacao_Instrutor = ?,"                             //2  - Area Atuação 
                    + " Bairro_Instrutor = ?,"                                  //3  - Bairro
                    + " Celular_Instrutor = ?,"                                 //4  - Celular
                    + " CEP_Instrutor = ?,"                                     //5  - CEP
                    + " Cidade_Instrutor = ?,"                                  //6  - Cidade
                    + " DataNasc_Instrutor = ?,"                                //7  - Data Nasc
                    + " Email_Instrutor = ?,"                                   //8  - Email
                    + " Endereco_Instrutor = ?,"                                //9  - Endereço
                    + " Estado_Instrutor = ?,"                                  //10 - Estado
                    + " EstadoCivil_Instrutor = ?,"                             //11 - Estado Civil
                    + " Formacao_Instrutor = ?,"                                //12 - Formação
                    + " RG_Instrutor = ?,"                                      //13 - RG
                    + " Sexo_Instrutor = ?,"                                    //14 - Sexo
                    + " Telefone_Instrutor = ?,"                                //15 - Telefone
                    + " Numero_Instrutor = ?"                                   //16 - Número
                    + " WHERE"                                                  //WHERE 
                    + " CPF_Instrutor = ?");                                    //17 - CPF

            //Prepared Statement Sets
            ps.setString(12, instrutor.getNome());                              //1 - 
            ps.setString(1, instrutor.getAreaAtuacao());                        //2  - Area Atuação 
            ps.setString(2, instrutor.getBairro());                             //3  - Bairro
            ps.setString(3, instrutor.getCelular());                            //4  - Celular
            ps.setString(4, instrutor.getCEP());                                //5  - CEP
            ps.setString(5, instrutor.getCidade());                             //6  - Cidade
            ps.setString(6, instrutor.getDataNasc());                           //7  - Data
            ps.setString(7, instrutor.getEmail());                              //8  - Email
            ps.setString(8, instrutor.getEndereco());                           //9  - Endereço
            ps.setString(9, instrutor.getEstado());                             //10 - Estado
            ps.setString(10, instrutor.getEstadoCivil());                       //11 - Estado Civil
            ps.setString(11, instrutor.getFormacao());                          //12 - Formação
            ps.setString(13, instrutor.getRG());                                //13 - RG
            ps.setString(14, instrutor.getSexo());                              //14 - Sexo
            ps.setString(15, instrutor.getTelefone());                          //15 - Telefone
            ps.setInt(16, instrutor.getNumero());                               //16 - Número
            ps.setString(17, instrutor.getCPF());                               //17 - CPF
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o instrutor:\n" + ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * ************************** CONSULTAR **************************
     */
    public Instrutor consultar(String cpf) {
        Instrutor instrutor = null;

        PreparedStatement ps = null;
        try {
            //Comandos Sql Prepared Statement
            ps = conn.prepareStatement("SELECT * FROM TbInstrutor WHERE"
                    + " CPF_Instrutor = ?");                                            //1 - CPF

            ps.setString(1, cpf);                                           
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                //Prepared Statement Gets
                instrutor = new Instrutor(cpf, rs.getString("AreaAtuacao_Instrutor"));  //2  - Area Atuacao
                instrutor.setBairro(rs.getString("Bairro_Instrutor"));                  //3  - Bairro
                instrutor.setCelular(rs.getString("Celular_Instrutor"));                //4  - Celular
                instrutor.setCEP(rs.getString("CEP_Instrutor"));                        //5  - CEP
                instrutor.setCidade(rs.getString("Cidade_Instrutor"));                  //6  - Cidade
                instrutor.setDataNasc(rs.getString("DataNasc_Instrutor"));              //7  - Data Nasc
                instrutor.setEmail(rs.getString("Email_Instrutor"));                    //8  - Email
                instrutor.setEndereco(rs.getString("Endereco_Instrutor"));              //9  - Endereco
                instrutor.setEstado(rs.getString("Estado_Instrutor"));                  //10 - Estado
                instrutor.setEstadoCivil(rs.getString("EstadoCivil_Instrutor"));        //11 - Estado Civil
                instrutor.setFormacao(rs.getString("Formacao_Instrutor"));              //12 - Formacao
                instrutor.setNome(rs.getString("Nome_Instrutor"));                      //13 - Nome
                instrutor.setRG(rs.getString("RG_Instrutor"));                          //14 - RG
                instrutor.setSexo(rs.getString("Sexo_Instrutor"));                      //15 - Sexo
                instrutor.setTelefone(rs.getString("Telefone_Instrutor"));              //16 - Telefone
                instrutor.setNumero(rs.getInt("Numero_Instrutor"));                     //17 - Numero
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return instrutor;
    }

    /**
     * ************************** EXCLUIR **************************
     */
    public void excluir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TbInstrutor WHERE "
                    + "CPF_Instrutor = ?");

            ps.setString(1, instrutor.getCPF());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o instrutor:\n" + ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
