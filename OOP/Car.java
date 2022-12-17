package OOP;

//INHERITANCE -> The class car inherits from the class Motors 
public class Car extends Motors {
    private String make;
    private String type;

    public Car(String name, float price, String make, String type) {
        super(name, price);
        this.make = make;
        this.type = type;
    }

    // POLYMORPHISM -> we modify the properties of the superclass method showdetails

    public void showDetails() {
        System.out.println("The name of this car is: " + super.getname());
        System.out.println("The price of this car is: " + super.getprice());
        System.out.println("The make of this car is: " + make);
        System.out.println("The type of this car is: " + type);
    }

}
