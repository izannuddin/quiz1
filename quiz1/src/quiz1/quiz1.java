package quiz1;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//both female and female	
				
				Scanner in = new Scanner(System.in);
				//declare the variable  
				
				double feet,inches,weight;
				
				System.out.print("input the inches :   ");
				inches = in.nextDouble();
				System.out.print("input the feet : ");
				feet= in.nextDouble();
				
				
				//calculate for female and male
				System.out.println("Female weight is " +(40+(5*feet))+" kg");
				System.out.println("Male weight is " +(50+(5*feet))+"  kg");	
		
		
	}

}
