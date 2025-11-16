package p6pbo;

public class Nomor2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        // ubah "Suzuki" menjadi nilai lain
        mobil[1] = "Toyota";

        System.out.println("Isi array setelah diubah:");
        for (String m : mobil) {
            System.out.println(m);
        }
    }
}
