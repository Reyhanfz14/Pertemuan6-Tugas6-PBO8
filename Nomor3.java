package p6pbo;

import java.util.Arrays;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input elemen array
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // cari max, min
        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;

        // jumlah keseluruhan
        int sum = 0;

        // jumlah indeks ganjil & genap
        int sumGanjil = 0, sumGenap = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // max min
            if (arr[i] > max) { max = arr[i]; idxMax = i; }
            if (arr[i] < min) { min = arr[i]; idxMin = i; }

            // indeks ganjil/genap
            if (i % 2 == 0) sumGenap += arr[i];
            else sumGanjil += arr[i];
        }

        // output
        System.out.println("\nNilai terbesar: " + max + " (index " + idxMax + ")");
        System.out.println("Nilai terkecil: " + min + " (index " + idxMin + ")");
        System.out.println("Jumlah semua elemen: " + sum);
        System.out.println("Jumlah elemen indeks ganjil: " + sumGanjil);
        System.out.println("Jumlah elemen indeks genap: " + sumGenap);

        int cek = sumGenap + sumGanjil;
        System.out.println("Hasil (ganjil+genap): " + cek + 
            " → " + (cek % 2 == 0 ? "Genap" : "Ganjil"));

        // sort
        Arrays.sort(arr);
        System.out.println("Array urut:");
        for (int x : arr) System.out.print(x + " ");
    }
}
