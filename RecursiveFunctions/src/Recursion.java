public class Recursion
{
    static int countHi(String str){
        if(str.length() < 2){ // base condition
            return 0;
        } else if (str.substring(0,2).equals("hi")) {
            return 1 + countHi(str.substring(2)); // when hi is found, advance two
        } else {
            return countHi(str.substring(1)); // advance 1
        }
    }

    public static void main(String[] args)
    {
        System.out.print(countHi("hihihih"));
    }
}
