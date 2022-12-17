package OOP;

public class Motorcycle {

    private String name;
    private float price;

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

    public void showAttributes() {
        System.out.println("The motorcycle name is: " + name);
        System.out.println("The motorcycle price is: " + price);
    }

}
