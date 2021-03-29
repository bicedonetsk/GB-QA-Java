package Lesson5;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String telephone;
    private short age;
    int salary;

    public Person() {
        this.surname = "Ivanov";
        this.name = "Ivan";
        this.patronymic = "Ivanovich";
        this.position = "worker";
        this.email = "worker@compname.com";
        this.telephone = "5001";
        this.age = 30;
        this.salary = 25000;
    }
}
