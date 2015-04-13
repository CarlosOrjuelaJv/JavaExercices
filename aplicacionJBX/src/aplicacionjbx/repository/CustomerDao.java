/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionjbx.repository;

import aplicacionjbx.domain.Custumer;
import java.util.ArrayList;

/**
 *
 * @author lp_02
 */
public interface CustomerDao {
    public void createXml(ArrayList<Custumer> customerList);
    public ArrayList<Custumer> getXml();
    
    //public void createXml(ArrayList<Custumer> customerList);
    //public ArrayList<Custumer> getXml();
    
    
}
