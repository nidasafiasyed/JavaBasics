package javaHW;

import java.util.Scanner;

public class CalculateHeight {
	
	private double height(double g, double t) {
		
		return 0.5*g*t*t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateHeight ch = new CalculateHeight();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rate of acceleration of rocket(g):");
        double g = sc.nextDouble();
        System.out.println("Enter the time units(t):");
        double t = sc.nextDouble();
        sc.close();
        
        System.out.println(String.format("Height of the rocket: %.2f", ch.height(g,t)));
	}

}
