package OOPPrinciples;

// Superclass
class AnimalOne {
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

// Subclass
class DogOne extends AnimalOne {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}
public class Inheritance {

    public static void main(String[] args) {
        DogOne myDogOne = new DogOne();
        myDogOne.eat();  // Method from superclass
        myDogOne.bark(); // Method from subclass
    }
}
