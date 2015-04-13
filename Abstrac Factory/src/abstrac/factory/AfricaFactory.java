/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrac.factory;

/**
 *
 * @author programador
 */
public class AfricaFactory extends ContinnentFactory{

   
    @Override
    public Hervibore CreateHervibore() {
        return new Antelope();
    }

    @Override
    public Carnivore CreateCarnivore() {
        return new lion();
    }
    
}
