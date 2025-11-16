package p6pbo;

import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah data: ");
            int n = sc.nextInt();

            int[] data = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Data ke-" + (i + 1) + ": ");
                data[i] = sc.nextInt();
                sum += data[i];
            }

            double rata = (double) sum / n;
            System.out.println("Nilai rata-rata = " + rata);

        } catch (Exception e) {
            System.out.println("Error: Input harus angka!");
        }
    }
}
