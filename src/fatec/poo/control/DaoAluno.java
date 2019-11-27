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
 * @author Lucas
 *         Marcelo
 *         Savini
 */
public class DaoAluno {

    private Connection conn;

    public DaoAluno(Connection conn) {
        this.conn = conn;
    }

    /**************************** INSERIR ***************************/
    public void inserir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TbAluno"    
                    + " (CPF_Aluno,"                                            //1  - CPF  
                    + " Nome_Aluno,"                                            //2  - Nome
                    + " Bairro_Aluno,"                                          //3  - Bairro
                    + " Celular_Aluno,"                                         //4  - Celular
                    + " CEP_Aluno,"                                             //5  - CEP
                    + " Cidade_Aluno,"                                          //6  - Cidade
                    + " DataNasc_Aluno,"                                        //7  - Data Nasc
                    + " Email_Aluno, "                                          //8  - Email
                    + " Endereco_Aluno,"                                        //9  - Endereço
                    + " Escolaridade_Aluno,"                                    //10 - Escolaridade
                    + " Estado_Aluno,"                                          //11 - Estado
                    + " EstadoCivil_Aluno,"                                     //12 - Estado Civil
                    + " RG_Aluno,"                                              //13 - RG
                    + " Sexo_Aluno, "                                           //14 - Sexo
                    + " Telefone_Aluno,"                                        //15 - Telefone
                    + " Numero_Aluno)"                                          //16 - Numero
                    + " VALUES "
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                     // 1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7 
            ps.setString(1, aluno.getCPF());                                    //1  - CPF 
            ps.setString(2, aluno.getNome());                                   //2  - Nome
            ps.setString(3, aluno.getBairro());                                 //3  - Bairro
            ps.setString(4, aluno.getCelular());                                //4  - Celular
            ps.setString(5, aluno.getCEP());                                    //5  - CEP
            ps.setString(6, aluno.getCidade());                                 //6  - Cidade
            ps.setString(7, aluno.getDataNasc());                               //7  - Data Nasc
            ps.setString(8, aluno.getEmail());                                  //8  - Email
            ps.setString(9, aluno.getEndereco());                               //9  - Endereço
            ps.setString(10, aluno.getEscolaridade());                          //10 - Escolaridade
            ps.setString(11, aluno.getEstado());                                //11 - Estado
            ps.setString(12, aluno.getEstadoCivil());                           //12 - Estado Civil
            ps.setString(13, aluno.getRG());                                    //13 - RG
            ps.setString(14, aluno.getSexo());                                  //14 - Sexo
            ps.setString(15, aluno.getTelefone());                              //15 - Telefone
            ps.setInt(16, aluno.getNumero());                                   //16 - Número
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    /**************************** ALTERAR ***************************/
    public void alterar(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TbAluno SET"
                    + " Nome_Aluno = ?,"                                        //1  - Nome
                    + " Bairro_Aluno = ?,"                                      //2  - Bairro
                    + " Celular_Aluno = ?,"                                     //3  - Celular
                    + " CEP_Aluno = ?,"                                         //4  - CEP
                    + " Cidade_Aluno = ?,"                                      //5  - Cidade
                    + " DataNasc_Aluno = ?,"                                    //6  - Data Nasc
                    + " Email_Aluno = ?,"                                       //7  - Email
                    + " Endereco_Aluno = ?,"                                    //8  - Endereço
                    + " Escolaridade_Aluno = ?,"                                //9  - Escolaridade
                    + " Estado_Aluno = ?,"                                      //10 - Estado
                    + " EstadoCivil_Aluno = ?,"                                 //11 - Estado Civil
                    + " RG_Aluno = ?,"                                          //12 - RG
                    + " Sexo_Aluno = ?,"                                        //13 - Sexo
                    + " Telefone_Aluno = ?,"                                    //14 - Telefone
                    + " Numero_Aluno = ?"                                       //15 - Numero
                    + " WHERE"                                                  // WHERE
                    + " CPF_Aluno = ?");                                         //16 - CPF

            ps.setString(1, aluno.getNome());                                   //1  - Nome
            ps.setString(2, aluno.getBairro());                                 //2  - Bairo
            ps.setString(3, aluno.getCelular());                                //3  - Celular
            ps.setString(4, aluno.getCEP());                                    //4  - CEP
            ps.setString(5, aluno.getCidade());                                 //5  - Cidade
            ps.setString(6, aluno.getDataNasc());                               //6  - Data Nasc
            ps.setString(7, aluno.getEmail());                                  //7  - Email
            ps.setString(8, aluno.getEndereco());                               //8  - Endereço
            ps.setString(9, aluno.getEscolaridade());                           //9  - Escolaridade
            ps.setString(10, aluno.getEstado());                                //10 - Estado
            ps.setString(11, aluno.getEstadoCivil());                           //11 - Estado Civil
            ps.setString(12, aluno.getRG());                                    //12 - RG
            ps.setString(13, aluno.getSexo());                                  //13 - Sexo
            ps.setString(14, aluno.getTelefone());                              //14 - Telefone
            ps.setInt(15, aluno.getNumero());                                   //15 - Numero
            ps.setString(16, aluno.getCPF());                                   //16 - CPF
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    /**************************** CONSULTAR ***************************/
    public Aluno consultar(String cpf) {
        Aluno aluno = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TbAluno WHERE"
                    + " CPF_Aluno = ?");                                        //1 - CPF

            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                aluno = new Aluno(cpf, rs.getString("Nome_Aluno"));             //2 - Nome
                aluno.setBairro(rs.getString("Bairro_Aluno"));                  //3 - Bairro
                aluno.setCelular(rs.getString("Celular_Aluno"));                //4 - Celular
                aluno.setCEP(rs.getString("CEP_Aluno"));                        //5 - CEP
                aluno.setCidade(rs.getString("Cidade_Aluno"));                  //6 - Cidade
                aluno.setDataNasc(rs.getString("DataNasc_Aluno"));              //7 - Data Nasc
                aluno.setEmail(rs.getString("Email_Aluno"));                    //8 - Email
                aluno.setEndereco(rs.getString("Endereco_Aluno"));              //9 - Endereço
                aluno.setEscolaridade(rs.getString("Escolaridade_Aluno"));      //10 - Escolaridade
                aluno.setEstado(rs.getString("Estado_Aluno"));                  //11 - Estado
                aluno.setEstadoCivil(rs.getString("EstadoCivil_Aluno"));        //12 - Estado Civil
                aluno.setRG(rs.getString("RG_Aluno"));                          //13 - RG
                aluno.setSexo(rs.getString("Sexo_Aluno"));                      //14 - Sexo
                aluno.setTelefone(rs.getString("Telefone_Aluno"));              //15 - Telefone
                aluno.setNumero(rs.getInt("Numero_Aluno"));                     //16 - Número
           
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (aluno);
    }

    /**************************** EXCLUIR ***************************/
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
