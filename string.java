import java.util.*;
public class string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string:");
        String str1=sc.nextLine();
        System.out.println("enter second string:");
        String str2=sc.nextLine();
        System.out.println("enter a charecter to perform indes operation");
        char ch=sc.next().charAt(0);
        System.out.println("index of "+ch+"in str1:"+str1.indexOf(ch));
        if(str1.equals(str2))
        {
            System.out.println("strings are equal");
    
        }
        else
        {
            System.out.println("strings are not equal");
        }
        String str3=str1.concat(" ").concat(str2);
        System.out.println(str3);
    }
}
