

public class ReflectionExample {
    
    public static double randomNumber = Math.floor(Math.random() * 10);

    public static void main(String[] args) throws Exception {
        Person person = new Person("Jean", 32);
        // Field name = person.getClass().getDeclaredField("name");
        // System.out.println(name.getName());
        // Method[] personMethods = person.getClass().getDeclaredMethods();
        System.out.println(randomNumber);
        //    Field[] personFields =  person.getClass().getDeclaredFields();
        //    for (Field field : personFields) {
        //        if (field.getName().equals("name")) {
        //            field.setAccessible(true);
        //            field.set(person, "John");
        //        }

        //    }
        //    for (Method m : personMethods) {
        //        System.out.println(m.getName());
        //        if (m.getName().equals("saySomething")) {
        //         m.setAccessible(true);
        //            m.invoke(person);
        //     }
        //    }
        System.out.println(person.getName());
        double rand = new ReflectionExample().getRandomNumber();
     System.out.println(rand);
    }

    private double getRandomNumber() {
        return Math.floor(Math.random() * 100);
    }
}