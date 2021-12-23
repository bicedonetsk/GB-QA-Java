package Lesson06;

public class storozhuk_homework06 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik");
        Dog dog1 = new Dog("Tuzik");
        System.out.println("Animals: " + Animal.countAnimals + ", cats: " + Cat.countCats + ", dogs: " + Dog.countDogs);

        cat1.run(-1);
        cat1.run(0);
        cat1.run(1);
        cat1.run(199);
        cat1.run(200);
        cat1.run(201);
        cat1.swim(-1);
        cat1.swim(0);
        cat1.swim(1);

        dog1.run(-1);
        dog1.run(0);
        dog1.run(1);
        dog1.run(499);
        dog1.run(500);
        dog1.run(501);
        dog1.swim(-1);
        dog1.swim(0);
        dog1.swim(1);
        dog1.swim(9);
        dog1.swim(10);
        dog1.swim(11);
    }

}
