import java.util.Currency;
import java.util.Scanner;

public class e_com{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency that you would like to convert from:");
        System.out.println("1. USD");
        System.out.println("2. INR");
        System.out.println("3. EUR");
        int from_cur = sc.nextInt();

        if (from_cur == 1) {
            Currency curr = Currency.getInstance("USD");
            System.out.println("Enter the amout in usd:");
            float usd_amt = sc.nextFloat();
            //int usd = curr.getDefaultFractionDigits();

            System.out.println("Enter the currency that you would like to convert to:");
            System.out.println("1. INR");
            System.out.println("2. EUR");
            int to_cur = sc.nextInt();

            if (to_cur == 1) {
                Currency curr1 = Currency.getInstance("INR");
                float inr = usd_amt * 83; // Assuming the conversion rate is 1 USD = 83 INR
                String symbol = curr1.getSymbol();
                System.out.println("USD to INR: " + inr + " " + symbol);

            } else if (to_cur == 2) {
                Currency curr1 = Currency.getInstance("EUR");
                double eur = usd_amt * 0.91; // Assuming the conversion rate is 1 USD = 0.91 EUR

                String symbol = curr1.getSymbol();
                System.out.println("USD to EUR: " + eur + " " + symbol);
            }
        }
        else if(from_curr==2)
        {
            
        }
    }
}