import java.io.*;
public class Main{
    private int a;
    public void setNumber(int a){
        this.a=a;
        System.out.println("value of a is "+a);
    } 
    public static void main(String args[]){
        Main td= new Main();
        td.setNumber(50);
    }
}