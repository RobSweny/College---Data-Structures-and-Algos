import java.util.*;

class Dec2Bin
{
    public static void main(String[] args)
    {
        int num = 0;

        // take input from user
        Scanner input = new Scanner(System.in);

        // create stack object
        Stack<Integer> stack = new Stack<>();

        // take user input into num
        System.out.print("Enter decimal: ");
        num = input.nextInt();

        // keep dividing the user input until it hits 0
        while (num != 0)
        {
            // push num divisible by 2 to stack
            stack.push(num % 2);
            /*
                Example decimal 100
                Output: 0010011
                100 % 2 = 0
                50 % 2 = 0
                25 % 2 = 1
                12 % 2 = 0
                6 % 2 = 0
                3 % 2 = 1
                1 % 2 = 1
            */

            // divide by two (much like num += we can also divide equals with /=)
            // num being 100,50,25,12,6,3,1 in the above example
            num /= 2;
        }

        System.out.println("Stack from bottom to top: " + Arrays.toString(stack.toArray()));

        // creating an iterator
        Iterator value = stack.iterator();
        System.out.print("Binary output: ");
        // as we loop through the array we print the value at the top first
        while (value.hasNext()) {
            System.out.print(stack.pop());
            // print [1, 1, 0, 0, 1, 0, 0]
        }
        System.out.println();
    }
}