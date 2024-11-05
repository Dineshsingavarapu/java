import java.io.*;

class Main {
    public static void main(String args[]) {
        int a = 5, b = 0, c;
        int arr[] = new int[5];
        String str = null;

        try {
            c = a / b; 
            System.out.println("Value of c is " + c);
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException caught");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException caught");
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
