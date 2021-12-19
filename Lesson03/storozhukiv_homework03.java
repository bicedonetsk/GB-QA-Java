package Lesson03_Storozhuk;

import java.util.Random;

public class storozhukiv_homework03 {
    public static Random random = new Random();

    public static void main(String[] args) {

//* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// * 1 С помощью цикла и условия заменить 0 на 1, 1 на 0;
// * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
// * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
// * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//* Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
// * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
// * 6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов;
// * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// * **Примеры:
// * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
// * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
// * checkBalance([1, 1, 1, 8, 1]) → false
// * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

    int[] iArayInt1 = new int[random.nextInt(25)+5];

    hwFillArrayRandom(iArayInt1, 1);
    hwPrintArray(iArayInt1, "1st before:\t\t", " ");
    System.out.println();

    hwConversion1(iArayInt1);
    hwPrintArray(iArayInt1, "1st after:\t\t", " ");
    System.out.println();

    int[] iArayInt2 = new int[100];
    hwFillArraySeries(iArayInt2,1);
    hwPrintArray( iArayInt2,"2nd array:\t\t", " ");
    System.out.println();

    int[] iArray3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
    hwPrintArray(iArray3,"3rd before:\t\t", "\t");
        System.out.println();
    hwIncreaseElement(iArray3,6,2);
    hwPrintArray(iArray3, "3rd after:\t\t", "\t");
        System.out.println();

    }



    public static void hwFillArrayRandom(int[] fillableArray, int elementBound) {
        for ( int i = 0; i < fillableArray.length; i++)
            fillableArray[i] = random.nextInt(elementBound+1);
    }

    public static void hwFillArraySeries(int[] fillableArray, int startElement) {
        for ( int i = 0; i < fillableArray.length; i++)
            fillableArray[i] = startElement+i;
    }

//    public  static void hwPrintArray(int[] printedArray) {
//        for (int i = 0; i < printedArray.length; i++)
//            System.out.print(printedArray[i] + " ");
//    }

    public  static void hwPrintArray(int[] printedArray, String arrayMsg) {
        System.out.print(arrayMsg);
        for (int i = 0; i < printedArray.length; i++){
            System.out.print(printedArray[i] + " ");
        }
    }
    public  static void hwPrintArray(int[] printedArray, String arrayMsg, String arraySeparator) {
        System.out.print(arrayMsg);
        for (int i = 0; i < printedArray.length; i++){
            System.out.print(printedArray[i] + arraySeparator);
        }
    }

    public static void hwConversion1 (int[] conversedArrray) {
        for (int i = 0; i < conversedArrray.length; i++) {
            if (conversedArrray[i] == 0) {
                conversedArrray[i] = 1;
            }
            else conversedArrray[i] = 0;
            // array[i] = (array[i] == 1) ? 0:1)
        }
    }

    public static void hwIncreaseElement (int[] increasedArray, int requiredElement, int multiplexor) {
        for (int i = 0; i < increasedArray.length; i++) {
            if (increasedArray[i] < requiredElement) {
                increasedArray[i] *= multiplexor;
            }
        }
    }
}
