// Base Animal class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Dog class inheriting from Animal
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

// Cat class inheriting from Animal
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

// Bird class inheriting from Animal
class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}

public class ANIMALKINGDOM {
    public static void main(String[] args) {
        // Create an array of Animal objects (polymorphism)
        Animal[] animals = {
            new Dog("Buddy"),
            new Cat("Whiskers"),
            new Bird("Tweety")
        };

        // Demonstrating polymorphism
        for (Animal animal : animals) {
            animal.makeSound(); 
        }
    }
}
