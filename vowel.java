import java.io.*;
import java.util.Scanner;
public class vowel {
    public static void main(String args[])
    {
        char c;
        System.out.println("enter a charecter");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        switch (c)
        {
            case 'a':
            System.out.println("it is vowel");
            break;
            case 'e':
            System.out.println("it is vowel");
            break;
            case 'i':
            System.out.println("it is vowel");
            break;
            case 'o':
            System.out.println("it is vowel");
            break;
            case 'u':
            System.out.println("it is vowel");
            break;
            default:
            System.out.println("it is not vowel");
        }
    }
}
