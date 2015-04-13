/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionjbx.jaxbhelper;

import aplicacionjbx.domain.Cuenta;
import aplicacionjbx.domain.Custumer;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lp_02
 */
@XmlRootElement(namespace = "aplicacionjbx.jaxbhelper")
public class CuentaJaxbHelper {
    private ArrayList<Cuenta> cuentaList;

    public ArrayList<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(ArrayList<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }
    
}
