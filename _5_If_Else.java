public class _5_If_Else{


public static void main(String[] args) {
   /*
    
    Syntax : 
      if(boolean expression T/F) {
         // body
      } else { 
      
      }

    */
   int salary = 10000;

    if (salary < 10000) {
      salary += 2000;
    } else {
      salary += 1000;
    }

    System.out.println(salary);
}
}