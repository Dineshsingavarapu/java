import java.io.*;
import java.lang.String;
class Main{
    public static void main(String args[]){
        String s1="Welcome";
        String s2=new String("Welcome");
        char ch[]={'w','e','l','c','o','m','e'};
        String s3=new String(ch);
        boolean x=s1.equals(s2);
        System.out.println("s1 is equalsto s2:"+x);
        boolean y=s1.equals(s3);
        System.out.println("s1 is equalsto s3:"+y);
        System.out.println("Character at fourth position in s1 is:"+s1.charAt(4));
        System.out.println("Concatenating s1 and s3 is:"+s1.concat(s3));
        System.out.println("Concatenating s3 and s2 is:"+s3.concat(s2));
        System.out.println("Length of s1 is:"+s1.length());
        System.out.println("LowerCase of s1 is:"+s1.toLowerCase());
        System.out.println("UpperCase of s1 is:"+s1.toUpperCase());
        System.out.println("Index of c in s1 is:"+s1.indexOf('c'));
        System.out.println("The Substring of s1 from index 3 is: " + s1.substring(3));
        System.out.println("The Substring of s1 from index 2 to 5 is: " + s1.substring(2, 5));
    }
}

