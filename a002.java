package a002;
import java.util.Scanner;

public class a002 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int input1 ;
		int input2 ;
		
		while (keyboard.hasNextInt()){
			input1 = keyboard.nextInt();
			input2 = keyboard.nextInt();
			
			System.out.println(input1 + input2);
		}

	}

}
