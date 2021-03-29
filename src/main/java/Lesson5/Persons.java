package Lesson5;

public class Persons {
    Person[] data;
    int size;
    int capacity;

    public void Persons() {
        this.capacity = 100;
        this.size = 0;
        this.data = new Person[capacity];

    }
}
