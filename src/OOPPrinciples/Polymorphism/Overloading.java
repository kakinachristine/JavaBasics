package OOPPrinciples.Polymorphism;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading {

    public static void main(String[] args) {
            MathOperations math = new MathOperations();
            System.out.println("Sum of two numbers: " + math.add(5, 10));
            System.out.println("Sum of three numbers: " + math.add(5, 10, 15));
        }

}
