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

        public void print() {
        String years = "";
        switch (this.getAge() % 10) {
             case 1 : years = "год"; break;
             case 2 :
             case 3 :
             case 4 : years = "года"; break;
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
