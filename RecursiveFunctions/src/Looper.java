public class Looper {
    public static void main( String args[] )
    {
        wordsOfInts(502);
    }

    public static void wordsOfInts(int number) {
        if (number > 0)
        {
            System.out.println("Current Number: " + number);
            System.out.println("Calling - wordsOfInts: " + number / 10);
            wordsOfInts(number / 10);
            System.out.println("Passed ");
            int holder = number % 10;
            System.out.print("Current Holder: " + holder + ", converted to ");
            // Example 502
            // 502 % 10 == 2
            // 50  % 10 == 0
            // 5   % 10 == 5
            String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for (int i = 0; i <= 10; i++)
                if (holder == i)
                    System.out.print(numbers[i] + " ");
        }
    }
}
