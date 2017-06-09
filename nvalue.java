# nvalue.java
import java.io.*;
import java.util.*;
public class sum1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int a[]=new int[N];
        int sum=0;
        for(int i=0;i<=N;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            sum+=a[i];
        }
           
        System.out.println(sum); 
    }
}
