import java.util.LinkedList;
import java.util.Queue;

public class TQueue {

    public static void main(String [] args) {
        Queue<Person> supermarket = new LinkedList<Person>();
        supermarket.add(new Person("Alex", 20));
        supermarket.offer(new Person("Bob", 30));
        supermarket.offer(new Person("John", 40));
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.isEmpty());
    }
    static record Person(String name, int age){}
}
