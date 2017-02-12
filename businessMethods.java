/**
 * @(#)MamoorBusinessMethods.java
 *
 *
 * @Shoueb Mamoor 
 * @version 1.00 2015/12/9
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class businessMethods 
{   
	public static void main(String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatOutput = new DecimalFormat ("####.##");
		
		int choice;
		double hourlyRate, hours, grossPay, overtimeHours, overtimePay, normalPay, revenue, expenses, price, discount, netPrice;
		double score1, score2, score3, score4, scoreA, scoreB, scoreC, scoreD, average, scoreSum, scoreSqA, scoreSqB, scoreSqC, scoreSqD;
		double scoreSqSum, sumSquare, diffScoreSumAndAverage, variance, deviation, principal, rate, time, interest, newPrincipal=0, compoundInterest, newInterest=0;
	
		String optionList = ("Choose the method you'd like to use:\n"
							+"Option 1 - Gross Pay \nOption 2 - Net Profit of a Product\n"
							+"Option 3 - Net Price of a Product \nOption 4 - Summation of 2 Test Scores\n"
							+"Option 5 - Average of 3 Test Score\nOption 6 - Variance of 4 Scores\n"
							+"Option 7 - Standard Deviation of 2 Scores\nOption 8 - Interest of a Loan\n"
							+"Option 9 - Compound Interest of a Loan\nOption 10 - End Program");
							
		System.out.println(optionList);
		choice=keyboard.nextInt();
						
		while(choice!=10)
		{
			switch(choice)
			{
				case 1:
					System.out.print("Enter hourly rate: ");
					hourlyRate=keyboard.nextDouble();
					System.out.print("Hours worked: ");
					hours=keyboard.nextDouble();
					
					if(hours>40)
					{
						overtimeHours=(hours-40);
						overtimePay=((hourlyRate*1.5)*(overtimeHours));
						normalPay=(hourlyRate*40);
						grossPay=((normalPay)+(overtimePay));
						System.out.println("Pay: "+grossPay);
					}
					else
						System.out.println("Pay: "+((hourlyRate)*(hours)));
						
					System.out.println();
					break;
					
				case 2:
					System.out.print("Enter revenue the product generates: ");
					revenue=keyboard.nextDouble();
					System.out.print("Enter expenses of product: ");
					expenses=keyboard.nextDouble();
					System.out.println("Net Profit: "+((revenue)-(expenses)));
					
					System.out.println();
					break;
					
				case 3:
					System.out.print("Enter product price: ");
					price=keyboard.nextDouble();
					System.out.print("Enter discount rate, in percent/decimal format: ");
					discount=keyboard.nextDouble();
					netPrice=((price)-(price*discount));
					System.out.println(("Net Price: ")+(netPrice));
					
					System.out.println();
					break;
					
				case 4:
					System.out.print("Enter Score 1: ");
					score1=keyboard.nextDouble();
					System.out.print("Enter Score 2: ");
					score2=keyboard.nextDouble();
					System.out.println("Summation: "+((score1+score2)));
					
					System.out.println();
					break;
					
				case 5:
					System.out.println("Enter Score 1 : ");
					score1=keyboard.nextDouble();
					System.out.println("Enter Score 2 : ");
					score2=keyboard.nextDouble();
					System.out.println("Enter Score 3 : ");
					score3=keyboard.nextDouble();
					average=((score1+score2+score3)/3);
					System.out.println("Average: "+average);
					
					System.out.println();
					break;
					
				case 6:
					System.out.println("Enter Score 1 : ");
					score1=keyboard.nextDouble();
					System.out.println("Enter Score 2 : ");
					score2=keyboard.nextDouble();
					System.out.println("Enter Score 3 : ");
					score3=keyboard.nextDouble();
					System.out.println("Enter Score 4 : ");
					score4=keyboard.nextDouble();
					
					scoreSum=(score1+score2+score3+score4); // add all data
					sumSquare=(scoreSum*scoreSum); //sqaure added data
					average=(scoreSum/4); //divide by how many pieces of data
					
					scoreSqA=(score1*score1); //square each data piece
					scoreSqB=(score2*score2);
					scoreSqC=(score3*score3);
					scoreSqD=(score4*score4);
					
					scoreSqSum=(scoreSqA+scoreSqB+scoreSqC+scoreSqD);//add squared numbers
					diffScoreSumAndAverage=(scoreSqSum-average);
					variance=(diffScoreSumAndAverage/3);
					
					System.out.println("Variance is: "+ variance);
					
					System.out.println();
					break;
					
				case 7:
					System.out.println("Enter Score 1 : ");
					score1=keyboard.nextDouble();
					System.out.println("Enter Score 2 : ");
					score2=keyboard.nextDouble();
					
					scoreSum=(score1+score2); // add all data
					sumSquare=(scoreSum*scoreSum); //sqaure added data
					average=(scoreSum/2); //divide by how many pieces of data
					
					scoreSqA=(score1*score1); //square each data piece
					scoreSqB=(score2*score2);
					
					scoreSqSum=(scoreSqA+scoreSqB);//add squared numbers
					diffScoreSumAndAverage=(scoreSqSum-average);
					deviation=Math.sqrt((diffScoreSumAndAverage/1));
					
					System.out.println("Standard Deviation is: "+ deviation);
					
					System.out.println();
					break;
					
				case 8:
					System.out.print("Enter Principal Borrowed/Lent: ");
					principal=keyboard.nextDouble();
					System.out.print("Enter Interest Rate: ");
					rate=keyboard.nextDouble();
					System.out.print("Enter Duration in Years: ");
					time=keyboard.nextDouble();
					
					interest=(principal*rate*time);
					System.out.println("Interest: "+interest);
					
					System.out.println();
					break;
					
				case 9:
					System.out.print("Enter Principal Borrowed/Lent: ");
					principal=keyboard.nextDouble();
					System.out.print("Enter Interest Rate: ");
					rate=keyboard.nextDouble();
					System.out.print("Enter Duration in Years: ");
					time=keyboard.nextDouble();
					
					
					
					while (time>0)
					{
						interest=(principal*rate*time);
						newPrincipal=(principal+interest);
						newInterest+=(newPrincipal*rate*time);
						time--;	
					}
					
					compoundInterest=(newPrincipal-newInterest);
					
					System.out.print("Compound Interest: "+compoundInterest);
					
					System.out.println();
					break;
					
				case 10:
					break;
					
					
					
					
					
					
			}
			System.out.println("Choose another Method Option: ");
				choice=keyboard.nextInt();
		}
						    
	}
}