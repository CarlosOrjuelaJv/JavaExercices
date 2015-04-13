/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionjbx;

import aplicaccionJBX.controller.Controller;
import aplicacionjbx.controller.custumer.CustomerCreateController;

/**
 *
 * @author lp_02
 */
public class AplicacionJBX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller customerCreateController = new CustomerCreateController();
        customerCreateController.processRequest();
    }
    
}
