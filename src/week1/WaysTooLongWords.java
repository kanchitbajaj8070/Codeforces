package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaysTooLongWords{

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(b.readLine());
        StringBuffer stringBuffer=new StringBuffer();
        while (t > 0) {
            String s = b.readLine();
            if (s.length() <= 10)
                System.out.println(s);
            else
            {
                stringBuffer.delete(0,stringBuffer.length());
            stringBuffer.append(s.charAt(0));
            stringBuffer.append(s.length() - 2);
            stringBuffer.append(s.charAt(s.length() - 1));
                System.out.println(stringBuffer.toString());
            }

            t--;
        }
    }
}
