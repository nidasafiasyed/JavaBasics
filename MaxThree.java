package javaHW;

import java.util.Scanner;

 class MaxThree {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int temp = a>b?a:b;
		int res = temp>c?temp:c;
		System.out.println("Greatest number is "+res);
		
	}

}
