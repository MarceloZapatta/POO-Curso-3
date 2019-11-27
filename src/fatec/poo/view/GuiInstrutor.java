/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoInstrutor;
import fatec.poo.model.Instrutor;
import static fatec.poo.model.Pessoa.validaCPF;
import javax.swing.JOptionPane;

/**
 *
 * @author zaps
 */
public class GuiInstrutor extends javax.swing.JFrame {

    private Instrutor instrutor = null;
    private DaoInstrutor daoInstrutor = null;
    private Conexao conexao = null;

    /**
     * Creates new form GuiAluno
     */
    public GuiInstrutor() {
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

        lblCPFInstrutor = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
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
        lblEstadoCIvil = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox<>();
        lblDataNasc = new javax.swing.JLabel();
        formattedTxtDataNascimento = new javax.swing.JFormattedTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        formattedTxtCep = new javax.swing.JFormattedTextField();
        lblTelResidencial = new javax.swing.JLabel();
        formattedTxtTelefoneResidencial = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        formattedTxtCelular = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblFormacao = new javax.swing.JLabel();
        txtFormacao = new javax.swing.JTextField();
        lblAreaAtuacao = new javax.swing.JLabel();
        txtAreaAtuacao = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();

        setTitle("Cadastrar instrutor");
        setName("frmInstrutor"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCPFInstrutor.setText("CPF");

        lblNome.setText("Nome");

        lblSexo.setText("Sexo");

        lblEndereco.setText("Endereço");

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

        lblEstadoCIvil.setText("Estado civil");

        cbxEstadoCivil.setEnabled(false);

        lblDataNasc.setText("Data de nascimento");

        try {
            formattedTxtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTxtDataNascimento.setEnabled(false);

        lblNumero.setText("Nº");

        txtNumero.setEnabled(false);

        lblCEP.setText("CEP");

        try {
            formattedTxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTxtCep.setEnabled(false);

        lblTelResidencial.setText("Telefone Residencial");

        try {
            formattedTxtTelefoneResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTxtTelefoneResidencial.setEnabled(false);

        lblCelular.setText("Celular");

        try {
            formattedTxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTxtCelular.setEnabled(false);

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

        lblFormacao.setText("Formação");

        txtFormacao.setEnabled(false);

        lblAreaAtuacao.setText("Área de atuação");

        txtAreaAtuacao.setEnabled(false);

        cbxEstado.setEnabled(false);

        lblEstado.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFormacao)
                    .addComponent(lblEmail)
                    .addComponent(lblCPFInstrutor)
                    .addComponent(lblNome)
                    .addComponent(lblSexo)
                    .addComponent(lblEndereco)
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblEstadoCIvil)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEndereco)
                                    .addComponent(txtCidade)
                                    .addComponent(txtRg)
                                    .addComponent(txtEmail)
                                    .addComponent(formattedTxtCpf)
                                    .addComponent(txtNome))
                                .addGap(3, 3, 3)
                                .addComponent(lblEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAreaAtuacao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDataNasc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCEP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelResidencial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCelular, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formattedTxtTelefoneResidencial)
                            .addComponent(formattedTxtCep, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(formattedTxtDataNascimento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(formattedTxtCelular))
                        .addGap(29, 29, 29))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBairro, txtCidade, txtEmail, txtFormacao, txtRg});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPFInstrutor)
                    .addComponent(formattedTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstadoCIvil)
                            .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBairro)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCidade)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstado)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCelular)
                            .addComponent(formattedTxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataNasc)
                            .addComponent(formattedTxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(formattedTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCEP))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelResidencial)
                            .addComponent(formattedTxtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRG)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormacao)
                    .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAreaAtuacao)
                    .addComponent(txtAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxEstadoCivil, cbxSexo, formattedTxtCelular, formattedTxtCep, formattedTxtCpf, formattedTxtDataNascimento, formattedTxtTelefoneResidencial, txtAreaAtuacao, txtBairro, txtCidade, txtEmail, txtEndereco, txtFormacao, txtNome, txtNumero, txtRg});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        //Obtendo dados
        instrutor = new Instrutor(formattedTxtCpf.getText(), //CPF
                txtNome.getText());                                         //Nome
        txtAreaAtuacao.setText(instrutor.getAreaAtuacao());                 //Area Atuaçção
        txtBairro.setText(instrutor.getBairro());                           //Bairro
        formattedTxtCelular.setText(instrutor.getCelular());                //Celular
        txtCidade.setText(instrutor.getCidade());                           //Cidade
        formattedTxtCep.setText(instrutor.getCEP());                        //CEP
        formattedTxtDataNascimento.setText(instrutor.getDataNasc());        //Data Nascimento
        txtEmail.setText(instrutor.getEmail());                             //E-mail
        txtEndereco.setText(instrutor.getEndereco());                       //Endereço
        cbxEstado.setSelectedItem(instrutor.getEstado());                   //Estado
        cbxEstadoCivil.setSelectedItem(instrutor.getEstadoCivil());         //Estado Civil
        txtNumero.setText(String.valueOf(instrutor.getNumero()));           //Numero 
        txtRg.setText(instrutor.getRG());                                   //RG
        cbxSexo.setSelectedItem(instrutor.getSexo());                       //Sexo
        formattedTxtTelefoneResidencial.setText(instrutor.getTelefone());   //Telefone
        //Chamada do daoInstutor inserir
        daoInstrutor.inserir(instrutor);

        // Limpar componetes
        this.limparCampos();

        // Foco
        formattedTxtCpf.requestFocus();

        // Habilitando componentes
        txtBairro.setEnabled(false);
        formattedTxtCelular.setEnabled(false);
        formattedTxtCep.setEnabled(false);
        txtCidade.setEnabled(false);
        formattedTxtCpf.setEnabled(true);
        txtEmail.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNome.setEnabled(false);
        txtNumero.setEnabled(false);
        txtRg.setEnabled(false);
        formattedTxtTelefoneResidencial.setEnabled(false);
        //CombosBox
        cbxEstado.setEnabled(false);
        cbxEstadoCivil.setEnabled(false);
        cbxSexo.setEnabled(false);
        //Botões
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {//Sim
            //Obtendo alterações
            txtAreaAtuacao.setText(instrutor.getAreaAtuacao());                 //Area Atuaçção
            txtBairro.setText(instrutor.getBairro());                           //Bairro
            formattedTxtCelular.setText(instrutor.getCelular());                //Celular
            txtCidade.setText(instrutor.getCidade());                           //Cidade
            formattedTxtCep.setText(instrutor.getCEP());                        //CEP
            formattedTxtDataNascimento.setText(instrutor.getDataNasc());        //Data Nascimento
            txtEmail.setText(instrutor.getEmail());                             //E-mail
            txtEndereco.setText(instrutor.getEndereco());                       //Endereço
            cbxEstado.setSelectedItem(instrutor.getEstado());                   //Estado
            cbxEstadoCivil.setSelectedItem(instrutor.getEstadoCivil());         //Estado Civil
            txtFormacao.setText(instrutor.getFormacao());                       //Formação
            txtNumero.setText(String.valueOf(instrutor.getNumero()));           //Numero 
            txtRg.setText(instrutor.getRG());                                   //RG
            cbxSexo.setSelectedItem(instrutor.getSexo());                       //Sexo
            formattedTxtTelefoneResidencial.setText(instrutor.getTelefone());   //Telefone
            //Chamada do daoInstutor Alterar
            daoInstrutor.alterar(instrutor);
        }

        // Limpar campos
        this.limparCampos();

        // Foco
        formattedTxtCpf.requestFocus();

        // Habilitando componentes
        //CombosBox
        cbxEstado.setEnabled(false);
        cbxEstadoCivil.setEnabled(false);
        cbxSexo.setEnabled(false);
        //Formatteds
        formattedTxtCelular.setEnabled(false);
        formattedTxtCpf.setEnabled(true);       //CPF TRUE
        formattedTxtCep.setEnabled(false);
        formattedTxtTelefoneResidencial.setEnabled(false);
        // Txts
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtEmail.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNome.setEnabled(false);
        txtNumero.setEnabled(false);
        txtRg.setEnabled(false);

        //Botões
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0) {
            daoInstrutor.excluir(instrutor);

            // Limpar campos
            this.limparCampos();

            // Foco
            formattedTxtCpf.requestFocus();

            // Habilitando componentes
            //CombosBox
            cbxEstado.setEnabled(false);
            cbxEstadoCivil.setEnabled(false);
            cbxSexo.setEnabled(false);
            //Formatteds
            formattedTxtCelular.setEnabled(false);
            formattedTxtCpf.setEnabled(true);       //CPF TRUE
            formattedTxtCep.setEnabled(false);
            formattedTxtTelefoneResidencial.setEnabled(false);
            // Txts
            txtBairro.setEnabled(false);
            txtCidade.setEnabled(false);
            txtEmail.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtFormacao.setEnabled(false);
            txtNome.setEnabled(false);
            txtNumero.setEnabled(false);
            txtRg.setEnabled(false);

            //Botões
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        instrutor = null;

        String cpf = formattedTxtCpf.getText();

        if (validaCPF(cpf) == false) {
            JOptionPane.showMessageDialog(null, "CPF Inválido! Por favor digite"
                    + "um CPF válido! ");
            formattedTxtCpf.setText("");
            btnConsultar.setEnabled(true);
        } else {
            //Chamando o método Consultar da classe DaoInstrutor
            instrutor = daoInstrutor.consultar(formattedTxtCpf.getText());

            if (instrutor == null) {

                /*Habilitando os componentes 
            - CombosBox */
                cbxEstado.setEnabled(true);                                     //Estado
                cbxEstadoCivil.setEnabled(true);                                //Estado Civil
                cbxSexo.setEnabled(true);                                       //Sexo
                //Formatteds
                formattedTxtCelular.setEnabled(true);                           //Celular
                formattedTxtCep.setEnabled(true);                               //CEP
                formattedTxtCpf.setEnabled(false);                              //CPF
                formattedTxtDataNascimento.setEnabled(true);                    //Data Nasc
                formattedTxtTelefoneResidencial.setEnabled(true);               //Telefone
                //Txts
                txtAreaAtuacao.setEnabled(true);                                //Area Atuacao
                txtBairro.setEnabled(true);                                     //Bairro
                txtCidade.setEnabled(true);                                     //Cidade
                txtEmail.setEnabled(true);                                      //Email
                txtEndereco.setEnabled(true);                                   //Endereco
                txtFormacao.setEnabled(true);                                   //Formacao
                txtNome.setEnabled(true);                                       //Nome
                txtNumero.setEnabled(true);                                     //Numero
                txtRg.setEnabled(true);                                         //RG

                //Botões
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);

            } else {
                //Obtendo dados do Instrutor
                txtAreaAtuacao.setText(instrutor.getAreaAtuacao());                 //Area Atuaçção
                txtBairro.setText(instrutor.getBairro());                           //Bairro
                formattedTxtCelular.setText(instrutor.getCelular());                //Celular
                txtCidade.setText(instrutor.getCidade());                           //Cidade
                formattedTxtCep.setText(instrutor.getCEP());                        //CEP
                formattedTxtDataNascimento.setText(instrutor.getDataNasc());        //Data Nascimento
                txtEmail.setText(instrutor.getEmail());                             //E-mail
                txtEndereco.setText(instrutor.getEndereco());                       //Endereço
                cbxEstado.setSelectedItem(instrutor.getEstado());                   //Estado
                cbxEstadoCivil.setSelectedItem(instrutor.getEstadoCivil());         //Estado Civil
                txtFormacao.setText(instrutor.getFormacao());                       //Formação
                txtNumero.setText(String.valueOf(instrutor.getNumero()));           //Numero 
                txtRg.setText(instrutor.getRG());                                   //RG
                cbxSexo.setSelectedItem(instrutor.getSexo());                       //Sexo
                formattedTxtTelefoneResidencial.setText(instrutor.getTelefone());   //Telefone

                // Habilitando componetes
                //CombosBox
                cbxEstado.setEnabled(true);
                cbxEstadoCivil.setEnabled(true);
                cbxSexo.setEnabled(true);
                //FormattedTxt
                formattedTxtCep.setEnabled(true);
                formattedTxtCelular.setEnabled(true);
                formattedTxtCpf.setEnabled(false);
                formattedTxtDataNascimento.setEnabled(true);
                formattedTxtTelefoneResidencial.setEnabled(true);
                // Txts
                txtAreaAtuacao.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCidade.setEnabled(true);
                txtEmail.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtFormacao.setEnabled(true);
                txtNome.setEnabled(true);
                txtNumero.setEnabled(true);
                txtRg.setEnabled(true);

                //Botões
                btnConsultar.setEnabled(true);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        // TODO add your handling code here:
        conexao = new Conexao("BD1813031", "BD1813031");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoInstrutor = new DaoInstrutor(conexao.conectar());

        //Populando Combo box Sexo
        String[] sexos = new String[3];
        sexos[0] = "M";
        sexos[1] = "F";
        sexos[2] = "Outro";

        for (String sexo : sexos) {
            cbxSexo.addItem(sexo);
        }

        ////Populando Combo box estados
        String[] estados = new String[26];
        estados[0] = "AC";
        estados[1] = "AL";
        estados[2] = "AP";
        estados[3] = "AM";
        estados[4] = "BA";
        estados[5] = "CE";
        estados[6] = "DF";
        estados[7] = "ES";
        estados[8] = "GO";
        estados[9] = "MA";
        estados[10] = "MS";
        estados[11] = "MT";
        estados[12] = "MG";
        estados[13] = "PA";
        estados[14] = "PB";
        estados[15] = "PR";
        estados[16] = "PE";
        estados[17] = "PI";
        estados[18] = "RJ";
        estados[19] = "RN";
        estados[20] = "RS";
        estados[21] = "RO";
        estados[22] = "RR";
        estados[22] = "SC";
        estados[23] = "SP";
        estados[24] = "SE";
        estados[25] = "TO";

        for (String estado : estados) {
            cbxEstado.addItem(estado);
        }

        //Populando Combo box estado civil
        String[] estadoCivil = new String[5];
        estadoCivil[0] = "Solteiro";
        estadoCivil[1] = "Casado";
        estadoCivil[2] = "Separado";
        estadoCivil[3] = "Divorciado";
        estadoCivil[4] = "Viúvo";

        for (String civil : estadoCivil) {
            cbxEstadoCivil.addItem(civil);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(GuiInstrutor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiInstrutor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiInstrutor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiInstrutor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiInstrutor().setVisible(true);
            }
        });
    }

    public void limparCampos() {
        txtAreaAtuacao.setText("");
        txtBairro.setText("");
        formattedTxtCelular.setText("");
        txtCidade.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtFormacao.setText("");
        txtNome.setText("");
        txtNumero.setText("");
        txtRg.setText("");

        //Formatted Txts
        formattedTxtCpf.setText("");
        formattedTxtCep.setText("");
        formattedTxtDataNascimento.setText("");
        formattedTxtTelefoneResidencial.setText("");

        //CombosBox
        cbxEstadoCivil.setSelectedItem("");
        cbxSexo.setSelectedItem("");
        cbxEstado.setSelectedItem("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JFormattedTextField formattedTxtCelular;
    private javax.swing.JFormattedTextField formattedTxtCep;
    private javax.swing.JFormattedTextField formattedTxtCpf;
    private javax.swing.JFormattedTextField formattedTxtDataNascimento;
    private javax.swing.JFormattedTextField formattedTxtTelefoneResidencial;
    private javax.swing.JLabel lblAreaAtuacao;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPFInstrutor;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoCIvil;
    private javax.swing.JLabel lblFormacao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelResidencial;
    private javax.swing.JTextField txtAreaAtuacao;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFormacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRg;
    // End of variables declaration//GEN-END:variables
}
