import java.math.*;

/* double base, exponent; //inputs
 * 
 */
public class Power {	
	 static double powerF(double a, int b){
		double product = 1;
		for (int i=1; i<= b; i++){
			product = product  * a;			
		}
		return product;
	}
	 
	public static void main(String[] args){

                //Compare powerF() to Math.pow()		
		System.out.println("powerF(): "+powerF(2.5, 3));
		System.out.println("Math.pow(): "+Math.pow(2.5, 3));		
	}	
}

