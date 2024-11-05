import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = "Dinesh";
        System.out.printf("The String value is: %s\n", str);
        int x = 5 / 2;
        System.out.printf("The integer value is: %d\n", x);
        double f = 5.246718;
        System.out.printf("The double value is: %.6f\n", f); 
        System.out.printf("After formatting to specific width the value is: %.4f\n", f); 
        System.out.printf("After formatting to right margin the value is: %10.2f\n", f); 
    }
}
