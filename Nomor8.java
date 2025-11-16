package p6pbo;

public class Nomor8 {
    public static void main(String[] args) {
        int jumlahThread = 10; // bebas diganti

        for (int i = 1; i <= jumlahThread; i++) {
            Thread t = new Thread(() -> {
                System.out.println("Thread berjalan: " + Thread.currentThread().getName());
            });
            t.start();
        }

        System.out.println("Thread utama selesai");
    }
}

