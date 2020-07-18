package com.Epam_Week4;

public class CalculateInterest {
	long principal;
	int time;
	double rate;

	CalculateInterest(long principal,int time,double rate,int choice){
		this.principal=principal;
		this.time=time;
		this.rate=rate;
		switch(choice) {
		case 1:this.simpleInterest();
		break;
		case 2:this.compoundInterest();
		break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
	
	
	private void simpleInterest() {
		double i=this.principal*this.time*this.rate/100;
		System.out.println("Interest:"+i);
		System.out.println("Total Amount Payable:"+(i+this.principal));
	}
	
	private void compoundInterest() {
		double amount=this.principal;
		double interest;
		for(int i=0;i<this.time;i++) {
			interest=amount*this.rate/100;
			amount=amount+interest;
		}
		System.out.println(("Interest:"+(amount-this.principal)));
		System.out.println("Total Amount Payable:"+amount);
		
	}
}
