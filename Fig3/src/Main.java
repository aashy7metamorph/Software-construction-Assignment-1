public class Main {
    public static void main(String[] args) {
        Company gameDev = new GameDevCompany();
        Company outsourcing = new OutsourcingCompany();

        System.out.println("GameDevCompany:");
        gameDev.createSoftware();

        System.out.println("\nOutsourcingCompany:");
        outsourcing.createSoftware();
    }
}
