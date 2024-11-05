import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ThreadCreation1 tc1 = new ThreadCreation1();
        ThreadCreation1 tc2 = new ThreadCreation1();
        tc1.getName();
        tc1.start();
        tc2.start();
    }
}
class ThreadCreation1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " was created and is running");
    }
}
