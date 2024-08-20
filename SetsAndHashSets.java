import java.util.*;

public class SetsAndHashSets {
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();
//        names.add("John");
//        names.add("Jane");
//        names.add("Bob");
//        names.remove("John");
//        System.out.println(names.size());
//        System.out.println(names);
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(2);
        numberList.add(3);
        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>(numberList);
//        numberSet.addAll(numberList);
        System.out.println(numberSet);

    }
}
