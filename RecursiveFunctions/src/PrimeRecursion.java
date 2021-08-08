public class PrimeRecursion {

    static boolean PrimeChecker(int num, int i)
    {
        if ( num <= 2)
        {
            return num == 2;
        } else {
            if (num % i == 0)
            {
                return true;
            } else {
                //return PrimeChecker(num - 1);
            }
        }
    }

    public static void main (String[] args)
    {
        System.out.print(PrimeChecker(4, 2));
    }
}
