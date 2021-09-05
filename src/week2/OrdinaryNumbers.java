package week2;

import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        { t--;
        int n=s.nextInt();
        int ans=0;
        int length=String.valueOf(n).length();
        ans+=(length-1)*9;
        int firstDigit=n/((int)Math.pow(10,length-1));
        ans+=firstDigit;
        int cons=0;
        for(int i=0;i<=length-1;i++)
        {
            cons+=firstDigit*((int)Math.pow(10,i));
        }
        if(n>=cons)
        System.out.println(ans);
    else
            System.out.println((ans-1));
        }
}
}
