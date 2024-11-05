import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ThreadDemo td1 = new ThreadDemo(); 
        ThreadDemo td2 = new ThreadDemo("my thread"); 
        td1.start();
        td2.start();
        String str = td2.getName();
        System.out.println("Thread2 name is: " + str);
    }
}
class ThreadDemo extends Thread {
    public ThreadDemo() {
    }
    public ThreadDemo(String name) {
        super(name); 
    }
    public void run() {
        System.out.println(getName() + " is created and is running");
    }
}
