import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int x=sc.nextInt();
            int flag=0;
            for(int i=2;i*i<x+1;i++)
            {
                if(x%i==0)
                flag++;
            }
            if(x==1)
            flag++;
            if(flag==0)
            System.out.println("Prime");
            else
            System.out.println("Not prime");
        }
    }
}
