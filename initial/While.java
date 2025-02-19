package initial;
import java.util.Scanner;

public class While {
   public static void main(String[] args) {
       int i=0;
       while(i<5) {
         System.out.println(i);
         i++;
      }


      Scanner sc = new Scanner(System.in);
      boolean doYouLoveMe = false;

      while(!doYouLoveMe) {
         System.out.println("Do you love me?  ");
         doYouLoveMe = sc.nextBoolean();
      }
   }
}

/*

end up in an infinite loop - 
because i<5 always when i=0


   public static void main(String[] args) {
       int i=0;
       while(i<5) {
         System.out.println(i);

   }
   
*/

/*

        Scanner sc = new Scanner(System.in);
      boolean isGood = true;

      while(!isGood) {
         System.out.println("Enter your review: ");
         isGood = sc.nextBoolean();
      }


Problem :
The while loop will not terminate because the condition is always false! so the loop never executes.
while (!isGood) { } --- // The condition is initially false because isGood = true

Since the loop body doesn't run, the program skips the System.out.println and the sc.nextBoolean() call entirely.
    




IF WE INITIALISE :  isGood = true


   boolean isGood = true; // Initialized as true

   while (isGood) {                  // This will keep running as long as isGood is true
   System.out.println("Enter your review: ");
   isGood = sc.nextBoolean(); 
}

Initially, isGood is true, so the loop will start running.
The loop will keep running as long as the user keeps entering true.
If the user enters false, isGood will become false, and the loop will terminate.
While this might work if the logic is intended, the behavior is reversed from what you probably want:

The loop starts immediately, asking for input.
It stops when the user enters false.
If that's the desired behavior (e.g., keep asking for input until false is entered), then this approach is valid.

*/