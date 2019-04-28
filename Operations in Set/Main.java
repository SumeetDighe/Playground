import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();
        String month = sc.nextLine();
        String[] arr = month.split(",");
        for(int i = 0;i<arr.length;i++)
        {
            lhs.add(arr[i]);
        }
        System.out.println(lhs);
        System.out.print("Enter the value to be deleted: ");
        String n = sc.nextLine();
        System.out.println(n);
        lhs.remove(n);
        System.out.println(lhs);
        System.out.print("Enter the value to be added: ");
        String m = sc.nextLine();
        System.out.println(m);
        lhs.add(m);
        System.out.println(lhs);
    }
}