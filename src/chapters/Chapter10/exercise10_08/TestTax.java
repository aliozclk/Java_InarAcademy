package chapters.Chapter10.exercise10_08;

public class TestTax {
    public static void main(String[] args) {
        Tax tax_2001 = new Tax();
        Tax tax_2009 = new Tax();

        double[] rates_2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
        int[][] brackets_2001 ={{27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}};

        tax_2001.setRates(rates_2001);
        tax_2001.setBrackets(brackets_2001);

        System.out.println(
                "---------------------------------2001--------------------------------\n" +
                        "Taxable       Single      Married Joint       Married        Head of\n" +
                        "Income                    or Qualifying       Separate       a House\n" +
                        "                          Widow(er)\n" +
                        "---------------------------------------------------------------------");
        printTaxes(tax_2001);
        System.out.println(
                "-----------------------------------2009------------------------------\n" +
                        "Taxable       Single      Married Joint       Married        Head of\n" +
                        "Income                    or Qualifying       Separate       a House\n" +
                        "                          Widow(er)\n" +
                        "---------------------------------------------------------------------");
        printTaxes(tax_2009);

    }

    public static void printTaxes(Tax tax){

        for (double income = 50_000; income < 60_000; income+= 1000){
            tax.setTaxableIncome(income);
            System.out.printf("%7.1f",tax.getTaxableIncome());
             for (int status = 0; status < 4; status++){
                printTaxesWıthSpecifiedStatusAndIncome(tax,status);
            }
            System.out.println();
        }
    }

    public static void printTaxesWıthSpecifiedStatusAndIncome(Tax tax,int status){
        tax.setFilingStatus(status);

        System.out.printf("%15.2f", tax.getTax());


    }
}
