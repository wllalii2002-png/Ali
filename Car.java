public class Car extends Vehicle {
    private int doors;

    public Car(String make, int year, int doors) {
        super(make, year);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}