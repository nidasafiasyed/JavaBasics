package javaHW;

import java.util.Scanner;

 class LoanSelection {
	
	public void evaluate(int age, char gen, char js, double assets) {
		int loan;
		if(age < 26)
		{
			if(Character.compare(js, 'S') == 0) {
				loan = 10000;
				System.out.println("You are eligible for $"+loan);
			}
			
			if(Character.compare(js, 'P') == 0) {
				loan = 15000;
				System.out.println("You are eligible for $"+loan);
			}
		}
		
		else if(age < 41) {
			if(assets <= 40000) {
				System.out.println("Not enough assets.");
	        	return;
			}
			else {
				if(Character.compare(gen, 'M') == 0) {
					loan = 25000;
					System.out.println("You are eligible for $"+loan);
				}
				
				if(Character.compare(gen, 'F') == 0) {
					loan = 30000;
					System.out.println("You are eligible for $"+loan);
				}
			}
		}
		
		else if(age < 61) {
			if(assets <= 50000) {
				System.out.println("Not enough assets.");
	        	return;
			}
			else {
				loan = 40000;
				System.out.println("You are eligible for $"+loan);
			}
		}
		
		else {
			if(Character.compare(js, 'S') == 0) {
				loan = 35000 - (age * 100);
				System.out.println("You are eligible for $"+loan);
			}
			
			if(Character.compare(js, 'R') == 0) {
				loan = 25000 - (age * 100);
				System.out.println("You are eligible for $"+loan);
			}
			
		}
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char j;
		
		System.out.println("Enter your age: ");
        int a = sc.nextInt();
        if(a < 16) {
        	System.out.println("You are too young. Check back later.");
        	sc.close();
        	return;
        }
        
        
        System.out.println("Enter your gender(M/F): ");
        char g = Character.toUpperCase(sc.next(".").charAt(0));
        
        if(Character.compare(g, 'M') != 0 && Character.compare(g, 'F') != 0) {
        	System.out.println("Invalid option");
        	sc.close();
        	return;
        }
        
        if (a > 60) {
        	System.out.println("Are you self-employed or retired?(S/R): ");
            j = Character.toUpperCase(sc.next(".").charAt(0));
            if(Character.compare(j, 'S') != 0 && Character.compare(j, 'R') != 0) {
            	System.out.println("Invalid option");
            	sc.close();
            	return;
            }
        }
        
        else {
        
        System.out.println("Are you self-employed or a professional?(S/P): ");
        j = Character.toUpperCase(sc.next(".").charAt(0));
        if(Character.compare(j, 'S') != 0 && Character.compare(j, 'P') != 0) {
        	System.out.println("Invalid option");
        	sc.close();
        	return;
        	}
        }
        
        System.out.println("Enter your assets' worth: ");
        int as = sc.nextInt();
        if(as <= 25000) {
        	System.out.println("Not enough assets.");
        	sc.close();
        	return;
        }
        
        sc.close();
        
        LoanSelection ls = new LoanSelection();
        ls.evaluate(a, g, j, as);
        

	}

}
