
public class Transport {
    private Engine engine;
    private Driver driver;

    public Transport(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }

    public void deliver(String destination, String cargo) {
        System.out.println("Delivering " + cargo + " to " + destination);
        driver.navigate();
        engine.move();
    }
}
