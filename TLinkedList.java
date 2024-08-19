import java.util.LinkedList;
import java.util.ListIterator;

public class TLinkedList {

    public static void main(String[] args) {
        LinkedList<Person> linkedlist = new LinkedList<Person>();
        linkedlist.add(new Person("Jean", 49));
        linkedlist.add(new Person("Peter", 39));
        linkedlist.add(new Person("Maritha", 49));
        linkedlist.add(new Person("John", 50));
        ListIterator<Person> iterator = linkedlist.listIterator();
      while (iterator.hasNext()) {
          System.out.println(iterator.next().toString());
      }
    }
    record Person(String name, int age){}
}
