import java.util.Scanner;
import java.lang.Math;
class PrimeFactor {

public static void main (String [] args) {

Scanner s = new Scanner(System.in);
int Input = s.nextInt();
System.out.println("Enter Your input:"+Input);

        
        while (Input%2==0)
        {
            System.out.print(2 + " ");
            Input /= 2;
        }
 
        
        for (int i = 3; i <= Math.sqrt(Input); i+= 2)
        {
            
            while (Input%i == 0)
            {
                System.out.print(i + " ");
                Input /= i;
            }
        }
 
        
        if (Input > 2){
            System.out.print(Input);
    }
}
}