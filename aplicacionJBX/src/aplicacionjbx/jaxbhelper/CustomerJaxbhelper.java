/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionjbx.jaxbhelper;

import aplicacionjbx.domain.Custumer;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lp_02
 */
//sepa donde encontrar a esa 
@XmlRootElement(namespace = "aplicacionjbx.jaxbhelper")
public class CustomerJaxbhelper {
    private ArrayList<Custumer> customerList;

    public CustomerJaxbhelper() {
    }

    public ArrayList<Custumer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Custumer> customerList) {
        this.customerList = customerList;
    }
    
}
