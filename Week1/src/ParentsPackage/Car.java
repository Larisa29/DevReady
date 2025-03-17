package ParentsPackage;

public class Car {
    public int price;
    public String name;
    public String color;

    public Car(int price, String name, String color){
        this.price = price;
        this.name = name;
        this.color = color;
    }

    public Car(int price){
        this(price, "Skoda", "red"); //constructor chaining
    }

    public Car(){
        this(2000);
    }
}
