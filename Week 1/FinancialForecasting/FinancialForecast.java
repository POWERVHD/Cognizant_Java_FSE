public class FinancialForecast {


    public static double futureValue(double principal, double rate, int years) {
        if (years == 0) return principal;
        return (1 + rate) * futureValue(principal, rate, years - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0;
        double annualGrowthRate = 0.08;
        int years = 5;

        double predictedValue = futureValue(initialInvestment, annualGrowthRate, years);
        System.out.printf("Future Value after %d years: Rs %.2f\n", years, predictedValue);
    }
}

