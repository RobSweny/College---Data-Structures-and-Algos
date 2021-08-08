// Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
public class changeXY {

    // Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
    static String changeXY(String str)
    {
        char ch;
        if(str.length() == 0)
            return str;
        ch = str.charAt(0);
        if(ch == 'x')
            return 'y' + changeXY(str.substring(1));
        return ch + changeXY(str.substring(1));
    }

    public static void main(String[] args)
    {
        System.out.println(changeXY("text"));
    }
}

