import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                int a[]=new int[n];
                for(int i=0;i<n;i++){
                        a[i]=sc.nextInt();
                }
                int b[]=new int[n];
                Stack<Integer> s = new Stack<Integer>();
                s.push(0);
                for(int i=1;i<n;i++){
                      while(s.isEmpty()==false && a[i]>a[s.peek()]){
                              int pos = s.peek();
                              b[pos]=a[i];
                              s.pop();
                      } 
                        s.push(i);
                }
                while(s.isEmpty()==false){
                        b[s.peek()]=-1;
                        s.pop();
                }
                for(int i=0;i<n;i++){
                        System.out.print(b[i]+" ");
                }
	}
}
