package CphBusiness;

import java.util.Scanner;

public class Controller {

    VAT vat = new VAT();
    Dialog dialog = new Dialog();
    View view = new View();

    final static String MSG = "MOMS";


    public  void runController() {
        double userIn = dialog.doDialog();
        double moms = vat.doVAT(userIn);
        view.doView(moms,MSG);
    }



}
