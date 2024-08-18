import java.time.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class hello {
static class House{
    String name;
    String address;
    int lifeSpan;
    public House(String name, String address, int age){
        this.name = name;
        this.address = address; this.lifeSpan = age;
    }

    public String getName(){
        return  this.name;
    }
}
   static   int age = 16;
    public static void main(String [] args){
      String name = "Jean".toLowerCase();
House h = new House("House X", "KK83st", 47);
        System.out.println(h.getName()+ h.lifeSpan);

//switch (name){
//    case "Jean":
//        System.out.println("you are eligible to learning Java!");
//        break;
//    case "Peter":
//        System.out.println("You are not eligible, Kindly check your program!");
//        break;
//    default:
//        System.out.println("Hello world "+ age);
//}

//        Local dates
//        Date myDate = new Date();
//        System.out.println(myDate);
//LocalDateTime time = LocalDateTime.now();
//        System.out.println(time);
//
//        double[] numbers = {1,2, 3,4,5, 6,7};
//        for(double num: numbers){
//            System.out.println(num);
//        }
//        int age= 60;
//        do{
//            System.out.println("hello world");
//            age++;
//        } while(age< 70);
// LocalDate now  =  LocalDate.now();
//        System.out.println(now.getChronology());
//        byte range = 100;

//        while(true){
//            System.out.println(range);
//            range--;
//            if(range == 50){
//                break;
//            }
//        }

//        for(int i = 0; i < 1_5; i++){
//            System.out.println("here "+ i);
//        }

//        Scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name? ");
//        String userName = scanner.nextLine();
//        System.out.println("Hello, "+ userName);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("what's your age? ");
//        int age = scanner.nextInt();
//        int years = LocalDate.now().getYear() - age;
//        System.out.println("You are "+ years +" years old!");

//String brand = "Samsung";
//boolean checkString = brand.startsWith("S");
//        System.out.println(checkString);
//        System.out.println(brand.strip());
//        System.out.println(Arrays.toString(countVowels("Hello world, Here comes this one")));
//        int val = countVowels("Hello world, Here comes this Event of learning Java as A future promising developer at the peak!");
//        System.out.println(val);
        System.out.println(isEven(43));
        System.out.println(isPrime(2));
        System.out.println(factorial(5));
        int[] numbers = {1, 3,48, 436743, 9326723, 2328623, 463_99};
        System.out.println(maxValue(numbers));
    }
 static boolean isEven(int num){
        return num %2 == 0;
 }
 static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        if(num == 2){
            return true;
        }
        for(int i = 2; i <= num/2 + 1; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
 }
// recursive functions
    static long factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
static int maxValue(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
}
//public static int countVowels(String str){
//        char[] vowels = {'a', 'e', 'u', 'i', 'o' };
//      str = str.toLowerCase();
//      int count =0;
//  for(int i = 0; i < str.length(); i++){
//      char currentChar = str.charAt(i);
//      for(char c:vowels){
//          if(currentChar == c){
//              count++;
//          }
//      }
//  }
//
//  return count;
//
//}
}
