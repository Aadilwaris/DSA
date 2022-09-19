import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{      public static int partition(int a[],int l,int h){
                int pivot=a[h];
                int i=l-1;
                for(int j=l;j<h;j++){
                        if(a[j]<pivot){
                                i++;
                                int temp=a[i];
                                a[i]=a[j];
                                a[j]=temp;
                        }
                }
                i++;
                int temp=a[h];
                a[h]=a[i];
                a[i]=temp;
                return i;
}
        public static void quickSort(int a[],int l,int h){
                if(l<h){
                        int pivot = partition(a,l,h);
                        quickSort(a,l,pivot-1);
                        quickSort(a,pivot+1,h);
                }
}
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                int a[]=new int[n];
                for(int i=0;i<n;i++){
                        a[i]=sc.nextInt();
                }
                quickSort(a,0,n-1);
                for(int i=0;i<n;i++){
                        System.out.print(a[i]+" ");
                }
	}
}
