package a007;

import java.util.Scanner;

public class a007 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num, i=2;
		int x;
		
		while(keyboard.hasNextInt()){
			num = keyboard.nextInt();
			
			for(i=2 ; i<=Math.sqrt(num) ;++i){
				if((num % i) != 0){
					continue;
				}
				else{
					System.out.println("獶借计");
					break;
				}
			}
			
			if(i > Math.sqrt(num)){
				System.out.println("借计");
			}
		}
	}

}

/*
import java.util.Scanner;
import java.lang.Math.*;
public class a007 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            int N, a, sq;
            N = cin.nextInt();
            sq = (int)Math.sqrt(N);
            for(a = 2; a <= sq; a++)
                if(N%a == 0)    break;
            if(a != sq+1)
                System.out.println("獶借计");
            else
                System.out.println("借计");
        }
    }
}
*/