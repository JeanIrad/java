import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructure {

    public static void main(String[] args ){
//        int[][] numbers = {{23, 4874, 42}, {38, 48}};
//        String[] names ={};
//        String[] names = new String[4];
//        names[0] = "Jean";
//        names[2] = "Paul"; names[3] = "Lae";
//
//        Arrays.stream(names).forEach(System.out::println);



//        names[0] = "Jean de Dieu";
//        names[1]= "Paul Makara";

//        System.out.println(Arrays.toString(names));
        int[] ages = {1,2 ,3,4};
        Arrays.stream(ages).forEach(System.out::println);

//        Lists

//        immutable lists
        List immutableColors = List.of(
                "cyan",
                "indigo",
                "mangeta",
                "pale green"
        );

//        immutableColors.add("purple"); // throw an error
        List<String> colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("green");
        colors.add("purple");
        colors.add("yellow");
//        System.out.println(colors);
//        System.out.println(colors.size());
//        System.out.println(colors.contains("pink"));
//        System.out.println(colors.get(2));
//        System.out.println(colors.indexOf("purple"));
    for(String color:colors){
        System.out.println(color);
    }
    colors.forEach(System.out::println);



//        tic tac toe

//        char[][] board  = new char[3][3];
//        for(int i  = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                board[i][j] = '-';
//            }
//        }
//        System.out.println(Arrays.deepToString(board));


    }
}
