package Lessons02_Storozhuk;

public class storozhuk_homework {
    public static void main(String[] args) {

//part 1
//1. Написать метод, принимающий на вход два целых числа и проверяющий,
//что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//в противном случае – false.
        int var_a = 1;
        int var_b = 9;
        System.out.print("a = " + var_a);
        System.out.print(", b = " + var_b);
        System.out.print(", result = " + (var_a+var_b) );
        System.out.println(", metod return = " + Check_interval(var_a, var_b));
        var_a = 2;
        var_b = 9;
        System.out.print("a = " + var_a);
        System.out.print(", b = " + var_b);
        System.out.print(", result = " + (var_a+var_b) );
        System.out.println(", metod return = " + Check_interval(var_a, var_b));
        var_a = 11;
        var_b = 9;
        System.out.print("a = " + var_a);
        System.out.print(", b = " + var_b);
        System.out.print(", result = " + (var_a+var_b) );
        System.out.println(", metod return = " + Check_interval(var_a, var_b));
        var_a = 12;
        var_b = 9;
        System.out.print("a = " + var_a);
        System.out.print(", b = " + var_b);
        System.out.print(", result = " + (var_a+var_b) );
        System.out.println(", metod return = " + Check_interval(var_a, var_b));
        System.out.println("********** ***** *");

//part2
//2. Написать метод, которому в качестве параметра передается целое число,
//метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//Замечание: ноль считаем положительным числом.
        Print_positive(var_a);
        Print_positive(var_a * -1);
        Print_positive(0);
        System.out.println("********** ***** *");

//part 3
//3. Написать метод, которому в качестве параметра передается целое число.
//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        var_a = -1;
        System.out.print("value = " + var_a);
        System.out.println(", metod return = " + Check_positive(var_a));
        var_a = 0;
        System.out.print("value = " + var_a);
        System.out.println(", metod return = " + Check_positive(var_a));
        var_a = 1;
        System.out.print("value = " + var_a);
        System.out.println(", metod return = " + Check_positive(var_a));
        System.out.println("********** ***** *");

//part 4
//4. Написать метод, которому в качестве аргументов передается строка и число,
//метод должен отпечатать в консоль указанную строку, указанное количество раз;
        String str_val = "аааааа не успеваю";
        var_a = 0;
        System.out.println("run1");
        Repeat_string(str_val, var_a);
        var_a = 1;
        System.out.println("run2");
        Repeat_string(str_val, var_a);
        var_a = 3;
        System.out.println("run3");
        Repeat_string(str_val, var_a);
        System.out.println("********** ***** *");

//part 5
//5.* Написать метод, который определяет, является ли год високосным,
//и возвращает boolean (високосный - true, не високосный - false).
//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    }

    private static boolean Check_interval(int ch_int_a, int ch_int_b) {
        return ( (ch_int_a + ch_int_b) >10 && ( (ch_int_a + ch_int_b) <=20) );
    }

    private static void Print_positive(int ch_pos_val) {
        System.out.print(ch_pos_val + " ");
        if ( ch_pos_val >= 0)
            System.out.println("положительно");
        else System.out.println("отрицательное");
    }

    private static boolean Check_positive(int ch_pos_val) {
        return ( ch_pos_val < 0);
    }

    private static void Repeat_string(String print_value, int repeat_value){
        for (int i=0; i < repeat_value; i++)
            System.out.println(print_value);
            System.out.println(print_value);
    }
}
