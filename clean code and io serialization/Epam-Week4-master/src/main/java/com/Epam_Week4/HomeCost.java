package com.Epam_Week4;
import java.util.*;

public class HomeCost {

 HomeCost() {
		System.out.print("Cost of constructing a building are as follows:");
		System.out.println("1:1200 rupees using Standard Materials.");
		System.out.println("2:1500 rupees using above Standard Materials.");
		System.out.println("3:1800 rupees using high Standard Materials.");
		System.out.println("4:2500 rupeesusing high Standard Materials with Full Automation");
		System.out.println("Enter  your choice to get an estimated cost:");	
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		System.out.println("Enter the area of the house");
		double area=s.nextDouble();
		
		switch(choice) {
		case 1:this.choice1(area);
		break;
		
		case 2:this.choice2(area);
		break;
		
		case 3:this.choice3(area);
		break;
		
		case 4:this.choice4(area);
		break;
		
		default:System.out.println("Invalid Choice");;
		break;
		
		}
		
	}
	
 private void choice1(double area){
		double price=1200*area;
		System.out.print(price);
	}
private void choice2(double area){
		double price=1500*area;
		System.out.print(price);
	}
private void choice3(double area){
		double price=1800*area;
		System.out.print(price);
	}
private void choice4(double area){
		double price=2500*area;
		System.out.print(price);
	}
	
}
