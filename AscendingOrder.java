import java.util.Scanner;
class AscendingOrder {
public static void main (String [] args) {
int temp;

Scanner n = new Scanner(System.in);

System.out.println("Enter the Number of Element in Array:");
int j = n.nextInt();

int p[] = new int [j];

System.out.println("Enter the value in Array:");

for (int i = 0; i < j; i++) {
p[i] = n.nextInt();
}
for (int i = 0; i < j; i++) {
for (int k = i+1; k < j; k++) {
if (p[i] > p[k])
{
temp = p[i];
p[i] = p[k];
p[k] = temp;
}
}
}
System.out.println("Ascending Order of Array");

for (int i = 0; i < j-1; i++) {
System.out.print(p[i]+",");
}
{
System.out.println(p[j-1]);
}  
}
}