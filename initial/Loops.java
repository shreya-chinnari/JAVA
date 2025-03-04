package initial;
import java.util.Scanner;


public class Loops {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number : ");
       int n = sc.nextInt();


      for (int i=1; i<=10; i++) {
         System.out.println(i + " * " + n + " = " + i*n);
       }

      int sum =0;
       for (int i=1; i<=n; i++) {
         sum=sum+i;
         System.out.println("Sum is : (inside loop)  "+sum);
       }
       System.out.println("Sum is : "+sum);


       sc.close(); // Close the Scanner to prevent resource leak
   }
}

/*
 for (int sum = 0; i=1; i<=n; i++) {
    sum = sum + i;
    System.out.println("Sum is : " + sum);
}

Problems:

   Initialization Issue:

      In the for loop, you declare and initialize sum (int sum = 0;) inside the loop.
      However, the variable i is not properly declared or initialized before use. It’s expected to be declared in the for loop, like int i = 1.

   Assignment Instead of Comparison (i = 1):

      The condition i = 1 is an assignment, not a comparison. In Java, = is used for assigning values, while == is used for comparison.
      This means i = 1 sets i to 1, and the condition always evaluates to true, leading to an infinite loop or unexpected behavior.

Error: cannot find symbol: variable i OR Type mismatch: cannot convert from int to boolean


 */