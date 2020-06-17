package javaHW;

import java.util.Scanner;

public class Squaring {
	
	private int sqdiff(int n) {
		int[] arr = new int[n];
		int sum = 0;
		int sumOfSquares = 0;
		System.out.println("Enter "+n+" numbers:");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n;i++)
		{
			int x=i+1;
			System.out.println("Number "+ x);
			arr[i] = sc.nextInt();
			sum += arr[i];
			sumOfSquares =  arr[i]*arr[i];
		}
		sc.close();
		return ((sum*sum) - sumOfSquares );
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squaring sq = new Squaring();
        System.out.println("How many numbers would you like?");
        Scanner sc = new Scanner(System.in);
			int l = sc.nextInt();
			
        int res = sq.sqdiff(l);
        sc.close();
        System.out.println("Result = "+res);
        
        }
        
	}

