/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;
import Cuentas.*;
/**
 *
 * @author Carlos
 */
public class AñosHilo extends Thread  {
    private double saldo;
    private int Años;
    Cuentas cdt=new Cdt();
    Cuentas ahorro=new Cdt();
    Cuentas corriente=new Cdt();
    double intAhor,intCorr,intcdt;
    public AñosHilo(double monto,int d){
    
    saldo=monto;
    Años=d;
    
    
    
    }
    public void run() {
        // Retasamos la ejecución el tiempo especificado
        for(int i=0;i<=Años;i++)
       {
           intAhor=saldo*0.01d;
           saldo=saldo+intAhor;
           System.out.println("Año"+i+", interes="+intAhor+", saldo total"+saldo);
        try {
            sleep( 1000);
        } catch( InterruptedException e ) {
            ;    
        }
        
        }
    
    }
    
}
