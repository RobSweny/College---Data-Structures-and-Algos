import java.io.*;
import java.util.*;

public class JavaFileValidator {
    /**
     * Function to check java files and return if they are valid or invalid based on their parentheses
     *
     * @param words
     * @return String if valid / invalid java code
     */
    static String javaValidator(ArrayList<String> words) {
        // create a new stack
        Stack<String> st = new Stack<>();
        // for each in the arraylist passed into javaValidator
        for (String word: words) {
            // if the word in the arraylist is a forward parenthesis we push it to the stack
            if (word.equals("{")){
                st.push(word);
            // if the word is a backwards parenthesis we push it to the stack and then pop the two top most Strings
            } else if (word.equals("}")) {
                st.push(word);
                try {
                    String value1 = st.pop();
                    String value2 = st.pop();

                    // each backward parenthesis "}" should always have a corresponding forward parenthesis "{"
                    // so each time we find "}" we can pop the two top most elements to check they are "}","{"
                    // if they are not, there is an issue
                    if (!value1.equals("}") && value2.equals("{")){
                        return "This is not a valid java file";
                    }
                // exception if we attempt to pop two elements when only one exists
                // this exception will occur if "}" is added and we don't have an existing "{"
                } catch (Exception e) {
                    System.out.println("Error " + e);
                    return "This is not a valid java file";
                }
            // If something is added to the java file that is not "{" or "}" we should just skip it
            } else {
                System.out.println("Not a parenthesis, skipping");
            }
        }
        // If stack is empty we have not resolved all of our parenthesis
        if (st.isEmpty()){
            return "This is a valid Java file";
        } else {
            return "This is not valid Java file";
        }
    }

    /**
     * This is a function to read in a java file and return an ArrayList of parenthesis
     *
     * @param filename
     * @return ArrayList<String> of parentheses found in java file
     */
    // function to read in java file for validation
    static ArrayList<String> fileImport(File filename) {
        // create arraylist for holding words from file
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            // create an scanner object filename
            Scanner myReader = new Scanner(filename);
            // reading through the object, continue reading while there is more text
            while (myReader.hasNextLine()) {
                // from the line of text, split it by spaces and parse into an array
                String[] data = myReader.nextLine().split(" ");
                // for each string in the array, if they are one of the following { , } then add to arraylist
                for (String word : data)
                    // for each character in each word, check for parenthesis
                    // this was added as in some cases there was no space between "{" or "}" so they weren't picked up
                    // now each word is split into a char array "Hello" = 'H','E','L','L','O' and checked
                    for (char ch : word.toCharArray()){
                        if (ch == '{' || ch == '}')
                            arrayList.add(word);
                    }
            }
            // close the input
            myReader.close();
        } catch (FileNotFoundException e) {
            // if we cannot find the file, I have create an arraylist as a backup
            System.out.println("Unable to find java file to parse");
            arrayList = new ArrayList<>(Arrays.asList("{","{","{","}","}","}"));
            System.out.println("Using default " + arrayList);
            return arrayList;
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList;

        /*
            Testing correct file not found default
        */
        // Read the java file into an arraylist
        arrayList = fileImport(new File("./src/JavaFileForValidationCorrectaaa.java"));
        // validate the java
        System.out.println("\nValidating " +  arrayList);
        System.out.println(javaValidator(arrayList) + "\n");

        /*
            Testing correct file
        */
        // Read the java file into an arraylist
        arrayList = fileImport(new File("./src/JavaFileForValidationCorrect.java"));
        // validate the java
        System.out.println("\nValidating " +  arrayList);
        System.out.println(javaValidator(arrayList) + "\n");

        /*
            Testing Incorrect file
        */
        // Read the java file into an arraylist
        arrayList = fileImport(new File("./src/JavaFileForValidationIncorrect.java"));
        System.out.println("\nValidating " +  arrayList);
        System.out.println(javaValidator(arrayList)  + "\n");
    }
}
