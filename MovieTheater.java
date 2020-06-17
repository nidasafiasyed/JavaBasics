package javaHW;

import java.util.Scanner;

public class MovieTheater {
	
	private double calculateTotalProfit(double p) {
		
		double sp = 5.00*p;
		double cp = 20.00 + (0.5*p);
		return sp-cp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTheater mt = new MovieTheater();
		System.out.println("Enter the number of attendees:");
		Scanner sc = new Scanner(System.in);
        double people = sc.nextDouble();
        sc.close();
        System.out.println(String.format("Your income is $%.2f", mt.calculateTotalProfit(people)));
	}

}
