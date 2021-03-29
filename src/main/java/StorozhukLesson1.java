public class StorozhukLesson1 {
    public static void main(String[] args) {
        /*

        System.out.println("Storozhuk Ivan homework for lesson 1");

        // tasks 1
        //1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
        //
        // tasks 2
        //2. Создать переменные всех пройденных типов данных и инициализировать их значения.


        //числовые переменные
        byte byteVal1 = 50;
        short shortVal1 =  -35;
        int intVal1 = 100_500;
        long longVal1 = 100_500_000;
        float floatVal1 = 0.5F;
        double doubleVal1 = 0.5;

        //логическая переменная
        boolean booleanVal1 = true;

        //буквенно-строковые
        char charVal = 'Y';
        String stringVal1 = "Punks not dead!;";

        // tasks 3
        floatVal1 = task3();
        System.out.println(floatVal1);

        // task 4
        booleanVal1 = task4(byteVal1, shortVal1);
        System.out.println(booleanVal1);

        // task 5
        task5(byteVal1);
        task5(shortVal1);
        task5(0);

        // task 6
        System.out.println(task6(intVal1));
        System.out.println(task6(shortVal1));
        System.out.println(task6(0));

        // tsak 7
        task7("BigBoss");
        */
    }

    /*

    public static float task3 () {
        // tasks 3
        //3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //      где a, b, c, d – аргументы этого метода, имеющие тип float.
        //
        float floatValA = 1.5f;
        float floatValB = 1.2f;
        float floatValC = 0.9f;
        float floatValD = 0.5F;

        return (floatValA * (floatValB + (floatValC/floatValD)));
    };

    public static boolean task4 (int intInVal1, int intInVal2) {
        // task 4
        //4. Написать метод, принимающий на вход два целых числа и проверяющий,
        //что их сумма лежит в пределах от 10 до 20 (включительно),
        //если да – вернуть true, в противном случае – false.
        //
        boolean boolOutVal1 = false;

        if ((intInVal1 + intInVal2) >= 10) {
            if ((intInVal1 + intInVal2) <= 20) {
                boolOutVal1 = true;
            }
        }
        return (boolOutVal1);
    };

    public static void task5 (int intInVal1) {
        // task 5
        //5. Написать метод, которому в качестве параметра передается целое число,
        //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        //Замечание: ноль считаем положительным числом.
        //
        if (intInVal1 >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean task6 (int intInVal2) {
        // task 6
        //6. Написать метод, которому в качестве параметра передается целое число.
        //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        //
        return  (intInVal2 > 0);
    }

    public static void task7 (String strInVal1) {
        // task 7
        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        //
        System.out.println("«Привет, " + strInVal1 + "!»");
    }

     */
}
