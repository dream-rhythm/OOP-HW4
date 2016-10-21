package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String input;
		PasswordEncorder pe= new PasswordEncorder();
		while(true){
			System.out.print("Please enter a string (enter\"exit\" to exit): ");
			input=cin.next();
			if(input.equals("exit"))break;
			else{
				System.out.println(pe.encode(input));
			}
		}
		cin.close();
	}

}
