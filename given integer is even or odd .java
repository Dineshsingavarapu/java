import java.io.*;
import java.util.Scanner;
  public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer to check it is Even or Odd");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+"is an Even integer");
        }
        else{
            System.out.println(num+"is an Odd integer");
        }
    }
}