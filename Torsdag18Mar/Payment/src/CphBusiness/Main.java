package CphBusiness;



public class Main {

    public static void main(String[] args) {
        UserInput input = new UserInput();


	    Account ac1 = new Account(input.getStringInput("Owner"), input.getIntInput("balance"));
	    Account ac2 = new Account(input.getStringInput("Owner"), input.getIntInput("balance"));
	    Account ac3 = new Account(input.getStringInput("Owner"), input.getIntInput("balance"));
        Account [] accounts = new Account[3];
        accounts[0] = ac1;
        accounts[1] = ac2;
        accounts[2] = ac3;

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
        }



    }
}
