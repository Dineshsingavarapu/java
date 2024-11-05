import java.io.*;
import java.util.*;
class Main {
    void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        if (n > 1) {
            System.out.print(b + " ");
        }
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main ob = new Main();
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        System.out.println("The Fibonacci series is:");
        ob.printFibonacci(n); 
        sc.close();
    }
}
