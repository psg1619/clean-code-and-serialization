package com.Epam_Week4;
import java.util.*;

public class UserInterface {
	public void take_query() {
		System.out.println("Hello There!");
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the Principal Amount Taken");
		long principal=inp.nextLong();
		System.out.println("Enter the time span for which Money has been borrowed");
		int time=inp.nextInt();
		System.out.println("Enter the rate of interest");
		double rate=inp.nextDouble();
		System.out.println("Enter 1 for simple interest and 2 for compound interest!");
		int choice=inp.nextInt();
CalculateInterest c=new CalculateInterest(principal,time,rate,choice);


	}
}
