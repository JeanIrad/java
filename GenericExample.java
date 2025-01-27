public class GenericExample {
    public static void main(String[] args) {
        int thing = doSomething(4);
        System.out.println(doSomething("Hello world"));
        System.out.println(thing);
    }
    
    private static <T> T doSomething(T thing) {
        return thing;
    }
}
