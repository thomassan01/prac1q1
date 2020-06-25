import java.lang.Math;

public class practical2q1 {
	
    public static void main(String []args){
    	System.out.println("Number   SquareRoot");
		
		for(int x = 0; x <= 20; x += 2){
			System.out.printf("%d \t\t %.4f\n", x, Math.sqrt(x)); 	
		}
 
    } 
}