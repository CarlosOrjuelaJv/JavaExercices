/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import BaseDeDatos.DBA;
import Cuentas.Cuentas;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Carlos
 */
public class ventana2 extends JFrame implements ActionListener{
	
	
	///botones
	private JLabel lblnombre=new JLabel("Nombre");
	private TextField txtnombre=new TextField(20);

	private JLabel lblcedula=new JLabel("Cedula");
	private TextField txtcedula=new TextField(20);
        
        private JLabel lbltipoCuenta=new JLabel("Tipo cuenta:   1.Ahorros  2.Corriente  3.CTD");
	private JLabel txttipoCuenta=new JLabel("1");
        
        private JLabel lbltnumeroCuenta=new JLabel("Numero de cuenta");
	private TextField txtnumeroCuenta=new TextField(20);
	
        private JLabel lblSaldo=new JLabel("Saldo");
	private TextField txtSaldo=new TextField(20);
        
        private JComboBox combo1=new JComboBox();
        
	JButton guardar=new JButton("Guardar");
	private JButton btnleer=new JButton("leer");
        
        private JLabel lblinfo=new JLabel("");
        
        //variables
            String TExt="";
            boolean manejo=true;
            boolean manejo2=true;
            Cuentas c=null;
            //creacion objeto
            long id=0;
            String nombre="";
            int tipoCuenta=0;
            long numeroCuenta=0;
            double saldo=0;
            //auxiliares
            
            int con=0;
            int contCDT=0;
            int contAhorro=0;
            int contCorriente=0;
            double totalinteres=0;
            double totalsaldo=0;
            double totalSaldoSininteres=0;
            double mayorSaldo=0;
            double menorSaldo=1000000;
            String clienteMayorSaldo="";
            String clienteMenorSaldo="";
            //variables captura de datos
            String tecedula = "";
            String tetipocuenta = "";
            String tesaldo ="";
            String tenumcuenta ="";
            String f="";
            DBA con1=new DBA();
           
         
	public ventana2()
	{	
            
              
                con1.conexionAcces();
                
    
                
                
		setTitle("Banco Arcoiris");
		setLayout(null);
		setBounds(300, 20, 400, 600);
		combo1.setBounds(160, 155, 100, 30);
                combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ahorros", "Corriente", "CDT" }));
                combo1.addActionListener(this);
                add(combo1);
                        
                lblnombre.setBounds(30, 25, 80, 50);
		add(lblnombre);
                
                txtnombre.setBounds(120, 35, 200, 25);
		add(txtnombre);
                
                lblcedula.setBounds(30, 65, 80, 50);
		add(lblcedula);
                
                txtcedula.setBounds(120, 75, 200, 25);
		add(txtcedula);
                
                lbltipoCuenta.setBounds(30, 105, 300, 50);
		add(lbltipoCuenta);
                
                txttipoCuenta.setBounds(120, 155, 30, 25);
		add(txttipoCuenta);
                
                lbltnumeroCuenta.setBounds(30, 185, 110, 50);
		add(lbltnumeroCuenta);
                
                txtnumeroCuenta.setBounds(150, 195, 200, 25);
		add(txtnumeroCuenta);
		
                lblSaldo.setBounds(30, 225, 80, 50);
		add(lblSaldo);
                
                txtSaldo.setBounds(150, 235, 200, 25);
		add(txtSaldo);
                
                lblinfo.setBounds(10, 320, 380, 100);
                add(lblinfo);
                
                guardar.setBounds(30, 280, 80, 30);
                add(guardar);
                guardar.addActionListener(this);
                
                btnleer.setBounds(130, 280, 80, 30);
                add(btnleer);
                btnleer.addActionListener(this);
                
              
	}

  
    //aciones de los botones
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== combo1){
         String l=String.valueOf(combo1.getSelectedItem());
        
        if(l.equals("Corriente")){
            tipoCuenta=2;
           
            txttipoCuenta.setText("2");
        }
        if(l.equals("CDT")){
            tipoCuenta=3;
            
             txttipoCuenta.setText("3");
        }
        if(l.equals("Ahorros")){
            tipoCuenta=1;
            
             txttipoCuenta.setText("1");
        }
        
        
        }
        if(e.getSource()== guardar){
                
            

            try{ 
                
                id=Long.parseLong(txtcedula.getText());
                con1.conexionAcces();
                con1.setCliente(txtcedula.getText(),txtnombre.getText());
                System.out.println(txtcedula.getText()+",");

            }catch(NumberFormatException ev)
            {

                JOptionPane.showMessageDialog(null, "Formato erroneo, cedula");
            }

            try{
            tipoCuenta=Integer.parseInt(txttipoCuenta.getText());
            numeroCuenta=Long.parseLong(txtnumeroCuenta.getText());
            saldo=Double.parseDouble(txtSaldo.getText());
            con1.conexionAcces();
            con1.setCuenta(txtnumeroCuenta.getText(),txtSaldo.getText(),txtcedula.getText(),txttipoCuenta.getText());
            System.out.println(txttipoCuenta.getText()+",");

            }catch(NumberFormatException ev)
            {

            JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            }         
        }
        
        
        if(e.getSource()== btnleer ){
            con1.conexionAcces();
            con1.ConsultaTodo();
            System.out.println("Entra");
        }
        
    }
	

}

