import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ThreadCreation2 tc2 = new ThreadCreation2();
        Thread t = new Thread(tc2);
        t.start();
    }
}
class ThreadCreation2 implements Runnable {
    public void run() {
        System.out.println("Thread was created and is running");
    }
}
