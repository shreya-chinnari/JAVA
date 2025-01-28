import java.util.Scanner;

public class Switch {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: (between 1,2,3)");

      int num = sc.nextInt();

      switch (num) {
         case 1:
         System.out.println("You entered 1");
         break;
         case 2:
         System.out.println("You entered 2");
         break;
         case 3:
         System.out.println("You entered 3");

         break;
        default: 
        System.out.println("You entered something else");
      }
            sc.close();
   }
}
