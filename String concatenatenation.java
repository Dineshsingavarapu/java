import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String args[]){
        String s1="SASI";
        String s2="sasi";
        String s3="SITE";
        String s4="site";
        String s5=s2.concat(s3);
        System.out.println("After concating s2 and s3 result is:"+s5);
        System.out.println("The result of s1+s3 is:"+(s1+s3));
        String s6=s2+s3+s4;
        System.out.println("Result of s2+s3+s4 is:"+s6);
        String s7=s3.join("TE","HELLO");
        System.out.println("After joining HELLO with s3 is:"+s7);
    }
}

