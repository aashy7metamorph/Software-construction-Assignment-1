
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(50);
        Sausage sausage = new Sausage(20, "Red", "2025-08-20");

        System.out.println("Cat's initial energy: " + cat.getEnergy());
        cat.eat(sausage);
        System.out.println("Cat's energy after eating sausage: " + cat.getEnergy());
    }
}
