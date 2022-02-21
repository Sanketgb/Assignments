

class ArmstrongNumBetweenRange {

    static void armstrongNumBetweenRange(int min, int max) {
        int mini=min;
        int maxi=max;

        for (int i = mini; i <= maxi; i++)
        {
            int n= i, x=0, y;
            while (n != 0)
            {
                y = n % 10;
                x+= y * y * y;
                n = n/10;
            } 
            if( x ==i ) 
            {
                System.out.print(i + " ");
            }
        }   
    }
}

public class Assignment1Q2{
    public static void main(String[] args) {

        int min=100, max=999;

        ArmstrongNumBetweenRange.armstrongNumBetweenRange(min, max);
               
    }
}

