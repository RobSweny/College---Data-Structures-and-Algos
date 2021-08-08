import java.util.Arrays;

// Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
public class MoveX {

    static String moveX(String str)
    {
        if(str.length() == 0)
            return str;
        if(str.charAt(0) == 'x')
            return moveX(str.substring(1)) + 'x';
        return str.charAt(0) + moveX(str.substring(1));
    }

    public static void main(String[] args)
    {
        System.out.println(moveX("txxteststxt"));
    }
}

