package javaHW;

import java.util.Scanner;

public class CalculateTax {
	
	private double tax(double pay) {
		
			return pay*0.15;
			
		}
	
	private double netPay(double hours) {
		return hours*12;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateTax ct = new CalculateTax();
		System.out.println("Enter the gross pay:");
		Scanner sc = new Scanner(System.in);
        double pay = sc.nextDouble();
        System.out.println("Enter the number of hours worked:");
        double hours = sc.nextDouble();
        sc.close();
        System.out.println(String.format("You owe %.2f in taxes", ct.tax(pay)));
        System.out.println(String.format("Your net pay is %.2f in taxes", ct.netPay(hours)));

	}

}
