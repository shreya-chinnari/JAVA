package initial;
public class DoWhile {
   public static void main(String[] args) {
       int i =10;

       do { 
         System.out.println(i);
         i++;
       } while(i<=4);

       System.out.println("out of loop");
/* The initial value of i is 10.
The do block executes first (because the condition is checked only after execution).
Output: 10
After the first execution, i is incremented to 11.
The condition i <= 4 is now false, so the loop terminates. 

This loop executes once because of the do-while structure, even though the condition is false. */


       do { 
         System.out.println(i);
         i++;
       } while(i>=4 && i<=10);

       System.out.println("out of loop");
/* By the time this loop starts, i = 11 (from the previous loop).
The do block executes first:
Output: 11
After execution, i is incremented to 12.
The condition i >= 4 && i <= 10 is evaluated:
i >= 4 is true, but i <= 10 is false.
The combined condition is false, so the loop terminates. 

This loop also executes once, but the condition becomes false after the first iteration, so it stops.*/


       do { 
         System.out.println(i);
         i++;
       } while(i>=4 && i<=20);

       System.out.println("out of loop");
   }
}
