package Lesson05;

public class storozhuk_homework05 {
    public static void main(String[] args) {
        int older = 40;
        workers newOOO = new workers();
        System.out.println("Пример заполнения справочника двумя разными способами:\n");
        newOOO.add();
        newOOO.add("Ivanov", "Ivan", "Ivanovich", "worker", "ivanov@newfirm.com", "+380665432100", 20, 25000);
        newOOO.printAll();
        System.out.println("=========================\n\nДобавление максимального количества сотрудников:\n");
        newOOO.addMax();
        newOOO.printAll();
        System.out.println("=========================\n\nДобавление \"лишних\" сотрудника:\n");
        newOOO.add();
        newOOO.add("Ivanov", "Ivan", "Ivanovich", "worker", "ivanov@newfirm.com", "+380665432100", 20, 25000);
        System.out.println("=========================\n");
        newOOO.showOlder(older);
    }

}
