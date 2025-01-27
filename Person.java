public class Person {
    private final String name;
    private int age;

    Person(String nm, int ag) {
        this.name = nm;
        age = ag;
    }  
    public String getName() {
        return name;
    }
  
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void saySomething() {
        System.out.println("This person is saying something!");
    }

}
