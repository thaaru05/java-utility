import java.util.Currency;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter from currency:");
        String sourceCurrencyCode = sc.nextLine();

        System.out.println("Enter to currency:");
        String targetCurrencyCode = sc.nextLine();

        System.out.println("Enter the amount to convert:");
        double amountToConvert = sc.nextDouble();
        double exchangeRateUSDToEUR = getExchangeRate("USD", "EUR", sc);
        double exchangeRateUSDToINR = getExchangeRate("USD", "INR", sc);
        double convertedAmount = convertCurrency(amountToConvert, sourceCurrencyCode, targetCurrencyCode, exchangeRateUSDToEUR, exchangeRateUSDToINR);
        System.out.println("Converted amount: " + convertedAmount + " " + Currency.getInstance(targetCurrencyCode).getSymbol());
    }
    private static double getExchangeRate(String fromCurrencyCode, String toCurrencyCode, Scanner sc) {
        System.out.println("Enter the exchange rate from " + fromCurrencyCode + " to " + toCurrencyCode + ":");
        return sc.nextDouble();
    }
    private static double convertCurrency(double amount, String fromCurrencyCode, String toCurrencyCode, double exchangeRateToEUR, double exchangeRateToINR) {
        double amountInUSD;

        switch (fromCurrencyCode) {
            case "EUR":
                amountInUSD = amount / exchangeRateToEUR;
                break;
            case "INR":
                amountInUSD = amount / exchangeRateToINR;
                break;
            default: 
                amountInUSD = amount;
        }
        switch (toCurrencyCode) {
            case "EUR":
                return amountInUSD * exchangeRateToEUR;
            case "INR":
                return amountInUSD * exchangeRateToINR;
            default:
                return amountInUSD;
        }
    }
}