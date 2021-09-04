package Concepts.NumberTheory;

public class ModuloInverse {
    public static void main(String[] args) {
        //7.b_-1 mod 17,  b should be 5 , or modulo inverse should be 5 since 7*5%17=1
        int a=7;
        int m=17;
        LinearDiphantineSOlnByExtendedEuclidAlgo.Triplet ans=LinearDiphantineSOlnByExtendedEuclidAlgo.extendedEucledianAlgo(a,m);
        System.out.println(ans.x);
    }
}
