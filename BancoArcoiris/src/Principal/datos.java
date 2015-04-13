/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Cuentas.*;
import Clientes.*;
import BaseDeDatos.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class datos extends JFrame implements ActionListener { 
    
      private JLabel lbltipoC=new JLabel("numero de tipo cuenta");
	private JLabel lbltipoC2=new JLabel("");

	
        
    
         DBA con3=new DBA();
        String cedula;
        String nombre ;
        String numeroCuenta ;
        String idtipocuenta ;
        String saldo;
	
        
    public datos(){
    
            setTitle("Banco Arcoiris-datos");
            setLayout(null);
            setBounds(300, 20, 400, 200);
                
            lbltipoC.setBounds(30, 25, 150, 50);
            add(lbltipoC);

            lbltipoC2.setBounds(120, 65, 200, 25);
            add(lbltipoC2);

            con3.conexionSql();
            lbltipoC2.setText(con3.totclienTipoCuen());
            con3.conexionSql();
            con3.saldosmayorymenor();
            JOptionPane.showMessageDialog(null,con3.saldosmayorymenor());
               
                
               
    
    
    
    }
   
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    
}
