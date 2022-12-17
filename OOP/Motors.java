package OOP;

public class Motors {
    private String name;
    private float price;

    public Motors() {
    }

    public Motors(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setprice(float price) {
        this.price = price;
    }

    public String getname() {
        return name;
    }

    public float getprice() {
        return price;
    }

    public void showDetails() {
        System.out.println("The name of this motor is: " + name);
        System.out.println("The price of this motor is: " + price);
    }
}
