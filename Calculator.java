package com.Calculator;
import java.io.IOException;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) throws IOException {
		Scanner sc  =new Scanner(System.in);
		// TODO Auto-generated method stub
		while(true) {
			
		System.out.println("press 1 for addition\n"
				+ "press 2 for substraction\n"
				+ "press 3 fro multiplication\n"
				+ "press 4 for division\n"
				+ "press 5 for exit");
		int n = sc.nextInt();
		if (n==5) {
			System.exit(0);
		}
		System.out.println("Enter first no.");
		double a = sc.nextDouble();
		System.out.println("Enter Second no.");
		double b = sc.nextDouble();	
		switch(n) {
		case 1:
			double sum  = a+b;
			System.out.println("Sum is"+sum);
		break;
		case 2:
			
			double sub = a-b;
			System.out.println("Substraction  is"+sub);
		break;
		case 3:
			double mul = a*b;
			System.out.println("Mul is"+mul);
			break;
		case 4:
			if(b==0) {
				System.out.println("Enter non zero value for senond no.");
			}else
				System.out.println("Division  is"+a/b);
			
			break;
		default:
			System.out.println("Enter valid no.");
		}

}
}
}
