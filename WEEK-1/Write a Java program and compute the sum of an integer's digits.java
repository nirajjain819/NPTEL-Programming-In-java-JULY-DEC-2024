import java.util.Scanner;
public class W01_P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input an integer
        //System.out.print("Input an integer: ");

        // Read the integer from the user
        long n = input.nextLong();

        // Calculate and display the sum of the digits
        System.out.print("The sum of the digits is: " + sumDigits(n));
    }
// Calculate the sum of the digits by defining a sumDigits() function
// This should return the 
static long sum=0;
static long sumDigits(long n){
  while(n>0){
  long ld=n%10;
  	sum+=ld;
  	n/=10;
  }
  return sum;
}
}