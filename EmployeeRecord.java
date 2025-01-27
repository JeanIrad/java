public record  EmployeeRecord(String name, Integer employeeNumber) {
    public String nameInUpperCase() {
        return name.toUpperCase();
    }
}