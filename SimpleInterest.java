package javaHW;

import java.util.Scanner;

public class SimpleInterest {
	
	private double interest(double p, double n, double r) {
		
		return (p*n*r)/1200;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest si = new SimpleInterest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial amount:");
        double p = sc.nextDouble();
        System.out.println("Enter the number of months:");
        double n = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        double r = sc.nextDouble();
        sc.close();
        
        System.out.println(String.format("Interest earned: $%.2f", si.interest(p,n,r)));


	}

}
