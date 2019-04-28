import java.util.*;
import java.util.regex.Pattern; 

class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String s1 = sc.nextLine();
       System.out.println(reverse_string(s1)); 
    }
    // Function to reverse a string
    static String reverse_string(String sb)
    {
         Pattern pattern = Pattern.compile("\\s"); 
  
        String[] temp = pattern.split(sb); 
        String result = ""; 
  
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    }
}