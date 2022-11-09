package chapters.Chapter10.Exercise10_08;

public class Tax {
    private int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1 ;
    public static final int MARRIED_SEPARATELY = 2 ;
    public static final int HEAD_OF_HOUSEHOLD = 3 ;

    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    Tax(){
        filingStatus = SINGLE_FILER;
        int[][] createBrackets = {{8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}};
        setBrackets(createBrackets);

        double[] createRates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        setRates(createRates);

        taxableIncome = 0 ;
    }


    Tax(int filingStatus ,int[][] brackets, double[] rates, double taxableIncome){
        setFilingStatus(filingStatus);
        setBrackets(brackets);
        setRates(rates);
        this.taxableIncome = taxableIncome;
    }


    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax(){
        double tax = brackets[filingStatus][0] * rates[0];
        int count = 0 ;
        for (int col = 1;  col < brackets[filingStatus].length ; col++) {
            if (brackets[filingStatus][col] > taxableIncome ){
                break;
            }
            tax += (brackets[filingStatus][col] - brackets[filingStatus][col-1]) * rates[col];
            count = col ;
        }
        tax += (taxableIncome - brackets[0][count]) * rates[count+1];
        return tax;
    }
}
