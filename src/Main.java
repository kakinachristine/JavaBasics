//JAVA BASICS

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}


// Explanation for the java basic syntax:

//Main - this is the class name which is usually the same as file name
//public class Main - Declares a class named Main. And this defines the accessibility of the variables
//                        We have four ways: Public, Private,Protected and Default
//public static void main(String[] args): The main method is the entry point of the program.
//System.out.printf("Hello and welcome!"); and System.out.println("i = " + i); Prints the details to the console.
//The rest is a control flow