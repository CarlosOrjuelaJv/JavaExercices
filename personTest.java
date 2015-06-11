// examplo of inicializations
package pruebacertificacion;

public class personTest {
    static {
    
        System.out.println("1");
    }
    {
    
        System.out.println("12");
    }

    public personTest() {
        System.out.println("constru");
    }
    
    
    public static void main(String[] args) {
       // lol.Temperatura.hola();
       
        personTest.doStuff();
         personTest dos = new personTest();
    }

    static void doStuff() {
        System.out.println("uno"); // line x4
        
    }

    public void uno() {
        System.out.println("dos");
        doStuff();
    }
}
