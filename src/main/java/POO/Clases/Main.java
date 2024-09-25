package POO.Clases;

import POO.Herencia.Car;
import POO.Herencia.Motorbike;
import POO.Herencia.Truck;

public class Main {
    public static void main(String[] args) {
        Vehicle Toyota = new Vehicle("Toyota", "Corolla", 2021, "Black", 20000.0, false, 0, new Motor("V8", 200, 4, 300.0));
        System.out.println(Toyota);

        //Herencia
        Motorbike Apache = new Motorbike();//Objeto(Instancia de la clase)
        Apache.accelerate(100);

        //Polimorfismo
        Vehicle vehicle;

        vehicle = new Motorbike();
        vehicle.accelerate(100);

        vehicle = new Truck();
        vehicle.accelerate(80);

        vehicle = new Car();
        vehicle.accelerate(120);

        // Clases abstractas: No se pueden instanciar, solo se instancian las clases hijas 
    }
}
