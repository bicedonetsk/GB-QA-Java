package Lesson5;

public class Persons {
    private Person[] data;
    private int size;
    private final int capacity = 5;

    public Persons() {
        size = 0;
        data = new Person[capacity];
        for (int i = 0; i < capacity; i++)
            data[i] = new Person();
    }


    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println("сотрудник " + (i+1) + "й из " + size);
            data[i].print();
            if (i < (size-1)) System.out.println("-------------------------");
        }
    }

    public void add() {
        if (size < capacity) {
            data[size].addRandom();
            this.size++;
        }
        else System.out.println("Нет места в справочнике для рандомного сотрудника!\n");
    }

    public void add(String surname, String name, String patronymic, String position, String email, String telephone, int age, int salary) {
        if (size < capacity) {
            data[size].setSurname(surname);
            data[size].setName(name);
            data[size].setPatronymic(patronymic);
            data[size].setPosition(position);
            data[size].setEmail(email);
            data[size].setTelephone(telephone);
            data[size].setAge(age);
            data[size].setSalary(salary);
            this.size++;

        }
        else System.out.println("Нет места в справочнике для сотрудника!\n");
    }

    public void addMax() {
        for (int i = size; i < capacity; i++) {
            data[i].addRandom();
            this.size = capacity;
        }
    }

    public void showOlder(int value) {
        int counter = 0;
        System.out.println("Сотрудники старше " + value + " лет:\n");
        for (int i = 0; i < size; i++) {
            if (data[i].getAge() >= value) {
                System.out.println("сотрудник " + (i + 1));
                data[i].print();
                if (i < (size-1)) System.out.println("-------------------------");
                counter++;
            }
        }
        if (counter == 0) System.out.println("-нет-");
    }

}
