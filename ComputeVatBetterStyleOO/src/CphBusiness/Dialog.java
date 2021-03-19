package CphBusiness;

import java.util.Scanner;

public class Dialog {

    public  double doDialog(){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast varens pris: ");
        double number = myScan.nextDouble();
        return number;
    }
}
