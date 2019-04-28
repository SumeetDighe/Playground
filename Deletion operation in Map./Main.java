import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        TreeMap<String,String> hm=new TreeMap<String,String>();
        String name;
        String mark;
        System.out.print("Enter the number of values to be inserted in map:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n);
        for(int i = 0;i<n;i++)
        {
            name = sc.nextLine();
            mark = sc.nextLine();
            hm.put(name,mark);
        }
        System.out.println(hm);
        System.out.print("Enter the index to be removed:");
        String m = sc.nextLine();
        System.out.println(m);
        hm.remove(m);
        System.out.println(hm);
        System.out.print("Enter the index to insert:");
        String name1 = sc.nextLine();
        System.out.println(name1);
        System.out.print("Enter the value to be inserted:");
        String m1 = sc.nextLine();
        System.out.println(m1);
        hm.put(name1,m1);
        System.out.println(hm);
    }
}