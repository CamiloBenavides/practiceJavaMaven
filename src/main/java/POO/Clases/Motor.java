package POO.Clases;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
