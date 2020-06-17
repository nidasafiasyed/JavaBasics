package javaHW;

import java.util.Scanner;

public class SquarePeri {
	
	private double perimeter(double area) {
		return 4*Math.sqrt(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquarePeri sp = new SquarePeri();
        System.out.println("Enter the area of the square:");
        Scanner sc = new Scanner(System.in);
        double area = sc.nextDouble();
        sc.close();
        
        System.out.println(sp.perimeter(area));
	}

}
