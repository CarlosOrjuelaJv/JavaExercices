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
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class ventan_prin extends JFrame implements ActionListener {
    private JLabel lblCedula=new JLabel("Cedula");
    private TextField txtCedula=new TextField(20);
    static boolean candado;
    JButton consulta=new JButton("Consultar");
    JButton ingresar=new JButton("ingresar cliente");
    JButton todos=new JButton("Ver todos");
    
    private JLabel lblnumCuen=new JLabel("numero de cuenta");
    private TextField txtnumCuen=new TextField(20);
    DBA con2=new DBA();
    Cuentas cuen=null;
    
    
        String cedula;
        String nombre ;
        String numeroCuenta ;
        String idtipocuenta ;
        String saldo;
    
    public ventan_prin(){
            setTitle("Banco Arcoiris-consulta clientes");
            setLayout(null);
            setBounds(300, 20, 400, 600);
            
            

            lblnumCuen.setBounds(30, 65, 130, 50);
            add(lblnumCuen);

            txtnumCuen.setBounds(160, 75, 200, 25);
            add(txtnumCuen);

            consulta.setBounds(30, 280, 100, 30);
            add(consulta);
            consulta.addActionListener(this);

            ingresar.setBounds(30, 320, 200, 30);
            add(ingresar);
            ingresar.addActionListener(this);

            todos.setBounds(30, 360, 200, 30);
            add(todos);
            todos.addActionListener(this);
           
            
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== consulta)
        {
            String f,regreso;
            f=txtnumCuen.getText();
            System.out.println(f);
            con2.conexionSql();
            regreso=con2.consultaNumCuenta(f);
         try{
               double saldo_total=0;
               double interes=0;
                double interesCDT=0.012,intersAhorro=0.01,interesCorriente=0.008;
                double cuenta=0;
                StringTokenizer mistokens = new StringTokenizer(regreso, ";"); 
                 cedula = mistokens.nextToken().trim();
                 nombre = mistokens.nextToken().trim();
                 numeroCuenta = mistokens.nextToken().trim();
                 idtipocuenta = mistokens.nextToken().trim();
                 saldo = mistokens.nextToken().trim();  
                 
                 cuenta=Double.parseDouble(saldo);
                 if(idtipocuenta.equals("1")){
                     interes=cuenta*intersAhorro;
                     saldo_total=interes+cuenta;
                 JOptionPane.showMessageDialog(null,"Cedula="+cedula+"\nnombre="+nombre+"\nNumero Cuenta="+numeroCuenta+"\nTipo Cuenta=" +idtipocuenta+"\nSaldo="+saldo+"\nintereses="+interes+"\nsaldoTotal="+saldo_total );
                 }
                 if(idtipocuenta.equals("2")){
                     interes=cuenta*interesCorriente;
                     saldo_total=interes+cuenta;
                 JOptionPane.showMessageDialog(null,"Cedula="+cedula+"\nnombre="+nombre+"\nNumero Cuenta="+numeroCuenta+"\nTipo Cuenta=" +idtipocuenta+"\nSaldo="+saldo+"\nintereses="+interes+"\nsaldoTotal="+saldo_total );
                 }
                 if(idtipocuenta.equals("3")){
                     interes=cuenta*interesCDT;
                     saldo_total=interes+cuenta;
                 JOptionPane.showMessageDialog(null,"Cedula="+cedula+"\nnombre="+nombre+"\nNumero Cuenta="+numeroCuenta+"\nTipo Cuenta=" +idtipocuenta+"\nSaldo="+saldo+"\nintereses="+interes+"\nsaldoTotal="+saldo_total );
                 }
            }catch (Exception ex){
            
        }
            
        }
        if(ae.getSource()== ingresar)
        {
           Ventana ven =new Ventana();
           ven.setVisible(true);
        }
        
        if(ae.getSource()== todos)
        {
            datos data=new datos();
           con2.conexionSql();
            JOptionPane.showMessageDialog(null,con2.ConsultaTodo());
            data.setVisible(true);        
        
        }
    }
}
