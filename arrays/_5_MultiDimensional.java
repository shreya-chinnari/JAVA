import java.util.Arrays;

public class _5_MultiDimensional {
   public static void main(String[] args) {
       /*
      [
      [] 
      ]
        */

      /*
      
      1 2 3
      4 5 6
      7 8 9

       */

      // 1-D 
      int[] arr_1D = new int[4];
      
      // 2-D : int[row][col]
      int[][] arr_2D = new int[2][3];

      int[][] arr2 = {
         {1, 2, 3}, // [0]
         {4, 5, 6}, // [1]
         {7, 8} // [2]

      }; // array of arrays

      System.out.println("arr (2D) : " + Arrays.toString(arr2)); // wont work
      System.out.println("arr (2D) : " + Arrays.deepToString(arr2)); // will work
      System.err.println("\n arr2[1][0]: " + arr2[1][0]);
      System.err.println("\n arr2[0][0]: " + arr2[0][0]);

      // 3-D
      int[][][] arr_3D = new int[2][2][3];

      int[][][] arr3 = {
         { {1, 2, 3}, {4, 5} }, // Block 1
         { {7}, {10, 11, 12} } // Block 2
      }; // arrays of different sizes under arr3

      System.out.println("\n arr (3D) : " + Arrays.deepToString(arr3)); 




   }
}