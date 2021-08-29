package week1;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        int x=0;
        while(n>0)
        {
            String str=s.nextLine();
            if(str.equals("X++")||str.equals("++X"))
                x++;
            if(str.equals("X--")||str.equals("--X"))
                x--;
            n--;
        }
        System.out.println(x);
    }

}
