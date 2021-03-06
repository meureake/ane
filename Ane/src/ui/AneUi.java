/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import nios.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deck
 */
public class AneUi extends javax.swing.JFrame {

    /**
     * Creates new form AneUi
     */
    Comp compile = new Comp();
    Ula ula = new Ula();
    BancoRegistradores br = new BancoRegistradores();
    
    PC pc = new PC();
    int i = 0;
    JFileChooser jfc = new JFileChooser();
    DefaultTableModel banReg =  new DefaultTableModel(null, new String[] {"register", "data"} );
    String registersName[] = {"r0", "r1","r2","r3","r4","r5","r6","r7","r8","r9"
            ,"r10","r11","r12","r13","r14","r15","r16","r17","r18","r19","r20",
            "r21","r22","r23","r24","r25","r26","r27","r28","r29","r30","r31"};
    
    private void atualizarRegistradores(){
         for (int i = 0; i < 32; i++) {
            banReg.setValueAt(br.getBancoRegistradores()[i], i, 1);
        }
    }
    private void zerar(BancoRegistradores br){
        br.zerar();
        this.i = 0;
    }
    private String[] getCode(){
        return TextInput.getText().replace(" ", "").split("\n");
    }
    
    public AneUi() {
        
        initComponents();
        
        String linha[] = new String[]{null};
        
        for(int i = 0; i < registersName.length ; i++){
            banReg.addRow(linha);
            banReg.setValueAt(registersName[i], i, 0);
        }
        RegistersSet.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        RegistersSet.getColumnModel().getColumn(0).setPreferredWidth(80);
        RegistersSet.getColumnModel().getColumn(1).setPreferredWidth(272);
        atualizarRegistradores();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEditor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RegistersSet = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextInput = new javax.swing.JTextArea();
        jRun = new javax.swing.JButton();
        jStep = new javax.swing.JButton();
        jZerador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ANE - Another Nios II Emulator");
        setResizable(false);

        jEditor.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jEditor.setText("Editor");

        RegistersSet.setModel(banReg);
        RegistersSet.setAlignmentY(0.1F);
        RegistersSet.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(RegistersSet);

        TextInput.setColumns(20);
        TextInput.setRows(5);
        jScrollPane3.setViewportView(TextInput);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        jRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/run.png"))); // NOI18N
        jRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRunActionPerformed(evt);
            }
        });

        jStep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/step.png"))); // NOI18N
        jStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStepActionPerformed(evt);
            }
        });

        jZerador.setText("zerar");
        jZerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jZeradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(jZerador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jStep))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jStep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEditor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jZerador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jStepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStepActionPerformed
        if(compile.line(pc,ula,br, getCode()[i])){
            atualizarRegistradores();
            i++;
        }
    }//GEN-LAST:event_jStepActionPerformed

    private void jRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRunActionPerformed

        String code[] = getCode();
        while(compile.line(pc, ula, br, code[this.i])){
            atualizarRegistradores();
            i++;
        }
        
    }//GEN-LAST:event_jRunActionPerformed

    private void jZeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jZeradorActionPerformed
        zerar(br);
        atualizarRegistradores();
    }//GEN-LAST:event_jZeradorActionPerformed

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
            java.util.logging.Logger.getLogger(AneUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AneUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AneUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AneUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AneUi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RegistersSet;
    private javax.swing.JTextArea TextInput;
    private javax.swing.JLabel jEditor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRun;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jStep;
    private javax.swing.JButton jZerador;
    // End of variables declaration//GEN-END:variables
}
