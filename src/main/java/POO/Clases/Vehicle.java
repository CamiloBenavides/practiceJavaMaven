package POO.Clases;
import lombok.*;

public class Vehicle {
    @Getter @Setter
    private String brand;
    @Getter @Setter
    private String model;
    @Getter @Setter
    private int year;
    @Getter @Setter
    private String color;
    @Getter @Setter
    private double price;

    public Vehicle(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
}
