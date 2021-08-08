class Fibonacci
{
    static int fib(int total)
    {
        if (total <= 1)
            return total;

        return fib(total - 1) + fib(total - 2);
    }

    public static void main( String args[] )
    {
        int total = 25;
        for (int i= 0; i < total; i++)
        {
            System.out.print(fib(i) + " ");
            // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368
        }
    }
}