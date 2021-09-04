public class Solution {
    public int findDuplicate(int[] a) {

        int i=0;
        int n=a.length;
        while(i<n)
        {

            while(i!=a[i]-1)
            {
                int correctPos=a[i]-1;
                if(a[correctPos]==a[i])
                    return a[i];
                swap(a,i,correctPos);
            }
            i++;
        }
        return n-1;

    }
    public void swap(int[] a,int i , int j)
    {
        int c=a[i];
        a[i]=a[j];
        a[j]=c;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println( solution.findDuplicate(new int []{1,3,4,2,2}));
    }

}
