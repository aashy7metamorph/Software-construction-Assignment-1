package Fig1;

public class TaxCalculator {

    public double getTaxRate(String country, String state, String product) {
        if (country.equalsIgnoreCase("USA")) {
            return getUSTax(state);
        } else if (country.equalsIgnoreCase("EU")) {
            return getEUTax(country);
        } else if (country.equalsIgnoreCase("China")) {
            return getChineseTax(product);
        }
        return 0.0;
    }

    private double getUSTax(String state) {
        if (state.equalsIgnoreCase("California")) return 0.08;
        else if (state.equalsIgnoreCase("Texas")) return 0.07;
        return 0.05;
    }

    private double getEUTax(String country) {
        return 0.20;
    }

    private double getChineseTax(String product) {
        return 0.13;
    }
}