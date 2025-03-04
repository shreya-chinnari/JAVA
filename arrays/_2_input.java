import java.util.Arrays;
import java.util.Scanner;

public class _2_input {
   public static void main(String[] args) {
       int[] arr = new int[3];
       arr[0] = 2;
       arr[1] = 5;
       arr[2] = 9;
       System.out.println(arr);  // [I@5ca881b5
       /*
      This won't print the array elements. Instead, it will print something like:

      [I@someHexCode
         
      This is because arrays in Java do not override toString(), and System.out.println(arr); prints the memory reference of the array.
       */

       System.out.println(Arrays.toString(arr)); // [2, 5, 9]
      

      // Using Loops


      System.err.println("num : arr");


      // enhanced 'for-each' loop- get individual item
      for (int num:arr) { // for every element of the array ,print the element
         System.out.println(num); // num - element of the array
      }

      Scanner in = new Scanner(System.in);
      int[] arr1 = new int[5];
      System.out.println("Enter 5 numbers:");
      for (int i=0; i<arr1.length; i++) {
         arr1[i] = in.nextInt();
      }
      System.out.println("You entered:");
        for (int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        
        
        // above - array of primitives, below - array of objects
        System.out.println("\n Enter 3 strings:");
        String[] str = new String[3];
        for (int i=0; i<str.length; i++) {
           str[i] = in.next();
           
         }
         System.err.println(Arrays.toString(str));
         
         in.close(); // close after all scanners
         /*

         i < str.length {NOT -- i <= str.length}
         
         Arrays in Java use zero-based indexing.

         str.length is 3, so valid indices are 0, 1, and 2.
         
         When i == 3, it tries to access str[3], which does not exist, causing an ArrayIndexOutOfBoundsException.
         */
         
      
   }
}
