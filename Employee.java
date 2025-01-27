
import java.util.Objects;

public class Employee {
    private final String name;
    private final Integer employeeNumber;

    Employee(String name, Integer employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }
    // Getters
    public String getName() {
        return name;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeNumber);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Objects.equals(name, employee.name) &&
                Objects.equals(employeeNumber, employee.employeeNumber);
    }
}
