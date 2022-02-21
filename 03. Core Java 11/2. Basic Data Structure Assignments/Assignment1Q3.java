import java.util.Scanner;

class SiCi {

    public static double simpleInterest(double principalAmount,int time,double interestRate){
        double SI= ((principalAmount*time*interestRate)/100);
        return SI;
    }
    public static double compoundInterest(double principalAmount,int time,double interestRate){
        double CI= (principalAmount*(Math.pow((1+interestRate/100), time)));
        return CI;
    }
}

public class Assignment1Q3 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

        System.out.println("Enter principle amount: ");
        double principalAmount = sc.nextDouble();
        System.out.println("Enter time: ");
        int time = sc.nextInt();
        System.out.println("Enter intrest rate: ");
        double interestRate = sc.nextDouble();

        System.out.println("Simple Intrest: "+SiCi.simpleInterest(principalAmount, time, interestRate));
        System.out.println("Simple Intrest: "+SiCi.compoundInterest(principalAmount, time, interestRate));

        }
    }
}
