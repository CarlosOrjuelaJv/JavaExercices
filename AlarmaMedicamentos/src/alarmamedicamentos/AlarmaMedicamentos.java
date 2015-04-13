/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmamedicamentos;

import alarmamedicamentos.modelo.BibliotecaMedicamentos;
import alarmamedicamentos.modelo.Dosis;
import alarmamedicamentos.modelo.Marca;
import alarmamedicamentos.modelo.Medicamento;
import alarmamedicamentos.modelo.TipoMedicamento;
import alarmamedicamentos.modelo.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class AlarmaMedicamentos {

    //agragados a la calse para crear referencia en memoria
    int cantiDosi;
    int interHoraDosis;
    int tiempoDosis;
    int cantDosis;
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlarmaMedicamentos aplicacion = new AlarmaMedicamentos();
        int idUserTem = 0;
        int idmediTem = 0;
        int idDosis = 0;
        boolean validardato = false;
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("elija la Opcion");
            System.out.println("1.registrar usuario");
            System.out.println("2.ingresar");
            System.out.println("3.salir");
            opcion = entrada.nextLine();
            switch (opcion) {
                case "1":
                    idUserTem++;
                    System.out.println("su id es " + idUserTem);
                    Scanner entrada2 = new Scanner(System.in);
                    String nombre;
                    String apellido;
                    String tel;
                    String eps;
                    System.out.println("EScriba su nombre");
                    nombre = entrada2.nextLine();
                    System.out.println("EScriba su Apellido");
                    apellido = entrada2.nextLine();
                    System.out.println("EScriba su telefono");
                    tel = entrada2.nextLine();
                    System.out.println("EScriba su eps");
                    eps = entrada2.nextLine();
                    Usuario userTemp = new Usuario(idUserTem + "", nombre, apellido, tel, eps);
                    aplicacion.agregarUsuario(userTemp);
                    break;
                case "2":
                    Scanner entrada3 = new Scanner(System.in);
                    System.out.println("Escriba su id para entrar");
                    String idEntrar;
                    idEntrar = entrada3.nextLine();
                    Usuario user = aplicacion.ingresarUsuario(idEntrar);
                    if (user != null) {
                        Scanner entradaBiblio = new Scanner(System.in);
                        String opbiblio;
                        do {
                            System.out.println("Bienvenido " + user.getNombre());
                            System.out.println("Opciones");
                            System.out.println("1.ver Biblioteca");
                            System.out.println("2.modificar datos");
                            System.out.println("3.ver datos");
                            System.out.println("4.Salir");
                            opbiblio = entradaBiblio.nextLine();
                            switch (opbiblio) {
                                case "1":
                                    BibliotecaMedicamentos biblitemp = aplicacion.verBibliotecaMedicamento(user);
                                    System.out.println("Bienvenido a su Biblioteca");
                                    do {

                                        System.out.println("1.Agregar medicamento");
                                        System.out.println("2.ver medicamentos guardados");
                                        System.out.println("3.activar alarma medicamento");
                                        System.out.println("4.desactivar alamrma medicamento");
                                        System.out.println("5.salir");
                                        opbiblio = entradaBiblio.nextLine();
                                        switch (opbiblio) {
                                            ////agregar medicamento
                                            case "1":
                                                idmediTem++;
                                                System.out.println("id medicamento " + idmediTem);
                                                Scanner entradaMedica = new Scanner(System.in);

                                                String nomMedi;
                                                String presMedica;

                                                String precauciones;

                                                
                                                String imagen = "/imagense/asdasd/oo.png";

                                                System.out.println("Escriba el nombre medicamento");
                                                nomMedi = entradaMedica.nextLine();
                                                System.out.println("Escriba la prescripcion");
                                                presMedica = entradaMedica.nextLine();
                                                //..........................................
                                                System.out.println("Escriba la dosis");

                                                idDosis++;

                                                String[] diasDosis = new String[7];
                                                Scanner entradaDos = new Scanner(System.in);
                                                System.out.println("id dosis " + idDosis);
                                                ////-------validacion
                                                validardato = false;
                                                do {
                                                    try {
                                                        System.out.println("escriba cantidad prescrita");
                                                        entradaDos = new Scanner(System.in);
                                                        aplicacion.cantiDosi = entradaDos.nextInt();
                                                        validardato = true;
                                                    } catch (java.util.InputMismatchException e) {
                                                        System.out.println("Escriba un numero");
                                                        validardato = false;
                                                    }
                                                } while (!validardato);
                                                ////-------validacion
                                                validardato = false;
                                                do {
                                                    try {
                                                        System.out.println("escriba intervalo horas a tomar medicamento");
                                                        entradaDos = new Scanner(System.in);
                                                        aplicacion.interHoraDosis = entradaDos.nextInt();
                                                        validardato = true;
                                                    } catch (java.util.InputMismatchException e) {
                                                        System.out.println("Escriba un numero");
                                                        validardato = false;
                                                    }
                                                } while (!validardato);
                                                ////-------validacion
                                                validardato = false;
                                                do {
                                                    try {
                                                        System.out.println("escriba el numero de dias que tomara la dosis");
                                                        entradaDos = new Scanner(System.in);
                                                        aplicacion.tiempoDosis = entradaDos.nextInt();
                                                        validardato = true;
                                                    } catch (java.util.InputMismatchException e) {
                                                        System.out.println("Escriba un numero");
                                                        validardato = false;
                                                    }
                                                } while (!validardato);
                                                ////-------validacion
                                                validardato = false;
                                                do {
                                                    try {
                                                        System.out.println("escriba la cantidad de medicamento por dosis");
                                                        entradaDos = new Scanner(System.in);
                                                        aplicacion.cantDosis = entradaDos.nextInt();
                                                        validardato = true;
                                                    } catch (java.util.InputMismatchException e) {
                                                        System.out.println("Escriba un numero");
                                                        validardato = false;
                                                    }
                                                } while (!validardato);
                                                
                                                System.out.println("selecciones los dias a tomar");
                                                for (int i = 0; i <Dosis.DIAS_SEMANA.length; i++) {
                                                    boolean datoValido=false;
                                                    do {
                                                        System.out.println("tomara el medicamento el "+Dosis.DIAS_SEMANA[i]+"?");
                                                        System.out.println("Escriba s o n :S/N");
                                                        entradaDos = new Scanner(System.in);
                                                        String datoSiToma="";
                                                        datoSiToma = entradaDos.nextLine();  
                                                        if (datoSiToma.equals("s")) {
                                                            diasDosis[i]=Dosis.DIAS_SEMANA[i];
                                                            datoValido=true;
                                                        }else if (datoSiToma.equals("n")){
                                                            datoValido=true;
                                                        }
                                                    } while (!datoValido);                              
                                                }
                                                
                                                Dosis dosisMedica = new Dosis(idDosis + "", aplicacion.cantiDosi, aplicacion.interHoraDosis, aplicacion.tiempoDosis, diasDosis, aplicacion.cantDosis);
                                                //..........................................
                                                //System.out.println("Escriba el tipo medicamento");
                                                TipoMedicamento tipome = new TipoMedicamento("1", "pastas", "pastas para tomar");
                                                //..........................................
                                                //System.out.println("Escriba la marca");
                                                Marca marca = new Marca("1", "genfa", "marca peruna");
                                                ///////////---------------
                                                boolean alarmaActiva=false;
                                                boolean datoValido=false;
                                                    do {
                                                        System.out.println("¿activar alarma?");
                                                        System.out.println("Escriba s o n :S/N");
                                                        entradaDos = new Scanner(System.in);
                                                        String datoSiToma="";
                                                        datoSiToma = entradaDos.nextLine();  
                                                        if (datoSiToma.equals("s")) {
                                                            alarmaActiva = true;
                                                            datoValido=true;
                                                        }else if (datoSiToma.equals("n")){
                                                            datoValido=true;
                                                            alarmaActiva=false;
                                                        }
                                                    } while (!datoValido);  
                                               
                                                
                                                ////////----------
                                                System.out.println("Escriba las precauciones");
                                                precauciones = entradaMedica.nextLine();
                                                
                                                Medicamento medicaTem = new Medicamento(idmediTem + "", nomMedi, presMedica, dosisMedica, precauciones, marca, alarmaActiva, imagen, tipome);
                                                System.out.println("se a guardado su Medicamento");    

                                                biblitemp.agragarMedicamento(medicaTem);
                                                break;
                                                ////mostrar medicamentos en los datos guardados
                                            case "2":
                                                biblitemp.mostrarMedicamentos();
                                                break;
                                                //activar alarma
                                            case "3":
                                                System.out.println("Digite el id del medicamento para activar alarma");
                                                entradaDos = new Scanner(System.in);
                                                String idtempMedicamento     =     entradaDos.nextLine();                                      
                                                biblitemp.activarAlarma(idtempMedicamento);
                                                break;
                                                //desactivar alarma
                                            case "4":
                                                System.out.println("Digite el id del medicamento para descativar alarma");
                                                entradaDos = new Scanner(System.in);
                                                idtempMedicamento     =     entradaDos.nextLine();                                      
                                                biblitemp.desactivaAlarma(idtempMedicamento);
                                                break;

                                        }
                                    } while (!opbiblio.equals("5"));
                                    break;
                                case "2":
                                    System.out.println("Modificar datos");
                                    entrada2 = new Scanner(System.in);

                                    System.out.println("EScriba su nombre");
                                    nombre = entrada2.nextLine();
                                    System.out.println("EScriba su Apellido");
                                    apellido = entrada2.nextLine();
                                    System.out.println("EScriba su telefono");
                                    tel = entrada2.nextLine();
                                    System.out.println("EScriba su eps");
                                    eps = entrada2.nextLine();

                                    user.setNombre(nombre);
                                    user.setApellido(nombre);
                                    user.setTelefono(nombre);
                                    user.setEps(nombre);
                                    break;
                                case "3":
                                    System.out.println("Sus Datos");
                                    user.mostrarInfo();
                                    break;


                            };
                        } while (!opbiblio.equals("4"));

                    } else {
                        System.out.println("usuario no identificado");
                    }
                    break;

            }

        } while (!opcion.equals("3"));

    }

    private void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    private Usuario ingresarUsuario(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    ;
    private BibliotecaMedicamentos verBibliotecaMedicamento(Usuario usuario) {
        return usuario.getBibliotecaMe();
    }
;
}
