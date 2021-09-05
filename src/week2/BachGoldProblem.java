package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BachGoldProblem {
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
FastReader s= new FastReader();
int n=s.nextInt();
List<Integer> primes=listOfPrimes(n);
        int i=0;
        int count=0;
        int sum=n;
        List<Integer> ans=new ArrayList<>();
        while(sum!=0)
        { int e=primes.get(i);
            while(sum-e>=0)
            {
                sum-=e;
                count++;
                ans.add(e);
            }
            if(sum==0)
                break;
                sum+=e;
                i++;
                count-=1;

                ans.remove(ans.size()-1);

        }
        System.out.println(count);
        for(int x:ans)
        System.out.print(x+" ");
        System.out.println();
    }

    static List<Integer> listOfPrimes(int n)
    {
        List<Integer> ans= new ArrayList<>();
        boolean [] p= new boolean[n+1];
        for(int i=3;i<=n;i++)
        {
            if((i&1)==1)
                p[i]=true;
        }
        p[2]=true;
        for(int i=3;i*i<=n;i++)
        {
            if(!p[i])
                continue;
            for(int j=i*i;j<=n;j+=2*i)
            {
                p[j]=false;
            }
        }
        for(int i=2;i<=n;i++) {
            if (p[i])
                ans.add(i);
        }
            return ans;
    }
}
