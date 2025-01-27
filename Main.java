public class Main {
    public static void main(String[] args) {
 
    
        greetMe("");
    
        
    }

    private static void greetMe(String myName) {
        if (myName.length() == 0) {
            System.out.println("You have no name");
        } else
            System.out.println("Greetings " + myName);
    }

  
}
