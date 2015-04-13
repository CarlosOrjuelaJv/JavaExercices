/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionjbx.controller.custumer;

import aplicaccionJBX.controller.Controller;
import aplicacionjbx.domain.Custumer;
import aplicacionjbx.repository.CustomerDao;
import aplicacionjbx.repository.CustomerDaoJaxb;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lp_02
 */
public class CustomerCreateController implements Controller{

    @Override
    public void processRequest() {
        Custumer customer1 = new Custumer();
        
        customer1.setName("pablo");
        customer1.setId(1000);
        customer1.setAge(42);
        
        Custumer customer2 = new Custumer();
        
        customer2.setName("Andres");
        customer2.setId(1001);
        customer2.setAge(32);
        
        Custumer customer3 = new Custumer();
        
        customer3.setName("Luisa");
        customer3.setId(1002);
        customer3.setAge(33);
        
        ArrayList<Custumer>  customerList= new ArrayList<Custumer>();
        
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        
        CustomerDao customerDao = new CustomerDaoJaxb();
        customerDao.createXml(customerList);
        
        ArrayList<Custumer> customerList2= new ArrayList<Custumer>();
        
        customerList2= customerDao.getXml();
        
        for (Iterator <Custumer> it= customerList2.iterator(); it.hasNext();) {
            Custumer customer= it.next();
            System.out.println(customer.toString());
        }
        
    }
    
}
