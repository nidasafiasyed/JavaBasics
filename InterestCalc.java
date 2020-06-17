package javaHW;

import java.util.Scanner;

public class InterestCalc {
	
	private double interest(double amt) {
		if(amt <= 1000) {
			return amt*0.04;
			}
		else if(amt <= 5000) {
			return amt*0.045;
		}
		else {
			return amt*0.05;
		}
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestCalc ic = new InterestCalc();
		System.out.println("Enter the deposit amount:");
		Scanner sc = new Scanner(System.in);
        double amt = sc.nextDouble();
        sc.close();
        
        System.out.println(String.format("$%.2f earns $%.2f interest in a year",amt,ic.interest(amt)));

	}

}
