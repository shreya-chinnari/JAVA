import java.util.Scanner;

// STRINGS are immutable in JAVA
// ARRAYS are mutable on JAVA

public class _4_functions {
   public static void main(String[] args) {


      Scanner in = new Scanner(System.in);

      int[] arr1 = new int[3];
      System.out.println("Enter 3 numbers:");

      for (int i=0; i<arr1.length; i++) {
         arr1[i] = in.nextInt();
      }


        System.out.println("You entered:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

      change(arr1);

      System.out.println("\nAfter change:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

      in.close();
   }

      static void change(int[] arr_change) { // after bracket close of above function
         arr_change[0] = 100;
      }
}
