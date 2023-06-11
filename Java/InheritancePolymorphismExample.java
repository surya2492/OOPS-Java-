class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks");
    }
    
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("The cat meows");
    }
}

public class InheritancePolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound();  // The animal makes a sound
        dog.makeSound();     // The dog barks
        cat.makeSound();     // The cat meows

        // Polymorphism
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();  // The dog barks
        animal2.makeSound();  // The cat meows
    }
}