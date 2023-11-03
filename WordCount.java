import java.io.*;


public class WordCount  {
    public static void main (String[] args)
        throws IOException
    {
        File file = new File ("/Users/andrewpaolella/VS Code /IntroToJava/Lab 11/WordCount/src/TxtReader.txt"); //Input directory for TxtReader.txt or any other file to read the Word count.
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            int WordCount = 0;
            int characterCount = 0;
            int paraCount = 0;
            int sentenceCount = 0; //Here we define multiple string lines as int = 0. 

            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("")) {
                    paraCount += 1;
                }
                else {
                    characterCount += line.length(); //Returns the length of this string characterCount.
                    String words[] = line.split("\\s+");
                    WordCount += words.length; //Returns the length of String WordCount.
                    String sentence[] = line.split("[!?.:]+");
                    sentenceCount += sentence.length; //Returns the length of string SentenceCount
                }
            }
            if (sentenceCount >= 1) {
                paraCount++;
            }
            System.out.println("Total word count = "+ WordCount); 
            System.out.println("Total number of sentences = "+ sentenceCount); 
            System.out.println("Total number of characters = "+ characterCount); 
            System.out.println("Number of paragraphs = "+ paraCount);
        } 
    }


// Java program to count the number of lines, words, sentences and characters.







    
    
}
