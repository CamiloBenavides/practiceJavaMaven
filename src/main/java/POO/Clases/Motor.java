package POO.Clases;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
public class Motor {
    @Getter @Setter
    private String modelMotor;
    @Getter @Setter
    private Integer horsePower;
    @Getter @Setter
    private Integer numberOfCylinders;
    @Getter @Setter
    private double Nm;
}
