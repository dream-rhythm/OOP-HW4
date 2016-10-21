package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int input;
		NissanTiida car =new NissanTiida();
		System.out.print("Please enter a number: ");
		input=cin.nextInt();
		for(int i=0;i<input;i++)car.tiida();
		cin.close();
	}

}
