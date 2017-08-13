package a006;

import java.util.Scanner;
import java.lang.Math.*;

public class a006 {

	public static void main(String[] args) {
		double a,b,c,d;
		Scanner keyboard = new Scanner(System.in);
		
		while(keyboard.hasNextDouble()){
			a = keyboard.nextDouble();
			b = keyboard.nextDouble();
			c = keyboard.nextDouble();
			
			d = b*b - 4*a*c;
			
			if(d > 0){
				 System.out.println("Two different roots x1=" + (int)((-b+Math.sqrt(d)) / (2*a)) + " , x2=" + (int)((-b-Math.sqrt(d)) / (2*a)) );
			}
			else if(d == 0 ){
				System.out.println("Two same roots x=" + (int)((-b)/2*a) );
			}
			else{
				System.out.println("No real root");
			}
		}
		
	}

}
