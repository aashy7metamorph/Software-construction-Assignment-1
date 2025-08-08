
public class Sausage implements Food {
    private int nutrition;
    private String color;
    private String expirationDate;

    public Sausage(int nutrition, String color, String expirationDate) {
        this.nutrition = nutrition;
        this.color = color;
        this.expirationDate = expirationDate;
    }

    @Override
    public int getNutrition() {
        return nutrition;
    }

    public String getColor() {
        return color;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
