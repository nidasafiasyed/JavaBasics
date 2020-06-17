package javaHW;

import java.util.Scanner;

public class VowelCheck {
	
	private boolean aeiou(char ch) {
		char[] vowels= {'a','e','i','o','u'};
		for(char c: vowels) {
			if (ch == c) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelCheck au = new VowelCheck();
		System.out.println("Enter a letter: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next(".").charAt(0);
		while(!Character.isLetter(ch)) {
			System.out.println("Invalid input");
			ch = sc.next(".").charAt(0);
		}
		sc.close();
		if(au.aeiou(ch)) {
			System.out.println(ch+" is a vowel");}
			else {
				System.out.println(ch+" is not a vowel");
			}
		}
	}


