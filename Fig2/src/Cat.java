
public class Cat {
    private int energy;

    public Cat(int energy) {
        this.energy = energy;
    }

    public void eat(Food food) { // IMPORTANT: Food, not Sausage
        this.energy += food.getNutrition();
    }

    public int getEnergy() {
        return energy;
    }
}
