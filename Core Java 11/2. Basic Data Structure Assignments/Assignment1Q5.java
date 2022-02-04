import java.util.Scanner;

class TaxAmount{
    public static double calculateTaxAmount(int ctc){

        double amount;
        if (ctc <= 180000) {
            amount = 0.00;
        } else if (ctc > 180000 && ctc <= 300000) {
            amount = (ctc*10)/100 ;
        } else if (ctc > 300000 && ctc <= 500000) {
            amount = (ctc*20)/100;
        } else {
            amount = (ctc*30)/100;
        }
        return amount;
    }
}


public class Assignment1Q5 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter income: ");
            int income = sc.nextInt();

            System.out.println("Taxable amount"+(TaxAmount.calculateTaxAmount(income)));
    
        }
    }     
}
