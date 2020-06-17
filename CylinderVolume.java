package javaHW;

import java.util.Scanner;

public class CylinderVolume {
	
	private double volume(double r, double h) {
		return 3.14*r*r*h;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CylinderVolume cv = new CylinderVolume();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cylinder's radius:");
        double r = sc.nextDouble();
        System.out.println("Enter the cylinder's height:");
        double h = sc.nextDouble();
        sc.close();
        
        System.out.println(String.format("Volume of the cylinder: %.2f", cv.volume(r,h)));

	}

}
