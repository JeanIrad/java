

class Person{
    private String name;
    private int birthYear;
    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
    private int getAge(){
        return this.birthYear;
    }
}
class Variables {
    public static int add(int a, int b){
        return a+b;
    }
    private static void doSomething(boolean condition){
if(condition){
    System.out.println("I am doing something");
}else{
    System.out.println("I am not doing anything");
}
    }
    private void someOtherFunction(){
        System.out.println("I am a private function");
    }
    private static float rentalRate(float monthlyRent, float rentPurchase){
        float monthlyRate = (monthlyRent* 12/rentPurchase)* 100;
        return monthlyRate;
    }
    public static void main(String[] args) {
        Person p = new Person("Jean", 1990);
        System.out.println(p.getName());
        // int [] ages = { 12, 15, 18, 20, 25 };
        // String [] names = {"jean", "paul", "pierre", "jacques", "marie"};
        // int n = 10;
        // int numbers[] = new int[n];
        // System.out.println(Arrays.toString(names));
        // System.out.println(ages.length);
        // System.out.println(Arrays.toString(ages));
        // System.out.println(Arrays.toString(numbers));

        // Non static methods access
        // Variables v = new Variables();
        // v.someOtherFunction();
        int numbers [] = {1, 2, 3, 4, 5};
        int sum = add(4,2);
        System.out.println(sum);
        doSomething(true);

        float rate = rentalRate(1000, 200000);
        System.out.println(rate);

        for(int i = 0; i < numbers.length; ++i){
            System.out.println(numbers[i]*45);
        }

        Cat c = new Cat();
     System.out.println(c.age);

    }

    static class Cat{
        String name;
        int age;
        void meow(){
            System.out.println("Meow");
        }
        String getName(){
           return this.name  ;
        }
    }
}
