package a007;
import java.util.Scanner;
import java.io.*;

public class a00701 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
	    int num,i;
	    while (cin.hasNext()){
	    boolean x = false;
	    num = cin.nextInt();
	    while(num<=2147483647){
		    for(i=2;i<=Math.sqrt(num);i++){
		      if((num % i ==0) && num != i){
		        x = true;
		      }
		    }
		    
		    if(x == true){
		      System.out.println("非質數");
		    }
		    else{
		      System.out.println("質數");
		    }
		    break;
	    }      
	  }

	}

}
