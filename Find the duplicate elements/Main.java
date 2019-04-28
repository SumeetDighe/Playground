import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> ts = new TreeSet<String>();
        String m = sc.nextLine();
        String[] arr = m.split(",");
        System.out.println("Duplicate Entry is: "); 
        for (String str : arr) {
            if (!ts.add(str)) {
                System.out.println(str);
            }
        }
        System.out.println("TreeSet is : " + ts);
    }
}