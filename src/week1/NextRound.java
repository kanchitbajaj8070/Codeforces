package week1;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int n=b.nextInt();
        int k1=b.nextInt();

        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=b.nextInt();
        }
        int k=arr[k1-1];
        int l=0;
        int r=n-1;
        int mid=0;
        int ans=0;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(arr[mid]>=k&&arr[mid]!=0)
            {
                ans=mid+1;
                l=mid+1;
            }
            else
                r=mid-1;
        }
        System.out.println(ans);
    }
}
