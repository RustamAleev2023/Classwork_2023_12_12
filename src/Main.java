import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();
        task2();

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
}
