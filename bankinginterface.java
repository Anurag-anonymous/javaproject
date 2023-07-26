package bankinginterface.java;
import java.util.*;

public class bankinginterface {
	
	
	public static void main(String [] args) {
		
		int choosedoption= 0;
		while(choosedoption !=4){
			System.out.println("Choose a Option to Proceed:");
			System.out.println("1. Deposite");
			System.out.println("2. Withdrawal");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			Scanner sc = new Scanner(System.in);
		
			choosedoption = sc.nextInt();
			
			switch (choosedoption) {
			case 1:
				bankinginterface.deposite();
				break;
			case 2:
				bankinginterface.withdrawal();
				break;
				
			case 3:
				bankinginterface.balance();
				break;
				
				
			case 4:
				break;
				
				
			}
			
			
			
	   }
	  
		
		
	
	}
	static int amount=0;
	
	public static void deposite(){
		
		System.out.println("You are on Deposite Interface");
		System.out.println("Caution! you can only deposite the amount in the hundreds ruppees(like: 100, 200, 300, 500, 1000, 2000)");
		System.out.println("Enter the amount you want to deposite:");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextInt();
		System.out.println("Your entered amount is:"+ amount);
		System.out.println("Do you want to Continue(Y) or Return(N):");
		Scanner nc = new Scanner(System.in);
		char decision=nc.next().charAt(0);
		if(decision=='Y') {
			
			if(amount%100 == 0 ) {
				System.out.println("Amount Deposited:"+ amount);
				return ;
			} else{
				System.out.println("Amount is not depositable");
				return ;
			}	
		}
		else if(decision!='N') {
			while(decision!='N' || decision !='Y') {
				System.out.println("Enter valid Decision Character!");
			decision = nc.next().charAt(0);
			}
		}else{return;}
	}
	
	
	public static void withdrawal() {
		
		
	System.out.println("Your are on Withdrawal Interface");
	System.out.println("Enter the amount you want to withdrawal:");
	Scanner wc = new Scanner (System.in);
	int a = wc.nextInt();
	System.out.println("Your entered amount is:"+ a);
	System.out.println("Do you want to Continue(Y) or Return(N):");
	Scanner ac = new Scanner(System.in);
	char decision = ac.next().charAt(0);
	if (decision=='Y') {
	  if (amount >=a) {
		  System.out.println("Amount Withdrawaled:"+a);
		  amount -= a;
		  return;
	  }else {
		  System.out.println("Amount is less than "+a +"in your account");
		  return ;
	  }
	}
	else if(decision!='N') {
		while(decision!='N') {System.out.println("Enter valid Decision Character!");
		decision = ac.next().charAt(0);
		}
	}else {return;}
	
	
	}
	
	public static void balance() {
		
		if(amount ==0) {
			System.out.println("Current amount in your bank account in zero please deposite first!");
		}else {System.out.println("Current amount in bank account:"+amount);}
	return;

	}
	
	
}
