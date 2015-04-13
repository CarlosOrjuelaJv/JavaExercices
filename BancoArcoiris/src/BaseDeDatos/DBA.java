package BaseDeDatos;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBA {
    //variables

    String nombre = "";
    String tecedula = "";
    String tetipocuenta = "";
    String tesaldo = "";
    String tenumcuenta = "";

    String usuario = "root";
    String password = "";
    Connection con = null;
    String datosmanda = "";
    String totalclien = "", clienteSalMayor = "", clienteSaldoMenor = "";
    String resultado = "";
    double saldotot = 0, saldmayor = 0, saldmenor = 100000000;

    public DBA() {
    }
    //conecciopn SQL

    public void conexionSql() {
        try {

            // Carga el driver
            Class.forName("com.mysql.jdbc.Driver");

            // Define la cadena de conexión
            String sourceURL = "jdbc:mysql://localhost/banco";

            // Crea el objeto connection a través de DriverManager
            con = DriverManager.getConnection(sourceURL, usuario, password);

            System.out.println("La conexion MySQL establecida es: " + con);

        } catch (Exception cnfe) {
            System.out.println(cnfe);
        }
    }
    //conexion acces

    public void conexionAcces() {

        try {

            // Carga el driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // Define la cadena de conexión

            String db = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=C:/datos/Database1a.mdb";
            // Crea el objeto connection a través de DriverManager

            con = DriverManager.getConnection(db, "", "");

            System.out.println("La conexion Access establecida es: " + con);

        } catch (ClassNotFoundException cnfe) {
            System.err.println("Error" + cnfe);

        } catch (SQLException sqle) {
            System.err.println("Error" + sqle);

        }

    }
    //consultar todos los datos

    public String ConsultaTodo() {
        String dato1 = "";

        try {
            /// Creacion de Stament
            Statement s = con.createStatement();
            //llamado codigo SQL
            String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula;";
            //creacion de registro
            ResultSet re = s.executeQuery(sql);

            while (re.next()) {
                dato1 = dato1 + "Cedula numero=" + re.getString("idCedula") + ", nombre=" + re.getString("nombreCliente") + ", numero cuenta=" + re.getString("numeroCuenta")
                        + ", TIpo cuenta:" + re.getString("idTipoCuenta") + ", Saldo=" + re.getString("saldo") + "\n";
            }
            System.out.println(dato1);

        } catch (SQLException ex) {
            Logger.getLogger(DBA.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        }

        return dato1;
    }
    //prueba contador actualizxar tabla

    public String Contodo() {
        String dato1 = "";

        try {
            Statement s = con.createStatement();
            //llamado datos SQL
            String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula ;";
            //concatenado
            //where CONCAT(nombre) Like'%"+valor+"'
            //creacion de registro
            ResultSet re = s.executeQuery(sql);
            while (re.next()) {

                dato1 = re.getString("idCedula") + ";" + re.getString("nombreCliente") + ";" + re.getString("numeroCuenta")
                        + ";" + re.getString("idTipoCuenta") + ";" + re.getString("saldo");
                System.out.println(dato1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBA.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Cerrado de la conexion
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        }

        return dato1;
    }
    //consulta con numero de cuenta

    public String consultaNumCuenta(String numeCuen) {

        try {
            //creacion Stament
            Statement s = con.createStatement();
            //llamado cosigo sql
            String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula where numeroCuenta=" + numeCuen + ";";
            //greacionm de registro
            ResultSet re = s.executeQuery(sql);
            //mirar si el registro tiene datos
            re.next();
            datosmanda = re.getString("idCedula") + ";" + re.getString("nombreCliente") + ";" + re.getString("numeroCuenta")
                    + ";" + re.getString("idTipoCuenta") + ";" + re.getString("saldo");
            System.out.println(datosmanda + " halla DBA");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        }
        //cerrado conecxion
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        }

        return datosmanda;
    }
    //ingresar datos al cliente

    public void setCliente(String id, String nom2) {

        try {
            //creacion de estamento
            Statement s = con.createStatement();
            //lamado codigo sql insetar
            String sql = "INSERT INTO cliente(idCedula,nombreCliente) values('" + id + "','" + nom2 + "')";
            //cargar(update) el registro de la base de datos
            s.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Guardado con Exito nombre");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        //cerrado de conexion
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        }

    }

    //ingresar datos a l a cuenta
    public void setCuenta(String num, String sal, String cedu, String tip) {

        try {
            //creacion de  declaracion coneccion
            Statement s = con.createStatement();
            //lamado codigo sql insetar datos en cuenta
            String sql = "INSERT into Cuenta(numeroCuenta,saldo,idCedula,idTipoCuenta) values('" + num + "','" + sal + "','" + cedu + "','" + tip + "')";
            //ejecutar la actualizacion
            s.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Guardado con Exito tipo cuenta");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        //cerrar la conexion
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        }
    }
    //Consulta saldo mayor y menor

    public String saldosmayorymenor() {

        try {
            //creacion de  declaracion coneccion
            Statement s = con.createStatement();
            //lamado codigo sql seleccion
            String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula;";
            //creado de registro de consulata
            ResultSet re = s.executeQuery(sql);
            //mientras existan datos
            while (re.next()) {
                saldotot = Integer.parseInt(re.getString("saldo"));

                //buscar saldo mayor y menor
                if (saldotot > saldmayor) {
                    System.out.println(saldotot);
                    clienteSalMayor = re.getString("idCedula") + "," + re.getString("nombreCliente") + "," + re.getString("numeroCuenta");
                    saldmayor = saldotot;
                }
                if (saldotot < saldmenor) {
                    clienteSaldoMenor = re.getString("idCedula") + "," + re.getString("nombreCliente") + "," + re.getString("numeroCuenta");
                    saldmenor = saldotot;
                }
            }
            resultado = clienteSalMayor + ", Saldo MAyor=" + saldmayor + "\n" + clienteSaldoMenor + ", Saldo Menor=" + saldmenor;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        //cerrado conexion
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        }
        return resultado;
    }
    //total clientes por cuenta

    public String totclienTipoCuen() {

        try {
            //variables de total numero clientes
            String CantidadAhor, CantidadCorri, CantCDT;
            //declaracion coneecion
            Statement s = con.createStatement();
            //SQL seleccionar con condicion
            String sql = "SELECT count(numerocuenta) as cant FROM Cuenta where idTipoCuenta=1;";
            //creacion registro consulta
            ResultSet re = s.executeQuery(sql);
            //mientras hallan datos
            re.next();
//                                contAhorro++;
            //asociar el dato cogido a ala bariable "cant"
            CantidadAhor = re.getString("cant");

            s = con.createStatement();
            sql = "SELECT count(numerocuenta) as cant FROM Cuenta where idTipoCuenta=2;";
            re = s.executeQuery(sql);
            re.next();
            CantidadCorri = re.getString("cant");

            s = con.createStatement();
            sql = "SELECT count(numerocuenta) as cant FROM Cuenta where idTipoCuenta=3;";
            re = s.executeQuery(sql);
            re.next();
            CantCDT = re.getString("cant");

            System.out.println("ahorro=" + CantidadAhor + ", Corriente=" + CantidadCorri + ", CDT=" + CantCDT);
            totalclien = "ahorro=" + CantidadAhor + "\nCorriente=" + CantidadCorri + "\nCDT=" + CantCDT;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        //cerrar conexion
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        }

        return totalclien;
    }
    //contador numero de clientes

    public String Contador() {
        String CantidadAhor = "";
        try {
            //declaracion de coneccion
            Statement s = con.createStatement();
            //sql seleccionar cuenta
            String sql = "SELECT count(numerocuenta) as cant FROM Cuenta;";
            //creacion de registro
            ResultSet re = s.executeQuery(sql);
            //mientras hallan datos
            re.next();
            CantidadAhor = re.getString("cant");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        //cerrado coenccion
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        }

        return CantidadAhor;
    }

    public void Realizarmovimiento(String tipo, String Valor, String numCuen) {

        double SaldoTota = 0, saldo = 0;
        if (tipo.equals("1")) {
            System.out.println("aca en dba entro 1:" + tipo + "," + Valor + "," + numCuen);
            try {
                //creacion Stament
                Statement s = con.createStatement();
                //llamado cosigo sql
                String sql = "SELECT * FROM Cliente INNER JOIN Cuenta ON Cliente.idCedula = Cuenta.idCedula where numeroCuenta=" + numCuen + ";";
                //greacionm de registro
                ResultSet re = s.executeQuery(sql);
                //mirar si el registro tiene datos
                re.next();
                saldo = Double.parseDouble(re.getString("saldo"));
                System.out.println("saldo=" + saldo);
                SaldoTota = saldo + Double.parseDouble(Valor);
                JOptionPane.showMessageDialog(null, "doposito de=" + Valor + "saldo nuevo=" + SaldoTota);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error1a" + ex);
            }
        } else if (tipo.equals("2")) {
            try {
                //creacion de estamento
                Statement s = con.createStatement();
                //lamado codigo sql insetar
                String sql = "SELECT * FROM Cuenta";
                //cargar(update) el registro de la base de datos
                ResultSet re = s.executeQuery(sql);
                //mientras existan datos
                re.next();

                saldo = Integer.parseInt(re.getString("saldo"));
                if (saldo < 0 || saldo < Double.parseDouble(Valor)) {
                    JOptionPane.showMessageDialog(null, "Saldo no suficiente");
                    SaldoTota = saldo;
                } else {
                    SaldoTota = saldo - Double.parseDouble(Valor);
                    JOptionPane.showMessageDialog(null, "Retiro de=" + Valor + "saldo nuevo=" + SaldoTota);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error1b=" + ex);
            }

        }

        try {
            //creacion de estamento
            Statement s = con.createStatement();
            //lamado codigo sql insetar
            String sql = "INSERT INTO movimiento(numeroCuenta,idTipoMovimiento,Valor) values('" + numCuen + "','" + tipo + "','" + Valor + "')";
            //cargar(update) el registro de la base de datos
            s.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Guardado con Exito movimiento");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error2" + ex);
        }
        try {
            Statement s = con.createStatement();
            //lamado codigo sql insetar
            String sql = "UPDATE cuenta set saldo = " + SaldoTota + " where numeroCuenta=" + numCuen + ";";
            //cargar(update) el registro de la base de datos
            s.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "GActualizado saldo exito");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error3" + ex);
        }
        //cerrado de conexion
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        }

    }

}
