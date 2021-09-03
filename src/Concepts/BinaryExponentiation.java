package Concepts;

import java.math.BigInteger;

public class BinaryExponentiation {
    public static void main(String[] args) {
        int a=3;
        int n=6;
        int ans=1;
        BigInteger b=new BigInteger("0");
        while(n>0)
        {
            if((n&1)==1)
                ans=ans*a;
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);

    }
}
