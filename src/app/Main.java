package app;


public class Main {
    public static final String CURRENCY = "EUR";
    static double totalCost;
    static double dayCost;
    static double price;
    static int day;
    static int quantityProd;

    public static void main(String[] args) {

        System.out.print("Product #1: telephone,");
        price = 1257.74;
        day = 28;
        quantityProd = 7;
        totalCost = quantityProd * price;
        dayCost = totalCost / day;
        System.out.printf("%n total sales for %d days is %s %.2f, " +
                "%n sales by day is %s %.2f. %n", day, CURRENCY, totalCost, CURRENCY, dayCost);

        System.out.print("Product #2: TV,");
        price = 1787987.74;
        day = 7;
        quantityProd = 2;
        totalCost = quantityProd * price;
        dayCost = totalCost / day;
        System.out.printf("%n total sale for %d days is %s %.2f, " +
                "%n sales by day is %s %.2f.", day, CURRENCY, totalCost, CURRENCY, dayCost);
    }
}