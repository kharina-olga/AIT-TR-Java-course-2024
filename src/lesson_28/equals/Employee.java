package lesson_28.equals;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //ссылки ссылаются на один и тот же объект
        // this == obj — если оба объекта указывают на одну и ту же область памяти, они автоматически считаются равными.
        if (!(obj instanceof Employee)) return false; //проверка на возможность привести к Employee
        //  Приводим объект к типу employee
        Employee employee = (Employee) obj;

        // При таком сравнении возможно появление NPE
        // firstName.equals(employee.firstName);

        // При сравнении любого объекта с null должно возвращаться false

        // позволяет безопасно сравниввать объекты, учитывая возможность null значений

        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(dateOfBirth, employee.dateOfBirth);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
