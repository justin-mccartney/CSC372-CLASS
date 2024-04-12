public class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

// In Main ...
/*
    Dog dog = new Dog();
    dog.eat(); ... OUTPUT: "Animal is eating."
    dog.bark(); ... OUTPUT: "The dog is barking."
*/