import java.util.Arrays;
import java.util.Scanner;

public class _3_strings {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("\n Enter 3 strings:");
        String[] str = new String[3];
        for (int i=0; i<str.length; i++) {
           str[i] = in.next();
           
         }
         System.err.println(Arrays.toString(str)); // [aa, bb, cc]
         
         in.close();

         str[1] = "sachi";
         System.err.println(Arrays.toString(str)); // [aa, sachi, cc]


   }
}
