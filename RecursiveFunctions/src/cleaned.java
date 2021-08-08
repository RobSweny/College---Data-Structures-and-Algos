public class cleaned {
    // Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
    static String stringClean(String str)
    {
        if(str.length() < 2)
            return str;
        if(str.charAt(0) == str.charAt(1))
            return stringClean(str.substring(1));
        return str.charAt(0) + stringClean(str.substring(1));
    }

    public static void main(String[] args)
    {
        System.out.println(stringClean("texxxttt"));
    }
}
