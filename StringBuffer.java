import java.io.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
	    StringBuffer sb1=new StringBuffer("Hello");
	    	System.out.println("The Resultant String is: "+sb1);
	    sb1.append("java");
		System.out.println("The Resultant String is: "+sb1);
		StringBuffer sb2=new StringBuffer("Hello");
		sb2.insert(2,"java");
			System.out.println("The Resultant String is: "+sb2);
				StringBuffer sb3=new StringBuffer("Hello");
				sb3.replace(2,4,"java");
					System.out.println("The Resultant String is: "+sb3);
					StringBuffer sb4=new StringBuffer("Hello");
					sb4.delete(2,4);
						System.out.println("The Resultant String is: "+sb4);
						StringBuffer sb5=new StringBuffer("Hello");
						sb5.reverse();
							System.out.println("The Resultant String is: "+sb5);
	}
}