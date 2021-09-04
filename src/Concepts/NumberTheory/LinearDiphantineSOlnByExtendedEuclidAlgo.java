package Concepts.NumberTheory;

public class LinearDiphantineSOlnByExtendedEuclidAlgo {
    public static void main(String[] args) {
     //3x+2y=1;//1=gcd(2,3)=so that is a linear diphoantine solution
      Triplet ans=extendedEucledianAlgo(3,2);
        System.out.println(ans.x+"  "+ans.y);
    }
    public static class Triplet
    {
        int x;
        int y;
        int gcd;

        public Triplet(int x, int y, int gcd) {
            this.x = x;
            this.y = y;
            this.gcd = gcd;
        }

        public Triplet() {

        }
    }
    public static Triplet extendedEucledianAlgo(int a , int b)
    {
        if(b==0)
        {
            return new Triplet(1,0,a);
        }
        Triplet smallAns=extendedEucledianAlgo(b,a%b);
        Triplet ans= new Triplet();
        ans.x=smallAns.y;
        ans.gcd=smallAns.gcd;
        ans.y=smallAns.x-((a/b)*smallAns.y);
        return ans;
    }

}
