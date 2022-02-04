import java.util.Scanner;

class Login{
    
    static String userId = "Ajay";
    static String password = "password";

    public static boolean loginUser(String user, String pass) {

        if (userId.equals(user) && password.equals(pass))
        return true;
        else 
        return false;
    }
}

public class Assignment1Q6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String user, pass;
            int attempt = 0;
            

            do {
                System.out.println("Enter UserID: ");
                user = sc.next();
                System.out.println("Enter Password: ");
                pass = sc.next();
                boolean ans= Login.loginUser(user,pass);


                if (ans == true) {
                    System.out.println("Welcome Ajay");
                    break;
                } 
                else if (ans == false && attempt < 3) {
                    System.out.println("You have entered wrong credentials ,please enter the right credentials.\n");
                    attempt += 1;
                }

            } while (attempt != 3);
            if (attempt >= 3) {
                System.out.println("\nYou have entered wrong credentials 3 times\n");
            }
        }  
    }
}
