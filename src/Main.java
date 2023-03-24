import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Đảo ngược phẩn tử mảng có sẵn:
        int[] arr = {1, 2, 3, 4, 5};
        int size = 5;
        for (int k : arr) {
            System.out.println(k);
        }
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int k : arr) {
            System.out.print(k + "");
        }


        int size1;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size1 = scanner.nextInt();
            if (size1 > 20)
                System.out.println("Size does not exceed 20");
        } while (size1 > 20);
        array = new int[size1];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size1- 1 - j];
            array[size1 - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int k : array) {
            System.out.print(k + "\t");
        }
    }
}