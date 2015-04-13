/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.table.DefaultTableModel;
import Cuentas.*;
import Clientes.*;
import BaseDeDatos.*;
import java.sql.*;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author programador
 */
public class VEntanaPrinci extends javax.swing.JFrame {

    /**
     * Creates new form VEntanaPrinci
     */
    DefaultTableModel tabla1;
    DBA con2 = new DBA();
    Cuentas cdt1 = new Cdt();
    Cuentas Ahor = new CuentaAhorros();
    Cuentas Corr = new CuentaCorriente();
    //variables registro
    String usuario = "root";
    String password = "";
    //VARIABLES
    String cedula;
    String nombre;
    String numeroCuenta;
    String idtipocuenta;
    String saldo;
    //tabla
    String[] registros = new String[5];
    String[] titulos = {"Cedula", "Nombre", "Cuenta N°", "Tipo Cuenta", "Saldo"};
    ///tipo conexion
    public Boolean conec = false;

    public VEntanaPrinci() {
        setTitle("Banco Arcoiris-consulta clientes-CArlos Orjuela");
        initComponents();
        cargar("");
        contador();

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
        cajaText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Contador = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        numSalMayor = new javax.swing.JTextField();
        numsalMenor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero de Cuenta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Busqueda");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Busqueda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ingresar Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("numero de clientes");

        Contador.setText("jLabel4");

        jButton4.setText("Mayor Saldo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Menor Saldo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        numSalMayor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numSalMayor.setText("5");
        numSalMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSalMayorActionPerformed(evt);
            }
        });

        numsalMenor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numsalMenor.setText("3");

        jLabel4.setText("Clientes con:");

        jButton6.setText("MySQL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Access");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setText("Conexion con base de datos");

        jButton8.setText("Clientes por cuenta");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel7.setText("Carlos Orjuela");

        jLabel8.setText("Numero Clientes por tipo:");

        jButton9.setText("Realizar movimiento");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setText("Cliente");

        jButton10.setText("simulacion-hilos");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addGap(30, 30, 30))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(numSalMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(numsalMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Contador))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24)))
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10)
                            .addComponent(jButton2))))
                .addGap(75, 75, 75)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cajaText, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(jButton9))
                    .addComponent(jLabel9))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cajaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(numSalMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(numsalMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Contador))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel7)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String f, regreso;
        boolean conect = true;

        try {
            f = cajaText.getText();
            System.out.println(f);
            if (conec) {

                con2.conexionSql();
                regreso = con2.consultaNumCuenta(f);
                System.out.println("entra");

            } else {
                con2.conexionAcces();
                regreso = con2.consultaNumCuenta(f);
                System.out.println("entra");

            }

            StringTokenizer mistokens = new StringTokenizer(regreso, ";");
            cedula = mistokens.nextToken().trim();
            nombre = mistokens.nextToken().trim();
            numeroCuenta = mistokens.nextToken().trim();
            idtipocuenta = mistokens.nextToken().trim();
            saldo = mistokens.nextToken().trim();
            if (conect) {
                new MovimientosMySQL(f, conec).setVisible(true);
            }
            conect = true;
        } catch (Exception ex) {
            conect = false;
            JOptionPane.showMessageDialog(null, "No se encuentra el cliente\n" + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (conec) {
            Ventana ven = new Ventana();
            ven.setVisible(true);
        } else {
            ventana2 ven2 = new ventana2();
            ven2.setVisible(true);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cargar("");
        contador();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ordenarMayor();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void numSalMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSalMayorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numSalMayorActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ordenarMenor();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Access
        conec = false;
        System.out.println("Coneccion=" + conec);
        System.out.println("La conexion Access establecida ");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //MYsQL
        conec = true;
        System.out.println("Coneccion=" + conec);
        System.out.println("La conexion MySQl establecida ");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (conec) {
            con2.conexionSql();

            JOptionPane.showMessageDialog(null, con2.totclienTipoCuen());
        } else {
            con2.conexionAcces();
            JOptionPane.showMessageDialog(null, con2.totclienTipoCuen());
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String f, regreso;
        boolean conect = true;

        try {
            f = cajaText.getText();
//            System.out.println(f);
            if (conec) {

                con2.conexionSql();
                regreso = con2.consultaNumCuenta(f);
//                    System.out.println("entra");

            } else {
                con2.conexionAcces();
                regreso = con2.consultaNumCuenta(f);
//                    System.out.println("entra");

            }

            StringTokenizer mistokens = new StringTokenizer(regreso, ";");
            cedula = mistokens.nextToken().trim();
            nombre = mistokens.nextToken().trim();
            numeroCuenta = mistokens.nextToken().trim();
            idtipocuenta = mistokens.nextToken().trim();
            saldo = mistokens.nextToken().trim();
            if (conect) {
                new MovimientosMySQL(f, conec).setVisible(true);
            }
            conect = true;
        } catch (Exception ex) {
            conect = false;
            JOptionPane.showMessageDialog(null, "No se encuentra el cliente\n" + ex);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new Simulacion().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(VEntanaPrinci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEntanaPrinci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEntanaPrinci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEntanaPrinci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEntanaPrinci().setVisible(true);
            }
        });
    }

    public void contador() {
//        System.out.println("Coneccion="+conec);
        if (conec) {
            con2.conexionSql();
            Contador.setText(con2.Contador());

        } else {
            con2.conexionAcces();
            Contador.setText(con2.Contador());
        }
    }

    public void ordenarMayor() {
        int contador = 0;
//                System.out.println("Coneccion="+conec);
        tabla1 = new DefaultTableModel(null, titulos);
        if (conec) {
            try {
                // Carga el driver
                Class.forName("com.mysql.jdbc.Driver");
                // Define la cadena de conexión
                String sourceURL = "jdbc:mysql://localhost/banco";
                // Crea el objeto connection a través de DriverManager
                Connection con = DriverManager.getConnection(sourceURL, usuario, password);
//                                 System.out.println("La conexion MySQL establecida es: "+ con);

                Statement s = con.createStatement();
                String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula ORDER BY Saldo DESC ;";
                ResultSet re = s.executeQuery(sql);
                int llave1 = Integer.parseInt(numSalMayor.getText());
                while (contador != llave1) {
                    re.next();
                    registros[0] = re.getString("idCedula");
                    registros[1] = re.getString("nombreCliente");
                    registros[2] = re.getString("numeroCuenta");
                    registros[3] = re.getString("idTipoCuenta");
                    registros[4] = re.getString("saldo");
                    tabla1.addRow(registros);
                    contador++;
                }
                jTable1.setModel(tabla1);
                //System.out.println(resultado);
                con.close();
                s.close();
                re.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);
            }
        } else {
            try {

                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                //String db = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=C:/datos/Database1a.mdb;DriverID=22}";// add on to the end 
                String db = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=C:/datos/Database1a.mdb";
                Connection con = DriverManager.getConnection(db, "", "");
//                                    System.out.println("La conexion Access establecida es: "+ con);
                Statement s = con.createStatement();
                String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula ORDER BY Saldo DESC ;";
                ResultSet re = s.executeQuery(sql);
                int llave1 = Integer.parseInt(numSalMayor.getText());
                while (contador != llave1) {
                    re.next();
                    registros[0] = re.getString("idCedula");
                    registros[1] = re.getString("nombreCliente");
                    registros[2] = re.getString("numeroCuenta");
                    registros[3] = re.getString("idTipoCuenta");
                    registros[4] = re.getString("saldo");
                    tabla1.addRow(registros);
                    contador++;
                }
                jTable1.setModel(tabla1);

                //System.out.println(resultado);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);
            }

        }

    }

    public void ordenarMenor() {
        int contador = 0;
//                System.out.println("Coneccion="+conec);
        tabla1 = new DefaultTableModel(null, titulos);
        if (conec) {
            try {
                // Carga el driver
                Class.forName("com.mysql.jdbc.Driver");

                // Define la cadena de conexión
                String sourceURL = "jdbc:mysql://localhost/banco";

                // Crea el objeto connection a través de DriverManager
                Connection con = DriverManager.getConnection(sourceURL, usuario, password);
//                                    System.out.println("La conexion MySQL establecida es: "+ con);

                Statement s = con.createStatement();
                String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula ORDER BY Saldo ;";

                ResultSet re = s.executeQuery(sql);
                int llave1 = Integer.parseInt(numsalMenor.getText());
                while (contador != llave1) {
                    re.next();
                    registros[0] = re.getString("idCedula");
                    registros[1] = re.getString("nombreCliente");
                    registros[2] = re.getString("numeroCuenta");
                    registros[3] = re.getString("idTipoCuenta");
                    registros[4] = re.getString("saldo");
                    tabla1.addRow(registros);
                    contador++;
                }
                jTable1.setModel(tabla1);
                con.close();
                s.close();
                re.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);
            }

        } else {
            try {
                // Carga el driver
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                String db = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=C:/datos/Database1a.mdb";
                Connection con = DriverManager.getConnection(db, "", "");
//                                        System.out.println("La conexion Access establecida es: "+ con);
                Statement s = con.createStatement();
                String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula ORDER BY Saldo ;";

                ResultSet re = s.executeQuery(sql);
                int llave1 = Integer.parseInt(numsalMenor.getText());
                while (contador != llave1) {
                    re.next();
                    registros[0] = re.getString("idCedula");
                    registros[1] = re.getString("nombreCliente");
                    registros[2] = re.getString("numeroCuenta");
                    registros[3] = re.getString("idTipoCuenta");
                    registros[4] = re.getString("saldo");
                    tabla1.addRow(registros);
                    contador++;
                }
                jTable1.setModel(tabla1);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);
            }

        }
    }

    public void cargar(String valor) {

        //TABLA CREADA
//        System.out.println("Coneccion Cargar="+conec);
        tabla1 = new DefaultTableModel(null, titulos);
        if (conec) {
//        System.out.println("Entro MYsQL");
            try {

                // Carga el driver
                Class.forName("com.mysql.jdbc.Driver");
                // Define la cadena de conexión
                String sourceURL = "jdbc:mysql://localhost/banco";

                // Crea el objeto connection a través de DriverManager
                Connection con = DriverManager.getConnection(sourceURL, usuario, password);
//                     System.out.println("La conexion MySQL establecida es: "+ con);

                Statement s = con.createStatement();
                String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula ;";
                //concatenado
                //where CONCAT(nombre) Like'%"+valor+"'
                ResultSet re = s.executeQuery(sql);
                while (re.next()) {
                    registros[0] = re.getString("idCedula");
                    registros[1] = re.getString("nombreCliente");
                    registros[2] = re.getString("numeroCuenta");
                    registros[3] = re.getString("idTipoCuenta");
                    registros[4] = re.getString("saldo");
                    tabla1.addRow(registros);
                }
                jTable1.setModel(tabla1);

                con.close();
                s.close();
                re.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);
            }
        } else {
//        System.out.println("Entro Access");
            try {
                // Carga el driver

                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                String db = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=C:/datos/Database1a.mdb";
                Connection con = DriverManager.getConnection(db, "", "");
//                       System.out.println("La conexion Access establecida es: "+ con);
                // Crea el objeto connection a través de DriverManager

                Statement s = con.createStatement();
                String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula ;";
                //concatenado
                //where CONCAT(nombre) Like'%"+valor+"'
                ResultSet re = s.executeQuery(sql);
                while (re.next()) {
                    registros[0] = re.getString("idCedula");
                    registros[1] = re.getString("nombreCliente");
                    registros[2] = re.getString("numeroCuenta");
                    registros[3] = re.getString("idTipoCuenta");
                    registros[4] = re.getString("saldo");
                    tabla1.addRow(registros);
                }
                jTable1.setModel(tabla1);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error Actualizar" + ex);
            }

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contador;
    private javax.swing.JTextField cajaText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numSalMayor;
    private javax.swing.JTextField numsalMenor;
    // End of variables declaration//GEN-END:variables
}