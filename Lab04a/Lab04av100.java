public class Lab04av100
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double p = principal;
        double r = annualRate / 12 / 100;
        double n = numYears * 12;
        double monthlyPayment = ( (r * Math.pow( (1 + r), n) ) / (Math.pow( (1 + r), n) - 1) ) * p;
        double totalPayments = monthlyPayment * n;
        double totalInterest = totalPayments - principal;
        System.out.println("Principal:        $" + ( (double) Math.round(principal * 100) / 100) );
        System.out.println("Annual Rate:      " + annualRate + "%");
        System.out.println("Number of Years:  " + numYears);
        System.out.println("Monthly Payment:  $" + ( (double) Math.round(monthlyPayment * 100) / 100) );
        System.out.println("Total Payments:   $" + ( (double) Math.round(totalPayments * 100) / 100) );
        System.out.println("Total Interest:   $" + ( (double) Math.round(totalInterest * 100) / 100) );
    }
}
