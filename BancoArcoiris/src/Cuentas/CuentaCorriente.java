package Cuentas;

public class CuentaCorriente extends Cuentas{
	private static int cuentasCorrientes=0;
	private final double interes;
	private double montoInteres=0;
	private  long numCuenta;
	private int tipoCuenta;
	private double saldoCuenta=0;
        private long IdCLiente;
        private double calculo;
        private String NombreCuenta;
        
        public  CuentaCorriente(){
            interes=0.008d;
        };
        public long getNumCuenta(){
        
        return numCuenta;
        } ;
	 public String getTipoCuenta(){
            
         NombreCuenta="Corriente";
        return  NombreCuenta;  
        };
	public double getSaldoCuenta(){
             return saldoCuenta;
         };
	
         public double calcularInteres(){
        		
             return interes;
         };
         public double calcularSaldo(){
             calculo=saldoCuenta+this.calcularInteres();
             return calculo ;
         };

   
	
	
}

