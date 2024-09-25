package POO.Clases;
import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
public class Vehicle {
    private String brand;
    private String modelVehicle;
    private int year;
    private String color;
    private double price;
    private Boolean sport;
    private Integer speed;
    private Motor motor;

public void accelerate(Integer quantity){
    this.speed += quantity;

}

}

