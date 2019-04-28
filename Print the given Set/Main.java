import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner sc = new Scanner(System.in);  
      LinkedHashSet<String> hs=new LinkedHashSet<String>();
        String m = sc.nextLine();
        String[] arr = m.split(",");
        for(int i = 0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
}