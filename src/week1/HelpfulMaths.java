package week1;

import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
       int ones=0;
       int twos=0;
       int threes=0;
       Scanner scanner=new Scanner(System.in);
           String [] arr=scanner.nextLine().split("\\+");
        for (int i = 0; i < arr.length; i++) {
            int input=Integer.parseInt(arr[i]);
           if(input==1)
               ones++;
           else if (input==2)
               twos++;
           else
               threes++;
       }
       StringBuilder str=new StringBuilder();
       while(ones>0)
       {str.append(1);
       str.append("+");
           ones--;
       }
        while(twos>0)
        {str.append(2);
            str.append("+");
            twos--;
        }
        while(threes>0)
        {   str.append(3);
            str.append("+");
            threes--;
        }
        if(str.length()>1)
        str.deleteCharAt(str.length()-1);
        System.out.println(str.toString());
    }
}
