package util;

public class CurrencyConverter {
    public static double amountPaid(double price, double dollars){
        return price * ( dollars * 1.06 );
    }
}
