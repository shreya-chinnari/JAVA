import java.util.Arrays;
import java.util.Scanner;


public class _6_ip_op {
   public static void main(String[] args) {
       // TAKING input and GIVING ouput for multidimensional array
      Scanner in = new Scanner(System.in);



      int[][] arr = new int[3][2];

      // input

      System.err.println("Enter elemenets: \n");

      // Loop through rows
      for (int row=0; row<arr.length; row++){
         // Loop through columns
         for(int col=0; col<arr[row].length; col++) { // The inner loop (col) iterates over columns of each row.
            arr[row][col] = in.nextInt();
         }
      }

      
      // Output
      
      System.out.println("The 2D array is: ");
      for (int row = 0; row < arr.length; row++) {
         for (int col = 0; col < arr[row].length; col++) {
            
            System.out.print(arr[row][col] + " "); // Print each element
         }
         System.out.println(); // Move to the next line after each row (\n)
      }
      /*
         The 2D array is: 
            1 1
            1 1
            1 1
      */
      in.close();

      // alternate
      System.out.println("Arrays.toString: ");
      for (int row=0; row<arr.length; row++) {
         // System.out.println("Arrays.toString: " + Arrays.toString(arr[row]));

         System.out.println(Arrays.toString(arr[row]));
      }
      /*
      Arrays.toString:
      [1, 1]
      [1, 1]
      [1, 1] */
   }
}
