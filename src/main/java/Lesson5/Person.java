package Lesson5;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String telephone;
    private int age;
    private int salary;
    private static final String[] surnames = {"Иванов", "Петров", "Сидров", "Смирнов", "Кузнецов", "Попов", "Морозов", "Козлов", "Фёдоров", "Тарасов"};
    private static final String[] surnamesForMail = {"ivanov", "petrov", "sidrov", "smirnov", "kuznetcov", "popov", "morozov", "kozlov", "fedorov", "tarasov"};
    private static final String[] names = {"Иван", "Петр", "Артём", "Александр", "Алексей", "Михаил", "Андрей", "Роман", "Сергей"};
    private static final String[] namesForMail = {"i", "p", "a", "a", "a", "m", "a", "r", "s"};
    private static final String[] patronymics = {"Иванович", "Петрович", "Виссарионович", "Алексеевич", "Александрович", "Михаилович", "Андрееевич", "Романович", "Сергеевич"};
    private static final String[] patronymicsForMAil = {"i", "p", "v", "a", "a", "m", "a", "r", "s"};
    private static final String[] positions = {"инженер", "нахлебник"};
    private static final String compname = "firmname";

    public Person() {
        this.surname = "";
        this.name = "";
        this.patronymic = "";
        this.position = "";
        this.email = "";
        this.telephone = "";
        this.age = 0;
        this.salary = 0;
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

        this.surname = surnames[randSurnames];
        this.name = names[randNames];
        this.patronymic = patronymics[randPatronymics];
        this.position = positions[(int) (Math.random()+0.2)];
        this.email = surnamesForMail[randSurnames]+"."+namesForMail[randNames]+patronymicsForMAil[randPatronymics]+"@" + compname + ".com";
        this.telephone = phoneNumber;
        this.age = 20 + (int) (Math.random() * 45);
        this.salary = 15000 + (Math.abs((int) (Math.random()*85)) *1000);
    }

    public void print() {
        String years = "";
        switch (this.getAge() % 10) {
             case 1 :
                 years = "год";
                 break;
             case 2 :
             case 3 :
             case 4 :
                 years = "года";
                 break;
             default: years = "лет";
        }
        System.out.println("ФИО: " + this.getSurname() + " " + this.getName() + " " + this.getPatronymic() + " (" + this.getAge() + " " + years + ")");
        System.out.println("Должность: " + this.getPosition() + ", оклад: " + this.getSalary());
        System.out.println("Контактные данные: " + this.getTelephone() + ", " + this.getEmail());
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
