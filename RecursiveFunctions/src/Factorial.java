public class Factorial
{
    static int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n + fact(n - 1);
    }

    public static void main( String args[] )
    {
        System.out.print(fact(5));
        // 5 + 4 + 3 + 2 + 1 = 15
    }
}
