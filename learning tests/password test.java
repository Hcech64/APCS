import java.util.Scanner;

class password{
    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard1 = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String uname = keyboard1.nextLine();

        if (uname.equals("root")){

            System.out.println("please input a password or passphrase: ");
            String passwd = keyboard.nextLine();

            if (passwd.equals("1234" )){
            System.out.println("Password accepted; access granted.");
            System.out.println("Welcome to the United State Department of Homeland Security.");
            }

            else {
                System.out.println("Incorrect password.");
            }
        }
        
        
        else {
            System.out.println("incorrect username, try again.");
        }
        keyboard.close();
        keyboard1.close();
        
    }
}