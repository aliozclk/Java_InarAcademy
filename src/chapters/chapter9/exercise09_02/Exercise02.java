package chapters.chapter9.exercise09_02;

public class Exercise02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation");

        stock.previousClosingPrice = 34.5 ;
        stock.currentPrice = 34.35;

        System.out.println("price-change percentage : " + stock.getChangePercent());
    }
}
