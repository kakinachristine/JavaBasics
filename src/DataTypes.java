//JAVA VARIABLES
//These are the Java variables:Local variables(they are defined within a block or method),
//                            instance variables(declared inside a class but outside any method,constructor or block.
//                            Created when an object of the class is created and destroyed when the object is destroyed)
//                            and static variables(declared just like instance. Created at the start of program
//                            and destroyed automatically when execution ends)

//For a variable you have to declare and initialize it
//Initializing variables: Datatype variableName = value;


//JAVA DATATYPES
//They are divided to two categories: Primitive datatypes- Boolean, char,int,short,byte,long,float and double
//                                    Non-primitive- String, array etc
//The data types include:
//                       - Boolean: boolean variableName;
//                       - Byte: byte variableName;
//                       - Short: short variableName;
//                       - Integer: int variableName;
//                       - Long: long variableName;
//                       - Float: float variableName;
//                       - Double: double variableName;
//                       - Char: char variableName;


public class DataTypes {
        public static void main(String[] args) {
            // Integer
            int number = 10;
            // Float
            double price = 19.99;
            // Single character
            char letter = 'A';
            // Boolean
            boolean isJavaFun = true;
            // String (sequence of characters)
            String message = "Hello";

            System.out.println("Integer: " + number);
            System.out.println("Double: " + price);
            System.out.println("Single character: " + letter);
            System.out.println("Boolean: " + isJavaFun);
            System.out.println("String: " + message);
        }

}
