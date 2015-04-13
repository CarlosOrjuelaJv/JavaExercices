/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrac.factory;

/**
 *
 * @author programador
 */
public class AmericaFactory extends ContinnentFactory{

    @Override
    public Hervibore CreateHervibore() {
        return new Bisont();
    }

    @Override
    public Carnivore CreateCarnivore() {
        return new Wolf();
    }

   
}
