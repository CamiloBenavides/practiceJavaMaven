package POO.Clases;

import lombok.*;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class Motor {
    private String modelMotor;
    private Integer horsePower;
    private Integer numberOfCylinders;
    private double Nm;
}
