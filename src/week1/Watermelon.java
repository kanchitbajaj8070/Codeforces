package week1;

import java.io.*;

public class Watermelon {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        {
            if((n<=3)||(n&1)==1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }

    }
}
