import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tmp;
        int tc;
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        tmp=meal_cost;
        tmp+=meal_cost*tip_percent/100;
        tmp+=meal_cost*tax_percent/100;
        tc=(int)Math.round(tmp);
        System.out.println("The total meal cost is "+tc+" dollars.");
    }
}