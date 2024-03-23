package Game;

import java.util.*;
public class netPayableSalary {
	
//	Declaring variables
	
	double HRA;
	double specialAllowance;
	double deduction;
	double basic;
	
//	  Create method to calculate NetPayableSalary as NPS
	public void NPS() {	
		
//		Accept basic value
		System.out.println("Enter your basic Salary: ");
		Scanner Sc = new Scanner(System.in);
		basic = Sc.nextDouble();
		
//		calculate hra,sp,pf deduction
		HRA = (50* basic)/100;
		specialAllowance = (75* basic)/100;
		deduction = (12*basic)/100; 
		
//		declare and assign the netPayableSalary formula
		double Nps = (basic + HRA + specialAllowance) - deduction;
		
		System.out.println("Basic Salary       = "+"$"+basic);
		System.out.println("HRA                = "+"$"+HRA);
		System.out.println("Special allowance  = "+"$"+specialAllowance);
		System.out.println("PF Deduction       = "+"$"+deduction);
		System.out.println("----------------------------");
		System.out.println("Net Payable salary = "+"$"+Nps);
	}
	
	public static void main(String[] agrs){
		netPayableSalary Salary = new netPayableSalary();
		
		Salary.NPS();
	}

}
