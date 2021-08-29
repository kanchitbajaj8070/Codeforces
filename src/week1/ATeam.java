package week1;


import java.util.Scanner;

public class ATeam {
    public static void main(String[] args)  {
        Scanner b = new Scanner(System.in);
        int n = b.nextInt();
        int c = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
            count+=b.nextInt();
            }
            if(count>=2)
                c++;
            count = 0;
            b.nextLine();
        }
        System.out.println(c);
    }
}
