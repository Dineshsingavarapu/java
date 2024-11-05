import java.io.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Hello");
		System.out.println("The Resultant String is: "+sb1);
		sb1.append("java");
		System.out.println("The Resultant String is: "+sb1);
		StringBuilder sb2=new StringBuilder("Hello");
		sb2.insert(2,"java");
		System.out.println("The Resultant String is: "+sb2);
		StringBuilder sb3=new StringBuilder("Hello");
		sb3.replace(2,4,"java");
		System.out.println("The Resultant String is: "+sb3);
		StringBuilder sb4=new StringBuilder("Hello");
		sb4.delete(2,4);
		System.out.println("The Resultant String is: "+sb4);
		StringBuilder sb5=new StringBuilder("Hello");
		sb5.reverse();
		System.out.println("The Resultant String is: "+sb5);
	}
}
