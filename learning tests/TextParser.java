import java.util.Scanner;

public class TextParser {
    public static void main(String args[]){
        
        System.out.println("Please enter a long word or phrase: ");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();

        //System.out.println(word);

        // we will learn how to parse word.

        System.out.println("your word/ phrase was " + word.length() + " characters long");
        //.length() this will return the number of characters in your word or phrase

        
        System.out.println("the character at the third spot in your word/ phrase is: " + word.charAt(2));
        // .charAt(index) this will return the charatered at the desired index
        // the index of a word/ phrase starts at zero and increases until the end of the string

        //.toLowercase) makes your phrase all lower case
        System.out.println(word.toLowerCase());

        //.toUpperCase() makes your phrase all caps
        System.out.println(word.toUpperCase());

        System.out.println("Does the phrase contain \' the \'? ");
        ///boolean - yes or no , 1 or 0 value
        //.contins checks to see if the phrase contains the disired worsd or letters. Not check for upper case

        boolean hasThe = word.contains("the");
        System.out.println(hasThe);

        //.substring(first, last) this will return a new strin that is a piece of the original string starting at the first desired index and ending at the last desired index. Make sure that your string is big enought because if you ask for more letters that you have, it wil return an error
        //System.out.println("your phrase in cludes the following leters: " + word.substring(2,12));

        int length = word.length();
        int halfway = word.length()/2;
        int third = word.length()*2/3;
        System.out.println("the last third of your phrase is "+ word.substring(third, length));
        System.out.println("the middle letter of your phrase is "+ word.charAt(halfway));

        int a = word.indexOf('a');
        // .indexOf() returns the first index of the desired character.
        System.out.println("The first \' a \' is at index: " + a );
        keyboard.close();
    }
}