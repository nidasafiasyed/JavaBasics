package javaHW;

import java.util.Scanner;

public class CreditCard {
	
	private double charges(double c) {
		return c*1.00;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard cc = new CreditCard();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charge of credit card:");
        double c = sc.nextDouble();
        sc.close();
        
        System.out.println(String.format("Charge for $%.2f is $%.2f", c, cc.charges(c)));

	}

}
