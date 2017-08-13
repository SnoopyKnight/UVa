package a003;

import java.util.Scanner;

public class a003 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int m,d,s;
		
		while( keyboard.hasNextInt() ){
			m = keyboard.nextInt();
			d = keyboard.nextInt();
			s = (2*m + d) % 3 ;
			
			if( s == 0){
				System.out.println("´¶³q");
			}
			if( s == 1){
				System.out.println("¦N");
			}
			if( s == 2){
				System.out.println("¤j¦N");
			}
		}
	}

}
