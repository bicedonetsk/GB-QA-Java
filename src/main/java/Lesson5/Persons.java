package Lesson5;

public class Persons {
    private Person[] data;
    private int size;
    private final int capacity = 5;

    private static final String[] surnames = {"Иванов", "Петров", "Сидров", "Смирнов", "Кузнецов", "Попов", "Морозов", "Козлов", "Фёдоров", "Тарасов"};
    private static final String[] surnamesForMail = {"ivanov", "petrov", "sidrov", "smirnov", "kuznetcov", "popov", "morozov", "kozlov", "fedorov", "tarasov"};
    private static final String[] names = {"Иван", "Петр", "Артём", "Александр", "Алексей", "Михаил", "Андрей", "Роман", "Сергей"};
    private static final String[] namesForMail = {"i", "p", "a", "a", "a", "m", "a", "r", "s"};
    private static final String[] patronymics = {"Иванович", "Петрович", "Виссарионович", "Алексеевич", "Александрович", "Михаилович", "Андрееевич", "Романович", "Сергеевич"};
    private static final String[] patronymicsForMAil = {"i", "p", "v", "a", "a", "m", "a", "r", "s"};
    private static final String[] positions = {"инженер", "нахлебник"};
    private static final String compname = "firmname";

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
            addRandom();
            size++;
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
            size++;
        }
        else System.out.println("Нет места в справочнике для сотрудника!\n");
    }

    public void addMax() {
        for (int i = size; i <= capacity; i++) {
            addRandom();
            size = i;
        }
    }

    public void addRandom() {
        int randSurnames = (int) (Math.random() * surnames.length);
        int randNames = (int) (Math.random() * names.length);
        int randPatronymics = (int) (Math.random() * patronymics.length);
        String phoneNumber = "+79";
        String s = "0123456789";
        for (int i = 0; i < 10; i++) {
            phoneNumber = phoneNumber + s.charAt((int) (Math.random() * 10));
        }

        data[size].setSurname(surnames[randSurnames]);
        data[size].setName(names[randNames]);
        data[size].setPatronymic(patronymics[randPatronymics]);
        data[size].setPosition(positions[(int) (Math.random()+0.2)]);
        data[size].setEmail(surnamesForMail[randSurnames]+"."+namesForMail[randNames]+patronymicsForMAil[randPatronymics]+"@" + compname + ".com");
        data[size].setTelephone(phoneNumber);
        data[size].setAge(20 + (int) (Math.random() * 45));
        data[size].setSalary(15000 + (Math.abs((int) (Math.random()*85)) *1000));
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
