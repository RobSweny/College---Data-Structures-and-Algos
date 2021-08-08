// Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
public class SumDigit {

    static int sumDigits(int n)
    {
        if(n < 10)
            return n;
        return sumDigits(n/10) + n%10;
    }

    public static void main(String[] args)
    {
        System.out.println(sumDigits(123));
    }
}

