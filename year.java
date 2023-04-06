import java.util.*;
class year 
{
    public static void main(String args[])
    {
        try {
            {
                int d,y,w,y1;
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no.of days:");
                int nod=sc.nextInt();
                if(nod<=0)
                    throw new ArithmeticException("invalid due to negative kor zero value");
                y=nod/365;
                y1=nod%365;
                w=y1/7;
                d=y1%7;
                System.out.println("years:"+y);
                System.out.println("weeks:"+w);
                System.out.println("days:"+d);
            }
        } 
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e) 
        {
            // TODO: handle exception
            System.out.println("invalid due to ");
        }
    }
}
