package OOPPrinciples;

//Encapsulation is the concept of bundling data (variables) and methods (functions)
// that operate on the data into a single unit or class.

//NB: each public class must be declared in its own file


public class Encapsulation {


    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020);
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        // Update the year
        myCar.setYear(2021);
        System.out.println("Updated Year: " + myCar.getYear());
    }
}
