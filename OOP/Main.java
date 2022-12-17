package OOP;

public class Main {

    public static void main(String[] args) {
        Motors motor = new Motors();
        motor.setname("HP4");
        motor.setprice(120000);
        motor.showDetails();

        System.out.println("*************************************************");
        Motors motor1 = new Motors("motor1", 76000);
        motor1.showDetails();

        System.out.println("*************************************************");

        Car car1 = new Car("Premio", 1200000, "Toyota", "Sedan");
        car1.showDetails();

    }
}