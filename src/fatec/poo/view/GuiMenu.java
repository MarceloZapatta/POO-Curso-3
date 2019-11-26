/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

/**
 *
 * @author Lucas
 *         Marcelo
 *         Savini
 */
public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form jFrameMenu
     */
    public GuiMenu() {
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

        menuBarPrincipal = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuCurso = new javax.swing.JMenuItem();
        menuTurma = new javax.swing.JMenuItem();
        menuInstrutor = new javax.swing.JMenuItem();
        menuAluno = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSair = new javax.swing.JMenuItem();
        menuOperacoes = new javax.swing.JMenu();
        menuAlocarInstrutor = new javax.swing.JMenuItem();
        menuEfetuarMatricula = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho POO");
        setName("frmMenu"); // NOI18N

        menuCadastros.setMnemonic('c');
        menuCadastros.setText("Cadastros");

        menuCurso.setMnemonic('u');
        menuCurso.setText("Curso");
        menuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCursoActionPerformed(evt);
            }
        });
        menuCadastros.add(menuCurso);

        menuTurma.setMnemonic('t');
        menuTurma.setText("Turma");
        menuTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTurmaActionPerformed(evt);
            }
        });
        menuCadastros.add(menuTurma);

        menuInstrutor.setMnemonic('i');
        menuInstrutor.setText("Instrutor");
        menuInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInstrutorActionPerformed(evt);
            }
        });
        menuCadastros.add(menuInstrutor);

        menuAluno.setMnemonic('a');
        menuAluno.setText("Aluno");
        menuAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlunoActionPerformed(evt);
            }
        });
        menuCadastros.add(menuAluno);
        menuCadastros.add(jSeparator1);

        menuSair.setMnemonic('s');
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuCadastros.add(menuSair);

        menuBarPrincipal.add(menuCadastros);

        menuOperacoes.setMnemonic('o');
        menuOperacoes.setText("Operações");

        menuAlocarInstrutor.setMnemonic('l');
        menuAlocarInstrutor.setText("Alocar instrutor");
        menuOperacoes.add(menuAlocarInstrutor);

        menuEfetuarMatricula.setMnemonic('e');
        menuEfetuarMatricula.setText("Efetuar matrícula");
        menuOperacoes.add(menuEfetuarMatricula);

        menuBarPrincipal.add(menuOperacoes);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCursoActionPerformed
        GuiCurso guiCurso = new GuiCurso();
        guiCurso.setVisible(true);
    }//GEN-LAST:event_menuCursoActionPerformed

    private void menuTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTurmaActionPerformed
        GuiTurma guiTurma = new GuiTurma();
        guiTurma.setVisible(true);
    }//GEN-LAST:event_menuTurmaActionPerformed

    private void menuInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInstrutorActionPerformed
        GuiInstrutor guiInstrutor = new GuiInstrutor();
        guiInstrutor.setVisible(true);
    }//GEN-LAST:event_menuInstrutorActionPerformed

    private void menuAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlunoActionPerformed
        GuiAluno guiAluno = new GuiAluno();
        guiAluno.setVisible(true);
    }//GEN-LAST:event_menuAlunoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuAlocarInstrutor;
    private javax.swing.JMenuItem menuAluno;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuCurso;
    private javax.swing.JMenuItem menuEfetuarMatricula;
    private javax.swing.JMenuItem menuInstrutor;
    private javax.swing.JMenu menuOperacoes;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuTurma;
    // End of variables declaration//GEN-END:variables
}
