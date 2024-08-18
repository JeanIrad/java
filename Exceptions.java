import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {

    public static void main(String[] args){
//        FileReader reader = null;
//try{
//     reader = new FileReader("file.txt");
//    var value = reader.read();
////    reader.close()
//    System.out.println("File opened successfully!");
////    System.out.println(reader);
//} catch (IOException e){
//    System.out.println("could not read the file");
//}finally {
//    if(reader != null) {
//        try {
//            reader.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
      try{
          var result = 75 / 0 ;


      }catch (ArithmeticException e){
          System.out.println(e);
      }

    }
}
