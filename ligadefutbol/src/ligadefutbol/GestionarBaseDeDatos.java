/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligadefutbol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Carol Andrade
 */
public class GestionarBaseDeDatos extends javax.swing.JFrame {

    /**
     * Creates new form ejemploPostgre
     */
    public GestionarBaseDeDatos() {
        initComponents();
        textPane.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenu1 = new javax.swing.JMenu();
        jScrollPane3 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        nombreTf = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        idequipoTf = new javax.swing.JTextField();
        directivosTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_elimnar_equipo = new javax.swing.JButton();
        idequipo_eliminar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane3.setViewportView(textPane);

        nombreTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTfActionPerformed(evt);
            }
        });

        button.setText("Ver Datos Almacenados");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Equipo");

        jLabel2.setText("Visualizar");

        jLabel3.setText("Nombre");

        jLabel4.setText("Directivos");

        btn_elimnar_equipo.setText("Eliminar");
        btn_elimnar_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimnar_equipoActionPerformed(evt);
            }
        });

        jLabel6.setText("ID equipo eliminar");

        btn_editar.setText("Guardar Edicion");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jSeparator1)
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(directivosTf, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(115, 115, 115)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_elimnar_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idequipo_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(idequipoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idequipo_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_elimnar_equipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(editar)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idequipoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(directivosTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(button)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        actualizarPagina();
    }//GEN-LAST:event_buttonActionPerformed
    
    public void actualizarPagina(){
    
    try (
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/LigaFutbolG", "postgres", "hola")) {
            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within 
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver"); 

            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            //ResultSet resultSet = statement.executeQuery("INSERT INTO public.equipo (idequipo,nombre,directivos) VALUES (1,'alvarez','luis');");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.equipo;");
            ArrayList arr = new ArrayList();
            String row;
            while (resultSet.next()) {
                row = new String();
                row = "";
                row += resultSet.getString("idequipo") + "\t"
                        + resultSet.getString("nombre") + "\t"
                        + resultSet.getString("directivos");
                arr.add(row);
            }
            String result = "";
            result += "idequipo" + "\t";
            result += "nombre" + "\t";
            result += "directivos" + "\t";
            result += "\n";
            for (int i = 0; i < arr.size(); i++) {
                result += arr.get(i) + "\n";
            }
            textPane.setText(result);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private void nombreTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idequipo = idequipoTf.getText();
        String nombre = nombreTf.getText();
        String directivos = directivosTf.getText();
        try (
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/LigaFutbolG", "postgres", "hola")) {
            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within 
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver"); 

            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            String queryString
                    = String.format("INSERT INTO public.equipo (idequipo,nombre,directivos) VALUES (%s,'%s','%s');", idequipo, nombre, directivos);
            ResultSet resultSet = statement.executeQuery(queryString);
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Guardado");
        }
        actualizarPagina();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_elimnar_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimnar_equipoActionPerformed
        // TODO add your handling code here:
        String idequipo = idequipo_eliminar.getText();
    
        try (
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/LigaFutbolG", "postgres", "hola")) {
            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within 
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver"); 

            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            //String queryString
                 //   = String.format("INSERT INTO public.equipo (idequipo,nombre,directivos) VALUES (%s,'%s','%s');", idequipo, nombre, directivos);
            ResultSet resultSet = statement.executeQuery("delete from equipo where idequipo="+idequipo);
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Eliminado");
        }
       actualizarPagina();
    }//GEN-LAST:event_btn_elimnar_equipoActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        String idequipo = idequipoTf.getText();
        String nombre = nombreTf.getText();
        String directivos = directivosTf.getText();
        try (
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/LigaFutbolG", "postgres", "hola")) {
            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within 
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver"); 

            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            //String queryString
              //      = String.format("INSERT INTO public.equipo (nombre,directivos) VALUES ('%s','%s');", nombre, directivos);
            String queryString= "UPDATE equipo SET nombre='"+nombre+"', directivos='"+directivos+"' WHERE idequipo="+idequipo+";";
              ResultSet resultSet = statement.executeQuery(queryString);
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Actualizado");
        }
        actualizarPagina();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jLabel1.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        idequipoTf.setVisible(true);
        nombreTf.setVisible(true);
        directivosTf.setVisible(true);
        jButton1.setVisible(true);
        button.setVisible(true);
        
        btn_editar.setVisible(false);
        btn_elimnar_equipo.setVisible(false);
        jLabel6.setVisible(false);
        idequipo_eliminar.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
        btn_editar.setVisible(true);
        jLabel1.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        idequipoTf.setVisible(true);
        nombreTf.setVisible(true);
        directivosTf.setVisible(true);
        jButton1.setVisible(false);
        btn_elimnar_equipo.setVisible(false);
        jLabel6.setVisible(false);
        idequipo_eliminar.setVisible(false);
    }//GEN-LAST:event_editarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        btn_editar.setVisible(false);
        btn_elimnar_equipo.setVisible(true);
        jLabel6.setVisible(true);
        idequipo_eliminar.setVisible(true);
        jLabel1.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        idequipoTf.setVisible(false);
        nombreTf.setVisible(false);
        directivosTf.setVisible(false);
        jButton1.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarBaseDeDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_elimnar_equipo;
    private javax.swing.JButton button;
    private javax.swing.JTextField directivosTf;
    private javax.swing.JButton editar;
    private javax.swing.JTextField idequipoTf;
    private javax.swing.JTextField idequipo_eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JTextPane textPane;
    // End of variables declaration//GEN-END:variables
}
