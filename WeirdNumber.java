class WeirdNumber {
public static void main (String [] args) {

int i;

for (i=0; i<=25; i++) {
if(i % 2 != 0){
System.out.println("Weird");
}
else if(i%2 == 0 && (i >= 2 || i <= 5)){
System.out.println ("Not Weird");
}
else if(i%2 == 0 && (i >= 6 || i <= 20)) {
System.out.println ("Weird");
}
else if(i%2 == 0 && i > 20) {
System.out.println ("Not Weird");
}
}
}
}