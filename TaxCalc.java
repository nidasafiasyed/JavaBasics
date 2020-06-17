package javaHW;

import java.util.Scanner;

public class TaxCalc {
	private double tax(double pay) {
		if(pay <= 240) {
			return 0;
			}
		else if(pay <= 480) {
			return pay*0.15;
		}
		else {
			return pay*0.28;
		}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalc tc = new TaxCalc();
		System.out.println("Enter the gross pay:");
		Scanner sc = new Scanner(System.in);
        double pay = sc.nextDouble();
        sc.close();
        System.out.println(String.format("You owe $%.2f in taxes", tc.tax(pay)));

	}

}
