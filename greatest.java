import java.io.*;
import java.util.Scanner;

public class greatest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter a value");
        a=sc.nextInt();
        System.out.println("enter b value");
        b=sc.nextInt();
        System.out.println("enter c value");
        c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is greater");
            }
        }
        else if(b>c)
        {
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("c is greater");
        }
    }
}
