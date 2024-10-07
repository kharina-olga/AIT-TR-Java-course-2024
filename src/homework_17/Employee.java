package homework_17;

public class Employee {

        private String name;
        private int age;
        private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString(){
        return String.format("Employee %s, age: %d, salary %.2f");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
