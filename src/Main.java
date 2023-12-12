import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();

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
    public static void task2(){
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
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    //Task3
    public static void task3(){
        Random random = new Random();
        int[] arr = new int[15];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(9);
            if(arr[i] %2 == 0){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("В массиве " + count + " четных чисел.");

    }
}
