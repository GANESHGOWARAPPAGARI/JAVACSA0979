import java.io.*;
import java.util.*;
class matrixx
{
    public static void main(String args[])
    {
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter no of row1 in matrix 1:");
        int row1=sc.nextInt();
        System.out.println("enter no of col1 in matrix 1:");
        int col1=sc.nextInt();
        System.out.println("enter no of row2 in matrix 1:");
        int row2=sc.nextInt();
        System.out.println("enter no of col2 in matrix 1:");
        int col2=sc.nextInt();
        if(col1!=row2)
        {
            System.out.println("not valid");
        }
       
        else
        {
            System.out.println("enter matrix1 values:");
            int mat1[][] = new int[row1][col1];
            int mat2[][] = new int[row2][col2];
            int res[][] = new int[row1][col2];
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    mat1[i][j]=sc.nextInt();
                }
            }
            System.out.println("enter matrix2 values:");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    mat2[i][j]=sc.nextInt();
                }
            }

            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
            {
                for(k = 0; k < col1; k++)
                {
                    res[i][j]=res[i][j]+mat1[i][k]*mat2[k][j];
                }
                System.out.println(res[i][j]+" ");
            }
            System.out.println();
            }
        }
    }
}