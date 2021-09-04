package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LearnFromMath {
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

        FastReader s = new FastReader();
        int n = s.nextInt();
        boolean [] isPrime=new boolean[n+1];
        isPrime[2]=true;

        for (int i = 3; i <=n ; i++) {
            if((i&1)==1)
                isPrime[i]=true;
        }
        for(int i=3;i*i<=n;i++)
        {
            if(!isPrime[i])
                continue;
            for(int j=i*i;j<=n;j+=2*i)
            {
                isPrime[j]=false;
            }
        }
        for(int i=4;i<=n;i++)
        {
            if(!isPrime[i]&&!isPrime[n-i])
            {
                System.out.println(i+" "+(n-i));
            return;
            }
        }
    }

}
