import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int no = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      
       if(no%2==1)
        {
         ans = "Weird";
        }
            else if (no>=2 && no<=5)
                {
                ans ="Not Weird";
                }
          else if (no>6 && no<=20)
      {
          ans ="Weird";
      }
          else
          {
              ans="Not Weird";
          }
          
          // Complete the code 
      
      System.out.println(ans);
   }
}