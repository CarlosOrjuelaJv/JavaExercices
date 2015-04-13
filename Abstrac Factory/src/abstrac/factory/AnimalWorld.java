/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrac.factory;



/**
 *
 * @author programador
 */
 public class AnimalWorld {
    private Hervibore AnimalHervibore;
    private Carnivore AnimalCarnivore;



   AnimalWorld(ContinnentFactory fabri) {
       AnimalHervibore =fabri.CreateHervibore();
        AnimalCarnivore=fabri.CreateCarnivore();
    }

   
    public void food()
    {
        AnimalCarnivore.eat(AnimalHervibore.getClass().getSimpleName());
    }
}
