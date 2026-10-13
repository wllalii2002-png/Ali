public class Lecturer extends Person {
    private double salary;

    public Lecturer(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    public double getSalary() { return salary; }
}