import java.util.*;
class age
{
    public static void main(String args[]){
    Scanner scan=new Scanner (System.in);
    System.out.println("Enter the age of person");
    int user_age=scan.nextInt();
    System.out.println("The age of person is"+user_age);
    if(user_age>18)
    {
        System.out.println("You are eligible to Vote");
    }
    else
    {
        System.out.println("You are not eligible to vote and you are left  " + (18 - user_age) + "years to vote ");
    }
    }
}