package Lesson06;

public abstract class Animal {

    public String typeName;
    public String name;
    public int runLimit;
    public int swimLimit;
    public static int countAnimals = 0;

    public Animal(String typename, String name, int runLimit, int swimLimit) {
        this.typeName = typename;
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        countAnimals++;
    }

    public void run (int runDistance) {
        if (runDistance > 0) {
            if (this.runLimit >= runDistance) {
                System.out.println(this.typeName + " " + this.name + " ran " + runDistance + " m");
            } else {
                System.out.println(this.typeName + " " + this.name + " does not have the strength to run so much (" + runDistance + " m) !");
            }
        }
    }

    public void swim (int swimDistance) {
        if (swimDistance > 0) {
            if (this.swimLimit > 0) {
                if (this.swimLimit >= swimDistance) {
                    System.out.println(this.typeName + " " + this.name + " swam  " + swimDistance + " m");
                } else {
                    System.out.println(this.typeName + " " + this.name + " no strength to swim like that (" + swimDistance + " m) !");
                }
            } else {
                System.out.println(this.typeName + " is afraid of water and does not swim anywhere !");
            }
        }
    }

}
