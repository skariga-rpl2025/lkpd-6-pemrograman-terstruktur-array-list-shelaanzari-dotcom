package PencarianArray;
        
 import java.util.Scanner;

public class PencarianArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[100];
        int arr_count, i, num;

        System.out.print("Input jumlah element Array: ");
        arr_count = input.nextInt();

        System.out.print("Input " + arr_count + " angka (dipisah dengan enter):\n");
        
        // simpan angka ke dalam array
        for (i = 0; i < arr_count; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println();

        System.out.print("Input angka yang akan dicari: ");
        num = input.nextInt();

        // proses pencarian
        for (i = 0; i < arr_count; i++) {
            if (arr[i] == num) {
                System.out.println("Angka ditemukan pada index ke-" + i);
                break;
            }
        }

        if (i == arr_count) {
            System.out.println("Angka " + num +  " tidak ditemukan");
        }
    }
}
