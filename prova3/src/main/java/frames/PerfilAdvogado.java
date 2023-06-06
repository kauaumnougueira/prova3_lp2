/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import classes_principais.Advogado;
import classes_principais.Sistema;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author kaua
 */
public class PerfilAdvogado extends javax.swing.JFrame {
    /**
     * Creates new form PerfilAdvogado
     * @param advogado
     */
    private final Advogado advogado;
    private Sistema banco;
    
    String nome_oficial;
    String codigo_oficial;
    
    public PerfilAdvogado(Advogado advogado, Sistema banco){
        this.banco = banco;
        this.advogado = advogado;
        initComponents();
        String nome = this.advogado.getNome();
        nome_oficial = nome;
        String codigo = this.advogado.getCodigo();
        codigo_oficial = codigo;
        editavel(nome_oficial, codigo_oficial);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codigo_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome_txt = new javax.swing.JTextField();
        editar_btn = new javax.swing.JButton();
        salvar_btn = new javax.swing.JButton();
        manter_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("PERFIL  ADVOGADO:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Código:");

        nome_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_txtActionPerformed(evt);
            }
        });

        editar_btn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editar_btn.setText("Editar");
        editar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_btnActionPerformed(evt);
            }
        });

        salvar_btn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        salvar_btn.setText("Salvar");
        salvar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_btnActionPerformed(evt);
            }
        });

        manter_btn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        manter_btn.setText("Manter");
        manter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manter_btnActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(editar_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(manter_btn)
                        .addGap(18, 18, 18)
                        .addComponent(salvar_btn)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvar_btn)
                    .addComponent(jButton1))
                .addGap(65, 65, 65))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void editavel(String nome, String codigo){
        editar_btn.setVisible(true);
       // adcionar_btn.setVisible(true);
        nome_txt.setEnabled(false);
        nome_txt.setDisabledTextColor(UIManager.getColor("TextField.foreground"));
        nome_txt.setCaretColor(UIManager.getColor("TextField.caretForeground"));
        codigo_txt.setEnabled(false);
        codigo_txt.setDisabledTextColor(UIManager.getColor("TextField.foreground"));
        codigo_txt.setCaretColor(UIManager.getColor("TextField.caretForeground"));
        salvar_btn.setVisible(false);
        manter_btn.setVisible(false);
        
        if(nome != null && codigo != null){
            nome_txt.setText(nome);
            codigo_txt.setText(codigo);
        }else{
            JOptionPane.showMessageDialog(null, "CAMPOS NÃO PREENCHIDO", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
       
    }
    
    private void editar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_btnActionPerformed
        //habilitar campos e botão salvar
        nome_txt.setEnabled(true);
        codigo_txt.setEnabled(true);
        salvar_btn.setVisible(true);
        manter_btn.setVisible(true);
        //desabilitar campo editar e adcionar processo
       // adcionar_btn.setVisible(false);
        editar_btn.setVisible(false);
        
    }//GEN-LAST:event_editar_btnActionPerformed

    private void nome_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_txtActionPerformed

    }//GEN-LAST:event_nome_txtActionPerformed

    private void salvar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_btnActionPerformed
        String nome = nome_txt.getText();
        String codigo = codigo_txt.getText();
        this.advogado.setNome(nome);
        this.advogado.setCodigo(codigo);
        //se houver mais de um advogado, então remove o anterior e adciona o novo da lista (no futuro eu vou entender)
        new PerfilAdvogado(advogado, banco).setVisible(true);
        dispose();
    }//GEN-LAST:event_salvar_btnActionPerformed

    private void manter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manter_btnActionPerformed
        editavel(nome_oficial, codigo_oficial);
    }//GEN-LAST:event_manter_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Home(banco).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo_txt;
    private javax.swing.JButton editar_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manter_btn;
    private javax.swing.JTextField nome_txt;
    private javax.swing.JButton salvar_btn;
    // End of variables declaration//GEN-END:variables
}
