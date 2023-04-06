import java.util.*;
class revstr 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.nextLine();
        int l=a.length();
        System.out.println("reversed string");
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(a.charAt(i));
        }
    }
    
}
