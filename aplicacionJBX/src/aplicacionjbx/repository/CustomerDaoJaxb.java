/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionjbx.repository;

import aplicacionjbx.domain.Custumer;
import aplicacionjbx.jaxbhelper.CustomerJaxbhelper;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author lp_02
 */
public class CustomerDaoJaxb implements CustomerDao{

    private static final String CUSTOMER="./src/resources/jaxb/CUSTOMER.xml";
    private JAXBContext jaxbContext;
    private CustomerJaxbhelper cutomerJaxbHelper = new CustomerJaxbhelper();
    
    
    
    @Override  
    public void createXml(ArrayList<Custumer> customerList) {
      try{
          cutomerJaxbHelper.setCustomerList(customerList);
          jaxbContext = JAXBContext.newInstance(CustomerJaxbhelper.class);
          Marshaller m= jaxbContext.createMarshaller();
          m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE );
          m.marshal(cutomerJaxbHelper, System.out);
          
          m.marshal(cutomerJaxbHelper, new File(CUSTOMER));
      }catch(Exception e){
      
      }
      
    }

    @Override
    public ArrayList<Custumer> getXml() {
        ArrayList<Custumer> customerList = new ArrayList<Custumer>();
        try{
            jaxbContext= jaxbContext.newInstance(CustomerJaxbhelper.class);
            
            Unmarshaller um = jaxbContext.createUnmarshaller();
            cutomerJaxbHelper = (CustomerJaxbhelper) um.unmarshal(new FileReader(CUSTOMER));
            customerList = cutomerJaxbHelper.getCustomerList();
        } catch(Exception e){
      
      }
        return customerList;
        
    }
    
}
