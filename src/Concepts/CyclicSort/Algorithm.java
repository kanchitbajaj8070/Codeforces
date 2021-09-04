package Concepts.CyclicSort;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        int[]a={3,5,2,1,4};

    int n=5;
    int i=0;
    while(i<n)
    {int correctPos=a[i]-1;
        if(a[i]!=i+1)
        {
            swap(a,i,correctPos);
        }
        else
            i++;
    }
        System.out.println(Arrays.toString(a));
    }
    public static void swap(int[]a,int i,int j)
    {
        int c=a[i];
        a[i]=a[j];
        a[j]=c;
    }
}
