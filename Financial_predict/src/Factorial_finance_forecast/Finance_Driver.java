package Factorial_finance_forecast;
import java.util.Scanner;
public class Finance_Driver {

	 public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the initial amount");
	        double initialAmount = sc.nextDouble();
	        System.out.println("growth rate per year");
	        double growthRate = sc.nextDouble(); //profit=>10/100=0.1
	        System.out.println("Enter the Number of years ");
	        int years = sc.nextInt();

	        double result = FinancialForecast.futureValue(initialAmount, growthRate, years);
	        System.out.printf("Forecasted value after %d years: ₹%.2f", years, result);
	        sc.close();
	        }

}
