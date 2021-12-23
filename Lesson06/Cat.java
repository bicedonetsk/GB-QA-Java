package Lesson06;

public class Cat extends Animal{

    public static String typeName = "cat";
    public static int runLimit = 200;
    public static int swimLimit = 0;
    public static int countCats = 0;

    public Cat(String name) {
        super(typeName, name, runLimit, swimLimit);
        countCats++;
    }

    public Cat(String name, int runLimit, int swimLimit) {
        super(typeName, name, runLimit, swimLimit);
        countCats++;
    }
}
