package Lesson06;

public class Dog extends Animal{

    public static String typeName = "dog";
    public static int runLimit = 500;
    public static int swimLimit = 10;
    public static int countDogs = 0;

    public Dog(String name) {
        super(typeName, name, runLimit, swimLimit);
        countDogs++;
    }

    public Dog(String name, int runLimit, int swimLimit) {
        super(typeName, name, runLimit, swimLimit);
        countDogs++;
    }
}
