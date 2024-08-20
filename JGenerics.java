class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void eat() {
        System.out.println("Eating...");
    }
}
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println("Cat Eating...");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println("Dog Eating...");
    }
}
class PrintName<T>{
    T thingToPrint;
    public PrintName(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
    public void printName() {
        System.out.println(thingToPrint);
    }
}

public class JGenerics {
    public static void main(String[] args) {
//        shout("Hello world");
//        shout(43785);
//        doSomething("Helllo dear world");
//        doSomething(36725);

        PrintName<Cat> cat = new PrintName<>(new Cat("Hoodie", 32));
        PrintName<Dog> dog = new PrintName<>(new Dog("Hoodie", 32));
        cat.printName();
        dog.printName();
    }
    private static <T>void shout(T something){
        System.out.println(something + " !!!");
    }

    private static <T> String doSomething(T thing){
        System.out.println(thing);
        return "Thing has been printed to the console";
    }

}
