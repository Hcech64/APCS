import java.util.Scanner;

public class LongestStreak{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what String would you like the longest streak from?");
        String string = keyboard.nextLine();
        
        longestStreak(string);
        
        keyboard.close();
    }
    public static void longestStreak(String str){
        int Totalcount = 0;
        int count = 1;
        char Char = ' ';
        char TotalChar = ' ';
        

        for(int n = 1; n <= str.length() -1; n++ ){
            int m = n - 1;
            if(str.charAt(n) == str.charAt(m)){
                System.out.println("the letters match. N =  " + n + " and the character is: " + str.charAt(n)); 
                count++;
                Char = str.charAt(n);

                if(count > Totalcount){
                    System.out.println("the new streak is bigger with a streak of " + Totalcount + " and a character of " + TotalChar);
                    Totalcount = count;
                    TotalChar = Char;
                }
            }
            else{
                System.out.println("streak over. N = " + n);
                count = 1;
                Char = ' ';
            }
        }

        System.out.println(TotalChar + " " + Totalcount);
    }
}