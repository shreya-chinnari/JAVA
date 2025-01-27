public class TernaryOp {
   public static void main(String[] args) {
       int a = 20;
       int b = 30;
       int c = 50;

       int max;

       // ternary operator
       max = a>b ? a>c ? a:c: b>c ? b:c ;


// a > b ? (a > c ? a : c) : (b > c ? b : c);
// First, it checks if a > b. --- a > b ? (__):(__)
// If true, it compares a and c to find the larger of the two. --- (a > c ? a : c)
// If false, it compares b and c to find the larger of those. ---  (b > c ? b : c)


       System.out.println("Max: " + max);
   }
   
}
