import java.util.Scanner;
class arr
 {
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the array size: ");
 int size=s.nextInt();
 float[] arr=new float[size];
 float msum=0;
 System.out.print("Enter the array elements: ");
 for(int i=0;i<size;i++){
 arr[i]=s.nextFloat();
 msum+=arr[i];
 }
 float temp=0;
 for(int i=0;i<size;i++){

 for(int j=0;j<size;j++){
 if(arr[i]<arr[j]){
 temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
 }
 }
 }
 System.out.println("Mean: "+(int)(msum/size));
 if(size%2==0)
 System.out.println("Median: "+(int)((arr[size/2]+arr[(size/2)+1])/2));
 else
 System.out.println("Median: "+(int)(arr[size/2]));
 float max=0;
 int o_count=0,n_count=0;

 for(int i=0;i<size;i++){
 for(int j=0;j<size;j++){
 if(arr[i]==arr[j])
 n_count++;
 }
 if(o_count<n_count){
 max=arr[i];
 o_count=n_count;
 }
 n_count=0;
 }
 System.out.print("Mode: "+(int)max);
 }
 } 
