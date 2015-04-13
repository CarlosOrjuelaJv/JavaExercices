package Cuentas;

public class Cdt extends Cuentas{
    
        
        private  long numCuenta;
	private int tipoCuenta;
	private final double interes;
	private double saldoCuenta=0;
        private long IdCLiente;
        private double montoInteres;
        private double calculo;
        private String NombreCuenta;
        
         public Cdt(){
             interes=0.012d;
        };
        
        
        public long getNumCuenta(){
        
        return numCuenta;
        } ;
	public String getTipoCuenta(){
            
         NombreCuenta="Cdt";
        return NombreCuenta;  
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
