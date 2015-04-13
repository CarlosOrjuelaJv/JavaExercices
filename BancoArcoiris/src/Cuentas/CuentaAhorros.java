package Cuentas;

public class CuentaAhorros extends Cuentas{
	
	private final double interes;
	private  long numCuenta;
	private int tipoCuenta;
	private double saldoCuenta=0;
        private long IdCLiente;
        private double montoInteres;
        private double calculo;
         private String NombreCuenta;

		
public CuentaAhorros(){
    interes=0.01d;
        };
	
	

    
    public long getNumCuenta() {
        return numCuenta;
    }

   
    public String getTipoCuenta() {
      NombreCuenta= "Ahorros";
       return NombreCuenta;
    }


    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    
    public double calcularInteres() {
        
       return interes;
    }

   
   public double calcularSaldo() {
        calculo=this.calcularInteres()+saldoCuenta;
       return calculo;
    }
			
}
