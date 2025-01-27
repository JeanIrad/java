public record UserRecord(Integer id, String firstName, String lastName) {
    public String fullName() {
        return firstName + " " + lastName;
    }

    public UserRecord() {
    this(1, "John", "Doe");
}
}
