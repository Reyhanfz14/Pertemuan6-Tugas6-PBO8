package p6pbo;

public class Nomor9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Cara 1 (for biasa):");
        for (int i = 0; i < age.length; i++)
            System.out.println(age[i]);

        System.out.println("\nCara 2 (for-each):");
        for (int a : age)
            System.out.println(a);
    }
}
