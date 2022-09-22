package projects;

import java.util.Scanner;

class namegrab {
    public static void main(String args[]){
        Scanner first = new Scanner(System.in);
        Scanner last = new Scanner(System.in);

        System.out.println("What is your first name? ");
        String firstname = first.nextLine();


        System.out.println("What is your last name? ");
        String lastname = last.nextLine();

        System.out.println("Hello " + firstname + ", " + lastname);

        first.close();
        last.close();
    }
    
}
