package CphBusiness;

public class VAT {
    final static int prcvat = 25;

    public static double doVAT(double number){
        double VAT = number / 100 * prcvat;
        return VAT;
    }
}
