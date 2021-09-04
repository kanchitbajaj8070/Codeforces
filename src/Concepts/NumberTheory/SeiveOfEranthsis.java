package Concepts.NumberTheory;

public class SeiveOfEranthsis {
    public static void main(String[] args) {
naiveMethod(100);
seiveOfEranthosisMethod(100);
    }
    public static void naiveMethod(int range)
    {
        System.out.println("***************************");
        for(int x=2;x<=range;x++)
        {
            boolean isPrime=true;
            for(int i=2;i*i<=x;i++)
            {
                if(x%i==0)
                {
                 isPrime=false;
                 break;
                }
            }
            if(isPrime)
                System.out.print(x+"    ");
        }
        System.out.println();

    }
    private static void seiveOfEranthosisMethod(int range)
    {
        boolean[] isPrime=new boolean[range+1];

        isPrime[2]=true;
        for(int i=3;i<=range;i++)
        {
            if((i&1)==1)
            {
                isPrime[i]=true;
            }
        }

        for(int i=2;i*i<=range;i++)
        {
            if(!isPrime[i])
                continue;
            for(int j=i*i;j<=range;j+=2*i)
            {
                isPrime[j]=false;
            }
        }
        for(int i=2;i<=range;i++)
        {
            if(isPrime[i])
                System.out.print(i+"    ");
        }
        System.out.println();




    }

}
