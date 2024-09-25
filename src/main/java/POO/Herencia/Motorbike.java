package POO.Herencia;

import POO.Clases.Vehicle;
import lombok.ToString;

@ToString
public class Motorbike extends Vehicle {
    public Motorbike(){
        this.getModelVehicle();
    }
}
