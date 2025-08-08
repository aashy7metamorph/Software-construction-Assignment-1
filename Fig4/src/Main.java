
public class Main {
    public static void main(String[] args) {
        
        Transport truck = new Transport(new CombustionEngine(), new Human());
        truck.deliver("City Center", "Groceries");

        System.out.println();

        
        Transport drone = new Transport(new ElectricEngine(), new Robot());
        drone.deliver("Warehouse", "Electronics");
    }
}
