import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int x,r,s=0,temp;
    System.out.println("Enter +ve integer:");
    x=sc.nextInt();
    temp=x;
    while(x>0)
    {
        r=x%10;
        s=(s*10)+r;
        x=x/10;
    }
    if(temp==s)
    {
        System.out.println(temp+" is a Palindrome");
    }
    else{
        System.out.println(temp+" is not a Palindrome");
    }
    }
}
