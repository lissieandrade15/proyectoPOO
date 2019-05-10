
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DESanchezA
 */
public class Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    Equipo oEquipo = new Equipo();
    Liga oLiga = new Liga();
    Torneo oTorneo = new Torneo();
    Calendario oCalendario = new Calendario();
    String calendario = "";
    public Ventana1() {
        initComponents();
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
        nombreEquipo = new javax.swing.JTextField();
        bAgregarEquipo = new javax.swing.JButton();
        bIniciarTorneo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bIniciarTorneo1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre Equipo");

        nombreEquipo.setName("nombre"); // NOI18N

        bAgregarEquipo.setText("Agregar Equipo");
        bAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarEquipoActionPerformed(evt);
            }
        });

        bIniciarTorneo.setText("Iniciar Torneo con Vuelta");
        bIniciarTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarTorneoActionPerformed(evt);
            }
        });

        jButton1.setText("Ver Caledario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bIniciarTorneo1.setText("Iniciar Torneo sin Vuelta");
        bIniciarTorneo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarTorneo1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar Calendario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bAgregarEquipo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bIniciarTorneo)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(bIniciarTorneo1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAgregarEquipo))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIniciarTorneo)
                    .addComponent(bIniciarTorneo1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarEquipoActionPerformed
        Equipo equipo = new Equipo();
        equipo.setNombre(nombreEquipo.getText());
        nombreEquipo.setText("");
        oTorneo.agregarEquipo(equipo); 
        equipo = null;
    }//GEN-LAST:event_bAgregarEquipoActionPerformed

    private void bIniciarTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarTorneoActionPerformed
        oTorneo.iniciarTorneo1();
        calendario = "";
        for(int y=0;y<oTorneo.getEquiposJugando().size();y++){
            Equipo eq = (Equipo) oTorneo.getEquiposJugando().get(y);
            for(int z=0;z<eq.getOpositores().size();z++){
                //oCalendario.setVisible(true);
                calendario += eq.getNombre() + " Vs. " + eq.getOpositores().get(z) + "\n";
                
            }
        }
        oCalendario.calendario.setText(calendario);
    }//GEN-LAST:event_bIniciarTorneoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        oCalendario.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bIniciarTorneo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarTorneo1ActionPerformed
        // TODO add your handling code here:
        oTorneo.iniciarTorneo2();
        calendario = "";
        for(int y=0;y<oTorneo.getEquiposJugando().size();y++){
            Equipo eq = (Equipo) oTorneo.getEquiposJugando().get(y);
            for(int z=0;z<eq.getOpositores().size();z++){
                //oCalendario.setVisible(true);
                calendario += eq.getNombre() + " Vs. " + eq.getOpositores().get(z) + "\n";   
            }
        }
        oCalendario.calendario.setText(calendario);
    }//GEN-LAST:event_bIniciarTorneo1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        calendario = "";
        oCalendario.calendario.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarEquipo;
    private javax.swing.JButton bIniciarTorneo;
    private javax.swing.JButton bIniciarTorneo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nombreEquipo;
    // End of variables declaration//GEN-END:variables
}
