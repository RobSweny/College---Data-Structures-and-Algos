import java.util.*;

public class HTMLTags {
    static void htmlValidator(String[] words) {
        Stack<String> st = new Stack<>();
        // An ArrayList of all the HTML tags, we use an ArrayList to utilize the .contains() functionality
        List<String> htmlOpeningTags = Arrays.asList("<html>","<head>","<title>","<body>","<p>","<b>","<u>","<div>","<span>");
        List<String> htmlTags = Arrays.asList("</html>","</head>","</title>","</body>","</p>","</b>","</u>","</div>","</span>");

        // for each in the array of htmlString (e.g "<head>","<body>","This","is","a","test","</body>","</head>","<body>","Why","is","this","hard","</body>")
        for (String word : words) {
            // iterating through the words in the array, if the ArrayList contains any of the words, add it to the stack
            if (htmlOpeningTags.contains(word)) {
                st.push(word);
                System.out.println("Pushed " + word);
            } else {
                // if the word is not in the html tags
                StringBuilder removedSlash = new StringBuilder(word);
                if (word.length() > 1) {
                    StringBuilder removedSlashAdjusted = removedSlash.deleteCharAt(1);
                    if (htmlTags.contains(removedSlashAdjusted.toString())) {
                        st.push(word);
                        System.out.println("Pushed " + word);

                        try {
                            String value1 = st.pop();
                            String value2 = st.pop();

                            if (!value2.equals(removedSlashAdjusted.toString())){
                                System.out.print("This is not valid HTML");
                                break;
                            }
                        } catch (Exception e){
                            System.out.print("This is not valid HTML");
                            break;
                        }
                    }
                }
            }
        }

        // If stack is empty we have not resolved all of our html tags
        if (st.isEmpty()){
            System.out.print("This is valid HTML");
        } else {
            System.out.print("This is not valid HTML");
        }
    }

    public static void main(String[] args) {
        String htmlString = "<head> <body> This is a test </body> </head> <body> This is a test </body>";
        // split the above string into an array of words
        String[] words =htmlString.split(" ");
        System.out.println("HTML String " + htmlString);
        htmlValidator(words);
    }
} 