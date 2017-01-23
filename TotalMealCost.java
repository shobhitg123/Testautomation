import java.util.Scanner;
class TotalMealCost {
public static void main (String [] args) {

Scanner a = new Scanner(System.in);
System.out.println( "Enter the MealCost=" );
int MealCost = a.nextInt();
System.out.println ("Enter the Tip=");
double Tip = a.nextDouble();
System.out.println("Enter the Tax=");
double Tax = a.nextDouble();
double TotalCost = MealCost+(MealCost*Tip/100)+(MealCost*Tax/100);
System.out.println("Total Price of Meal="+TotalCost); 
}
}



