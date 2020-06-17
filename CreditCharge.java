package javaHW;


public class CreditCharge {
	
	double charge = 0.0;
	
	private double charges(double amount) {
		if (amount == 0.0)
		{
			return charge;
		}
		
		if (amount <= 500.00) {
			charge = 0.0025*amount;
			System.out.println("Charge for "+amount+"= " +charge);
			return charge;
		}
		else {
			amount=amount-500.00;
			charge += 0.0025*500;
			System.out.println("Charge for first 500 = "+charge);
			if (amount <= 1000.00) {
				charge += (0.0050*amount);
				System.out.println("Charge for remaining "+amount+" = " +charge);
				return charge;
			}
			
			else {
				amount=amount-1000.00;
				charge += 0.0050*1000;
				System.out.println("Charge for next 1000 = "+charge);
				if(amount <= 1000.00) {
					charge += (0.0075*amount);
					System.out.println("Charge for remaining "+amount+" = " +charge);
					return charge;
				}
				
				else {
					charge += 0.0075*1000;
					System.out.println("Charge for next 1000 = " +charge);
					amount = amount-1000.00;
					charge += (0.01*amount);
					System.out.println("Charge for remaining "+amount+" = " +charge);
					return charge;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				CreditCharge cc = new CreditCharge();
				//Scanner sc = new Scanner(System.in);
				//System.out.println("Enter the charge of credit card:");
		        //double c = sc.nextDouble();
		        //sc.close();
		        
		        //System.out.println(String.format("Charge for $2000 is $%.2f",cc.charges(2000)));
		        System.out.println(String.format("Charge for $2600 is $%.2f",cc.charges(2600)));
		
		

	}

}
