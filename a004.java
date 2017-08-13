package a004;

import java.util.Scanner;

public class a004 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int year;
		
		while(keyboard.hasNextInt()){
			year = keyboard.nextInt();
			if( (year % 4 == 0)&&( year % 100 != 0) || (year % 400 == 0)){
				System.out.println("¶|¦~");
			}
			else{
				System.out.println("¥­¦~");
			}
		}
	}

}
