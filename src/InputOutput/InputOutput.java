//JAVA INPUT/ 0UTPUT

//These are the types of Java I/O Streams:
// BYTE STREAMS :Used for handling raw binary data.
//              Classes: "InputStream" and "OutputStream".

// CHARACTER STREAMS: Used for handling character data (text).
//              Classes: "Reader" and "Writer".

// BUFFERED STREAMS: Used for more efficient input and output by buffering data.
//              Classes: "BufferedReader", "BufferedWriter", "BufferedInputStream",
//              "BufferedOutputStream".

// STANDARD I/O: System.in: Standard input stream (usually the keyboard).
//               System.out: Standard output stream (usually the console).
//               System.err: Standard error stream.






package InputOutput;
import java.util.Scanner;



public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
