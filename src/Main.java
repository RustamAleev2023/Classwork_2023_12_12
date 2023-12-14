import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
        task12();

    }

    //Task1
    public static void task1() {
        int[] arr = new int[10];
        int index = 0;

        for (int i = 2; i <= 20; i += 2) {
            arr[index] = i;
            index++;
        }

        //вывод в строку
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //вывод в столбик
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\n");
        }
    }

    //Task2
    public static void task2() {
        int[] arr = new int[50];
        int index = 0;

        for (int i = 1; i <= 99; i += 2) {
            arr[index] = i;
            index++;
        }
        //вывод в строку
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //вывод реверса
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    //Task3
    public static void task3() {
        Random random = new Random();
        int[] arr = new int[15];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(9);
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("В массиве " + count + " четных чисел.");
    }

    //Task4
    public static void task4() {
        Random random = new Random();
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 9);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task5
    public static void task5() {
        Random random = new Random();
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(5);
            arr2[i] = random.nextInt(5);
            sum1 += arr1[i];
            sum2 += arr2[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int difference = (sum1 / arr1.length) - (sum2 / arr2.length);
        if (difference > 0) {
            System.out.println("Cреднее арифметическое массива arr1 больше");
        } else if (difference < 0) {
            System.out.println("Cреднее арифметическое массива arr2 больше");
        } else {
            System.out.println("Cредние арифметические обоих массивов равны");
        }
    }

    //Task6
    public static void task6() {
        Random random = new Random();
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 99);
        }
//        arr = new int[]{1, 2, 3, 4};
        boolean[] isGrow = new boolean[3];
        int index = 0;

        System.out.println(Arrays.toString(arr));

        boolean result;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                isGrow[index] = true;
            } else {
                isGrow[index] = false;
            }
            index++;
        }
        result = isGrow[0] && isGrow[1] && isGrow[2];
        if (result) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }

    //Task7
    public static void task7() {
        int maxLimit = 1_000_000;
        int a = 0;
        int b = 1;
        int c;

        int[] arr = new int[20];
        int index = 0;
        int count = 0;

        while (a <= maxLimit && count < 20) {
            if (a > 0) {
                arr[index] = a;
                c = a + b;
                a = b;
                b = c;
                count++;
                index++;
            } else a++;

        }
        System.out.println(Arrays.toString(arr));
    }

    //Task8
    public static void task8() {
        Random random = new Random();
        int[] arr = new int[12];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-15, 15);
        }
        System.out.println(Arrays.toString(arr));
        int index = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Индекс максимального элемента равен " + index);
    }

    public static void task9() {
        Random random = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(1, 9);
            arr2[i] = random.nextInt(1, 9);
        }

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (double) arr1[i] / arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        int count = 0;

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 1 == 0 && arr3[i] != 0) {
                count++;
            }
        }
        System.out.println("Кол-во целых элементов в третьем массиве = " + count);
    }

    //Task10
    public static void task10() {
        Random random = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(1, 9);
            arr2[i] = random.nextInt(1, 9);
        }

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (double) arr1[i] / arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        int count = 0;

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 1 == 0 && arr3[i] != 0) {
                count++;
            }
        }
        System.out.println("Кол-во целых элементов в третьем массиве = " + count);
    }

    //Task11
    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        int size;
        while (true) {
            System.out.println("Введите четное положительное число");
            size = scanner.nextInt();
            if (size % 2 == 0) {
                break;
            }
        }
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-5, 5);
        }
        System.out.println(Arrays.toString(arr));

        int sumLeftNum = 0;
        int sumRightNum = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            sumLeftNum += arr[i];
            sumRightNum += arr[arr.length - 1 - i];
        }

        int difference = sumLeftNum - sumRightNum;
        if (difference > 0) {
            System.out.println("Левая половина больше");
        } else if (difference < 0) {
            System.out.println("Правая половина больше");
        } else {
            System.out.println("Обе половины равны");
        }
    }
    //Task12
    public static void task12(){
        int randomSize = 21, negativeCount = 0, positiveCount = 0;
        int[] arr = new int[12];
        Random random = new Random();

        do {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(randomSize) + -10;
            //нули не добавляем
                if (arr[i] == 0) {
                    i--;
                }
                if (arr[i] < 0) {//увеличиваем счетчик отрицательных чисел
                    negativeCount++;
                }
                if (arr[i] > 0) {//увеличиваем счетчик положительных чисел
                    positiveCount++;
                }

                if (i == arr.length - 1 & positiveCount != arr.length / 2) {
                    positiveCount = 0;
                    negativeCount = 0;
                }

            }


        } while (positiveCount != arr.length / 2 && negativeCount != arr.length / 2);//точка выхода из цикла - число
        // положительных равно числу отрицательных элементов

        //Вывод на печать
        System.out.println(Arrays.toString(arr));
    }
}
