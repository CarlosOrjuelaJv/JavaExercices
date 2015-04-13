/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mychat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.Socket;
import javax.swing.JScrollPane;

/**
 *
 * @author lp_02
 */
public class cliente {

    JFrame ventana_chat = null;
    JButton btn_enviar = null;
    JTextField txt_mensaje = null;
    JTextArea area_chat = null;
    JPanel contenedor_areachat = null;
    JPanel contenedor_btntext = null;
    JScrollPane scroll = null;

    Socket soket = null;
    BufferedReader lector = null;
    PrintWriter escritor = null;
    String computador = null;

    public cliente() {
        hacerInterfaz();
    }

    public void hacerInterfaz() {

        ventana_chat = new JFrame("Cliente");
        btn_enviar = new JButton("enviar");
        txt_mensaje = new JTextField(4);
        area_chat = new JTextArea(10, 12);
        scroll = new JScrollPane(area_chat);
        contenedor_areachat = new JPanel();
        contenedor_areachat.setLayout(new GridLayout(1, 1));
        contenedor_areachat.add(scroll);
        contenedor_btntext = new JPanel();
        contenedor_btntext.setLayout(new GridLayout(1, 2));
        contenedor_btntext.add(btn_enviar);
        contenedor_btntext.add(txt_mensaje);
        ventana_chat.setLayout((new BorderLayout()));
        ventana_chat.add(contenedor_areachat, BorderLayout.NORTH);
        ventana_chat.add(contenedor_btntext, BorderLayout.SOUTH);
        ventana_chat.setVisible(true);
        ventana_chat.setSize(300, 220);
        ventana_chat.setResizable(false);
        ventana_chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Thread principal = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    soket = new Socket("192.168.2.107", 9000);
                    System.out.println(soket.getLocalAddress());
                    computador = "" + soket.getLocalAddress();
                    leer();
                    escribir();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        principal.start();

    }

    public void leer() {
        Thread leer_hilo = new Thread(new Runnable() {
            public void run() {
                try {
                    lector = new BufferedReader(new InputStreamReader(soket.getInputStream()));
                    while (true) {
                        String mensaje_resivido = lector.readLine();
                        area_chat.append(computador + " dice: " + mensaje_resivido + "\n");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        leer_hilo.start();

    }

    public void escribir() {
        Thread escribir_hilo = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    escritor = new PrintWriter(soket.getOutputStream(), true);
                    btn_enviar.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String enviar_mensaje = txt_mensaje.getText();
                            escritor.println(enviar_mensaje);
                            txt_mensaje.setText("");
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        escribir_hilo.start();

    }

    ;

    public static void main(String[] args) {
        // TODO code application logic here
        new cliente();
    }

}
