package CphBusiness;

public class View {
    final static String msg = "MOMS";
    final static String Currency = "Kr";

    public  void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result, Currency, msg);
    }
}
