
import java.util.*;
class factor
{
   public static void main(String args[])
   {
       try
        {
          Scanner sc=new Scanner(System.in);
          int count=0,n,i;
          System.out.println("Enter the number:");
          n=sc.nextInt();
          if(n<=0)
          {
            System.out.println("Enter valid number");
          }
          else
          {
          for(i=1;i<=n;i++)
          {
             if(n%i==0)
             {
                 count++;
             }
          }
         
          System.out.println("The number of factors:"+count);
        }
       }
        catch(Exception e)
        {
           System.out.println("Enter only numbers");
        }
    }
}
