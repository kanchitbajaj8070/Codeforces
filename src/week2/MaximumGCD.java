package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumGCD {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader s=new FastReader();
        int t=s.nextInt();
        while(t>0)
        {
            t--;
            int n=s.nextInt();
            int max=1;
            int diff=Integer.MAX_VALUE;
            for(int i=2;i<=(n/2);i++)
            {

                int d=n-(i*2);
                if(d<diff)
                {
                    diff=d;
                    max=i;
                }
            }
            System.out.println(max);
        }
    }
    private static int gcd(int a, int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
