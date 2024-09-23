package POO.Clases;

public class Main {
    public static void main(String[] args) {
        Vehicle Toyota = new Vehicle("Toyota", "Corolla", 2021, "Black", 20000.0, false, 0, new Motor("V8", 200, 4, 300.0));
        System.out.println(Toyota);
     }
}
