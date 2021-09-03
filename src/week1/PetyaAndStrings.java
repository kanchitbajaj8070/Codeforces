package week1;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] one = scanner.nextLine().toCharArray();
        char[] two = scanner.nextLine().toCharArray();
        int i=0;
        for (i = 0; i < one.length; i++) {
            int a = one[i];
            int b = two[i];
            if(a>90)
                a=a-32;
            if(b>90)
                b=b-32;
            if (a!=b)
            {
                if(a<b)
                    System.out.println("-1");
                else
                    System.out.println("1");
                break;
            }
        }
        if(i==one.length)
        System.out.println(0);

    }
}
