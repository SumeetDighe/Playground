import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();
        String name;
        int mark;
        System.out.print("Enter the number of values to be inserted in map:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n);
        for(int i = 0;i<n;i++)
        {
            name = sc.nextLine();
            mark = Integer.parseInt(sc.nextLine());
            lhm.put(name,mark);
        }
        System.out.println(lhm);
        System.out.print("Enter the index to be removed:");
        String m = sc.nextLine();
        System.out.println(m);
        lhm.remove(m);
        System.out.println(lhm);
        System.out.println("Size of map is : "+lhm.size());
    }
}