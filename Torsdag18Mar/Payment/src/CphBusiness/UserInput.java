package CphBusiness;

import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);

    public int getIntInput(String message){
        System.out.print(message+": ");
        int input = scan.nextInt();
        return input;
    }
    public String getStringInput(String message){
        System.out.print(message+": ");
        String input = scan.next();
        return input;
    }
}
