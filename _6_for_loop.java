import java.util.Scanner;
// Scanner cannot be resolved to a type - {if we dont import this}


public class _6_for_loop {
   public static void main(String[] args) {
      /*
       For :
         for (initialistion; condition; increment/decrement) {
            //body
         }
       */
      for (int num=1; num<=5; num+=1) {

         System.out.println(num);
      }

      for (int num=1; num<=5; num++) {

         System.out.println(num);
      }

      Scanner in = new Scanner(System.in) ;
         int n = in.nextInt();
         

         for (int N=1; N<=n; N++) {
            System.out.println("numbers for loop:" + N + "");
         }
         
         for (int N=1; N<=n; N++) {
            System.out.println("Yolololo");
         }
      
   }
}
