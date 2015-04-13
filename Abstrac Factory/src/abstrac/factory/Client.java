/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrac.factory;

/**
 *
 * @author programador
 */
public class Client {
    
    public static void main(String[] args) 
    {
        ContinnentFactory africa=new AfricaFactory();
         AnimalWorld world=new AnimalWorld(africa);
       world.food();
        
    }
    
}
