public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Holden");
        car.setModel("Astra");
        car.setColour("Red");
        car.setDoors(4);
        car.setConvertible(true);
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " +car.getModel());
        car.describeCar();
    }
}
