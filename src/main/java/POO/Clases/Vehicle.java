package POO.Clases;
import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Vehicle {
    @Getter @Setter
    private String brand;
    @Getter @Setter
    private String modelVehicle;
    @Getter @Setter
    private int year;
    @Getter @Setter
    private String color;
    @Getter @Setter
    private double price;
    @Getter @Setter
    private Boolean sport;
    @Getter @Setter
    private Integer speed;
    @Getter @Setter
    private Motor motor;

public void accelerate(Integer quantity){
    this.speed += quantity;

}

}

