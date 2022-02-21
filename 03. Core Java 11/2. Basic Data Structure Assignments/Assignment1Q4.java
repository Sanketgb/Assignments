import java.util.Scanner;

class ResultDeclaration{
    public static String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {

        double S1M=subject1Marks;
        double S2M=subject2Marks;
        double S3M=subject3Marks;
        
        if(S1M>=60.0 && S2M>=60.0 && S3M>=60.0)
        return "Passed";
        else if ((S1M>=60.0 && S2M>=60.0 && S3M<=60 )||(S1M>=60.0 && S2M<=60.0 && S3M>=60.0)||(S1M<=60.0 && S2M>=60.0 && S3M>=60.0))
        return "Promoted";
        else
        return "Failed";

    }
}


public class Assignment1Q4 {
    public static void main(String[] args) {

        try(Scanner sc= new Scanner(System.in)){
            
        System.out.println("Enter Marks in subject 1: ");
        double subject1Marks =sc.nextDouble();
        System.out.println("Enter Marks in subject 2: ");
        double subject2Marks =sc.nextDouble();
        System.out.println("Enter Marks in subject 3: ");
        double subject3Marks =sc.nextDouble();

        System.out.println( ResultDeclaration.declareResults(subject1Marks, subject2Marks, subject3Marks));

        }
    }
}
