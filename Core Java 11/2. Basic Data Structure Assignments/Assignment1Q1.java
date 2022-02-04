import java.util.Scanner;

class ArmstrongOrNot {
    
    static boolean armstrongCheck(int num) {

        int n= num, x=0, y;
        while (n != 0) {
            y = n % 10;
            x+= y * y * y;
            n = n/10;
        }

        if (x == num)
        {
            return true;
        }  
        else 
        {
            return false;
        }   

    }
}

public class Assignment1Q1   {
     public static void main(String[] args) {

        int num;
        System.out.println("Enter the number: ");
        try (Scanner in = new Scanner(System.in)) {
            num = in.nextInt();
        }
        if (ArmstrongOrNot.armstrongCheck(num))
        {
            System.out.println("Armstrong number ");
        }    
        else
        {
            System.out.println("Not Armstrong number ");
        } 
    }
}

