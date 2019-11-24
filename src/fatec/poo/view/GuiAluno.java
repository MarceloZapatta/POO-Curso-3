/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoAluno;
import fatec.poo.model.Aluno;
import fatec.poo.model.Pessoa;
import static fatec.poo.model.Pessoa.validaCPF;
import javax.swing.JOptionPane;

/**
 *
 * @author zaps
 */
public class GuiAluno extends javax.swing.JFrame {
    private Conexao conexao = null;
    private DaoAluno daoAluno = null;
    private Aluno aluno = null;
    private Pessoa pessoa = null;

    /**
     * Creates new form GuiAluno
     */
    public GuiAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCPFaluno = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEndreco = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        formattedTxtCpf = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtRg = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        lblEstadoCivil = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox<>();
        lblDataNasc = new javax.swing.JLabel();
        lblEscolaridade = new javax.swing.JLabel();
        formattedTxtDataNascimento = new javax.swing.JFormattedTextField();
        cbxEscolaridade = new javax.swing.JComboBox<>();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        lblTelResidencial = new javax.swing.JLabel();
        txtTelefoneResidencial = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();

        setTitle("Cadastrar aluno");
        setName("frmAluno"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCPFaluno.setText("CPF");

        lblNome.setText("Nome");

        lblSexo.setText("Sexo");

        lblEndreco.setText("Endereço");

        lblBairro.setText("Bairro");

        lblCidade.setText("Cidade");

        lblRG.setText("RG");

        lblEmail.setText("Email");

        try {
            formattedTxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtBairro.setEnabled(false);

        txtCidade.setEnabled(false);

        txtRg.setEnabled(false);

        txtEmail.setEnabled(false);

        cbxSexo.setEnabled(false);

        lblEstadoCivil.setText("Estado civil");

        cbxEstadoCivil.setEnabled(false);

        lblDataNasc.setText("Data de nascimento");

        lblEscolaridade.setText("Escolaridade");

        try {
            formattedTxtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTxtDataNascimento.setEnabled(false);

        cbxEscolaridade.setEnabled(false);

        lblNumero.setText("Nº");

        txtNumero.setEnabled(false);

        lblCEP.setText("CEP");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setEnabled(false);

        lblTelResidencial.setText("Telefone Residencial");

        try {
            txtTelefoneResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneResidencial.setEnabled(false);

        lblCelular.setText("Celular");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblEstado.setText("Estado");

        cbxEstado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail)
                    .addComponent(lblCPFaluno)
                    .addComponent(lblNome)
                    .addComponent(lblSexo)
                    .addComponent(lblEndreco)
                    .addComponent(lblBairro)
                    .addComponent(lblCidade)
                    .addComponent(lblRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)
                        .addContainerGap(106, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblEstadoCivil)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtEndereco)
                                .addComponent(txtRg)
                                .addComponent(txtEmail)
                                .addComponent(formattedTxtCpf)
                                .addComponent(txtNome))
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEscolaridade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDataNasc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCEP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelResidencial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCelular, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxEscolaridade, 0, 171, Short.MAX_VALUE)
                            .addComponent(formattedTxtDataNascimento)
                            .addComponent(txtNumero)
                            .addComponent(txtCep)
                            .addComponent(txtTelefoneResidencial)
                            .addComponent(txtCelular))
                        .addGap(29, 29, 29))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBairro, txtCidade, txtEmail, txtRg});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPFaluno)
                    .addComponent(formattedTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataNasc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(formattedTxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoCivil)
                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscolaridade)
                    .addComponent(cbxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndreco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEP)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstado)
                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCidade)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelResidencial)
                        .addComponent(txtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRG)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxEscolaridade, cbxEstadoCivil, cbxSexo, formattedTxtCpf, formattedTxtDataNascimento, txtBairro, txtCelular, txtCep, txtCidade, txtEmail, txtEndereco, txtNome, txtNumero, txtRg, txtTelefoneResidencial});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        lblEstado.getAccessibleContext().setAccessibleDescription("");
        cbxEstado.getAccessibleContext().setAccessibleName("");
        cbxEstado.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("BD1813031", "BD1813031");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoAluno = new DaoAluno(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0) {
            daoAluno.excluir(aluno);

            // Limpa os campos
            this.limparCampos();

            /*Habilitando componentes
            - Txts */
            formattedTxtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtBairro.setEnabled(false);
            txtCelular.setEnabled(false);
            txtCep.setEnabled(false);
            txtCidade.setEnabled(false);
            txtEmail.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtNumero.setEnabled(false);
            txtRg.setEnabled(false);
            txtTelefoneResidencial.setEnabled(false);
            //CombosBox
            cbxEscolaridade.setEnabled(false);
            cbxEstadoCivil.setEnabled(false);
            cbxSexo.setEnabled(false);
            //Botões
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        //Obtendo dados
        String cpf;
        cpf = formattedTxtCpf.getText();

        if (validaCPF(cpf) == false) {
            JOptionPane.showMessageDialog(null, "CPF Inválido! Por favor digite"
                    + "um CPF válido! ");
            formattedTxtCpf.setText("");
            btnConsultar.setEnabled(true);
        } else {
            aluno = new Aluno(formattedTxtCpf.getText(),
                    txtNome.getText());
            aluno.setBairro(txtBairro.getText());
            aluno.setCEP(txtCep.getText());
            aluno.setCelular(txtCelular.getText());
            aluno.setCidade(txtCidade.getText());
            aluno.setDataNasc(formattedTxtDataNascimento.getText());
            aluno.setEmail(txtEmail.getText());
            aluno.setEndereco(txtEndereco.getText());
            aluno.setEscolaridade(cbxEscolaridade.getSelectedItem().toString());
            aluno.setEstado(cbxEstado.getSelectedItem().toString());
            aluno.setEstadoCivil(cbxEstadoCivil.getSelectedItem().toString());
            aluno.setNumero(Integer.parseInt(txtNumero.getText()));
            aluno.setRG(txtRg.getText());
            aluno.setSexo(cbxSexo.getSelectedItem().toString());
            aluno.setTelefone(txtTelefoneResidencial.getText());
            daoAluno.inserir(aluno);
            
            // Limpando os campos
            this.limparCampos();

            // Habilintandos txts
            formattedTxtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtBairro.setEnabled(false);
            txtCelular.setEnabled(false);
            txtCep.setEnabled(false);
            txtCidade.setEnabled(false);
            txtEmail.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtNumero.setEnabled(false);
            txtRg.setEnabled(false);
            txtTelefoneResidencial.setEnabled(false);
            
            //CombosBox
            cbxEscolaridade.setEnabled(false);
            cbxEstadoCivil.setEnabled(false);
            cbxSexo.setEnabled(false);
            
            //Botões
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {//Sim
            // Obtendo alterações
            aluno.setBairro(txtBairro.getText());
            aluno.setCEP(txtCep.getText());
            aluno.setCelular(txtCelular.getText());
            aluno.setCidade(txtCidade.getText());
            aluno.setDataNasc(formattedTxtDataNascimento.getText());
            aluno.setEmail(txtEmail.getText());
            aluno.setEndereco(txtEndereco.getText());
            aluno.setEscolaridade(cbxEscolaridade.getSelectedItem().toString());
            aluno.setEstado(cbxEstado.getSelectedItem().toString());
            aluno.setEstadoCivil(cbxEstadoCivil.getSelectedItem().toString());
            aluno.setNome(txtNome.getText());
            aluno.setNumero(Integer.parseInt(txtNumero.getText()));
            aluno.setRG(txtRg.getText());
            aluno.setSexo(cbxSexo.getSelectedItem().toString());
            aluno.setTelefone(txtTelefoneResidencial.getText());
            daoAluno.alterar(aluno);
        }
       
        // Limpando os txts
        this.limparCampos();

        // Habilitando txts
        formattedTxtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCelular.setEnabled(false);
        txtCep.setEnabled(false);
        txtCidade.setEnabled(false);
        txtEmail.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtRg.setEnabled(false);
        txtTelefoneResidencial.setEnabled(false);
        
        // Habilitnado combosBox
        cbxEscolaridade.setEnabled(false);
        cbxEstadoCivil.setEnabled(false);
        cbxSexo.setEnabled(false);
        
        //Botões
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        aluno = null;
        String cpf = formattedTxtCpf.getText();

        if (validaCPF(cpf) == false) {
            JOptionPane.showMessageDialog(null, "CPF Inválido! Por favor digite"
                    + "um CPF válido! ");
            formattedTxtCpf.setText("");
            btnConsultar.setEnabled(true);
        } else {
            aluno = daoAluno.consultar(formattedTxtCpf.getText());

            if (aluno == null) {
                // Habilitando os txts
                formattedTxtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCelular.setEnabled(true);
                txtCep.setEnabled(true);
                txtCidade.setEnabled(true);
                txtEmail.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNumero.setEnabled(true);
                txtRg.setEnabled(true);
                txtTelefoneResidencial.setEnabled(true);
                
                //Foco
                txtNome.requestFocus();
                
                //CombosBox
                cbxEscolaridade.setEnabled(true);
                cbxEstadoCivil.setEnabled(true);
                cbxSexo.setEnabled(true);
                
                //Botões
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            } else {
                // Preenchendo dados
                txtNome.setText(aluno.getNome());
                txtBairro.setText(aluno.getBairro());
                txtCep.setText(aluno.getCEP());
                txtCelular.setText(aluno.getCelular());
                txtCidade.setText(aluno.getCidade());
                formattedTxtDataNascimento.setText(aluno.getDataNasc());
                txtEmail.setText(aluno.getEmail());
                txtEndereco.setText(aluno.getEmail());
                cbxEscolaridade.setSelectedItem(aluno.getEscolaridade());
                cbxEstado.setSelectedItem(aluno.getEstado());
                txtNumero.setText(String.valueOf(aluno.getNumero()));
                txtRg.setText(aluno.getRG());
                cbxSexo.setSelectedItem(aluno.getSexo());
                txtTelefoneResidencial.setText(aluno.getTelefone());
                
                // Habilitando os Txts
                formattedTxtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCelular.setEnabled(true);
                txtCep.setEnabled(true);
                txtCidade.setEnabled(true);
                txtEmail.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNumero.setEnabled(true);
                txtRg.setEnabled(true);
                txtTelefoneResidencial.setEnabled(true);
                
                //Foco
                txtNome.requestFocus();
                
                //CombosBox
                cbxEscolaridade.setEnabled(true);
                cbxEstadoCivil.setEnabled(true);
                cbxSexo.setEnabled(true);
                
                //Botões
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAluno().setVisible(true);
            }
        });
    }
    
    public void limparCampos() {
        formattedTxtCpf.setText("");
        txtNome.setText("");
        formattedTxtCpf.requestFocus();
        txtBairro.setText("");
        txtCelular.setText("");
        txtCep.setText("");
        txtCidade.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtRg.setText("");
        txtTelefoneResidencial.setText("");
        
        // Deselecionando combobox
        cbxEscolaridade.setSelectedItem("");
        cbxEstadoCivil.setSelectedItem("");
        cbxSexo.setSelectedItem("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxEscolaridade;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JFormattedTextField formattedTxtCpf;
    private javax.swing.JFormattedTextField formattedTxtDataNascimento;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPFaluno;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndreco;
    private javax.swing.JLabel lblEscolaridade;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelResidencial;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefoneResidencial;
    // End of variables declaration//GEN-END:variables
}
