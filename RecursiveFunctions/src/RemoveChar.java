// Given a string, compute recursively a new string where all the 'x' chars have been removed
public class RemoveChar
{
    static String removeChar(String str, char ch)
    {
        // if user entered string 'str' is length 0, return string
        if(str.length() == 0){
            return str;
        }
        else
        {
            // if the string character at position 0 is equal to the user defined character 'x'
            if(str.charAt(0) == ch)
            {
                // return substring of next character, this ignores (jumps over) current substring position
                return removeChar(str.substring(1), ch);
            }
            else
            {
                // if character is not 'x' return that letter, call next character in string
                return str.charAt(0) + removeChar(str.substring(1), ch);
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.print(removeChar("xTexstx", 'x'));
    }
}
