package a005;

import java.util.Scanner;

public class a005 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		int a1,a2,a3,a4,a5;
		int t;
		t= keyboard.nextInt();
		
		while(t-- != 0){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			
			if((a1+a3 == 2*a2) && (a2+a4 == 2*a3)){
				a5 = a4 + (a4-a3);
				}
			else{
				a5 = a4 * (a4/a3);
			}
			System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5);
		}
	}
}
