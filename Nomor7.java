package p6pbo;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread berjalan: " + Thread.currentThread().getName());
    }
}

public class Nomor7 {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start(); // memulai thread
    }
}
