public class _1_array {
   public static void main(String[] args) {

       // dataType[] variableName = new dataType[size];

       int[] arr = new int[4]; // The array has 4 elements.
       System.out.println("array length: " + arr.length);  // Output: 4

       // or directly
       int[] arr1 = {1,2,3,4,5,6,7};

       int[] varName; // declaration, defined, currently not pointing to anything, this is a reference variable

       varName = new int[3]; //initialisation: object is being created in the memory(heap memory)

       
        /*
        When you declare and initialize an array in Java, the process involves two main steps:

            Declaration (Compile-Time)
            Memory Allocation & Initialization (Run-Time)

        
        */

        /*
        1. Array Objets (any Object) are in Heap
        2. Heap Objects are NOT continuous (in C++/C - continuous memory allocation because of pointers)
        3. Array Objects are continuous in memory (because of index) : definition
            But in JAVA, arrays may not be continuous, it depends on JVM

        4. Dynamic Memory Allocation - Dynamic memory allocation means that memory is allocated at runtime rather than at compile-time. This is useful when the exact size of data structures (like arrays, objects, and collections) is unknown before execution.
         */

        System.err.println("arr1[0]: " + arr1[0]); // index

        int[] no_value = new int[5];
        System.out.println("no_value[0]: "  + no_value[0]); // Output: 0
        System.out.println("no_value[1]: "  + no_value[1]); // Output: 0
        System.out.println("no_value[2]: "  + no_value[2]); // Output: 0

        String[] no_value_string = new String[5];
        System.err.println("no_value_string[3]: " + no_value_string[3]); //Output: null

        // null - a literal, not a data-type

        String str = null; 
        System.out.println("str: " + str);
        // int num = null; //error

        /*In Java, null is a special literal that represents the absence of a reference to an object. It can only be assigned to reference variables, not primitive types. It is by-default value for reference values.
         * 
         * int[] refVar;
        */


        /* primitives are stored in STACKS - int,char,float,boolean - can not be broken down
         * objects, classes, arrays, string - stored in HEAPS
         */ 


        /*
         * public static void main(String[] args) --- args : string array
         */
   }
}
