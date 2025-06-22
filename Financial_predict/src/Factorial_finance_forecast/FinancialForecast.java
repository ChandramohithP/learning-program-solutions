package Factorial_finance_forecast;

public class FinancialForecast {
	public static double futureValue(double amount, double rate, int years) 
	{       
        if (years == 0) 
        {
            return amount;
        }
        double previous = futureValue(amount, rate, years - 1);
        return previous * (1 + rate); 
    }

}
