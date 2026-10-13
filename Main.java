public class Main {
    public static void main(String[] args) {
        System.out.println("--- Inheritance ---");
        Student s = new Student("Ali", 1, 3.5);
        Lecturer l = new Lecturer("Hodan", 2, 1200);
        System.out.println(s.getName() + " GPA " + s.getGpa());
        System.out.println(l.getName() + " salary " + l.getSalary());

        Car car = new Car("Toyota", 2020, 4);
        System.out.println(car.getMake() + " " + car.getYear() + " doors " + car.getDoors());

        System.out.println("\n--- Overriding / Polymorphism ---");
        Employee e1 = new Employee();
        Employee e2 = new Manager();
        e1.work();
        e2.work();

        System.out.println("\n--- Abstract class + Exceptions ---");
        BankAccount[] accounts = {
            new SavingsAccount("SAV-1", 200, 50),
            new CurrentAccount("CUR-1", 200, 200),
            new StudentAccount("STU-1", 200)
        };

        for (BankAccount acc : accounts) {
            try {
                acc.withdraw(300);
                System.out.println("Withdraw OK");
            } catch (InsufficientBalanceException ex) {
                System.out.println("Refused: " + ex.getMessage());
            } finally {
                acc.show();
            }
        }

        System.out.println("\n--- Abstract GraphicObject ---");
        GraphicObject g = new Circle();
        g.draw();
        g.resize();
        g.draw();
    }
}