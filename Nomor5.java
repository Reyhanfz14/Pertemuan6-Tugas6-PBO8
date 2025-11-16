package p6pbo;

import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];

        // input A
        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                A[i][j] = sc.nextInt();

        // input B
        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                B[i][j] = sc.nextInt();

        // penjumlahan
        System.out.println("\nHasil Penjumlahan:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
