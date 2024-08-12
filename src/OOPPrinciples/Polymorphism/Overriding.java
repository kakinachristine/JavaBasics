package OOPPrinciples.Polymorphism;

class Animal {
    public void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}




public class Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Animal reference and object
        Animal myDog = new Dog();        // Animal reference but Dog object

        myAnimal.sound();
        myDog.sound();  // Executes Dog's sound method
    }
}
