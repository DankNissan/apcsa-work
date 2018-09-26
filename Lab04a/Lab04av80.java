public class Lab04av80
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
        System.out.println("Principal:        $" + principal);
        System.out.println("Annual Rate:      " + annualRate + "%");
        System.out.println("Number of Years:  " + numYears);
        System.out.println("Monthly Payment:  $" + monthlyPayment);
    }
}

