package week1;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      int m=0;
      int n=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
              if(scanner.nextInt()==1)
              {
                  m=i+1;
                  n=j+1;
                  break;
              }
            }
        }
        int ans=Math.abs(m-3)+Math.abs(n-3);
        System.out.println(ans);
    }
}
