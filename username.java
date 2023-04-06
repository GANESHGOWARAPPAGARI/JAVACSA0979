import java.util.*;
class username
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username:");
        String a=sc.nextLine();
        System.out.println("Re enter the username:");
        String b=sc.nextLine();
        if(a.equals(b))
        {
            System.out.println("username is valid...............");
        }
        else
        {
            System.out.println("username is not valid........");
        }
    }
}