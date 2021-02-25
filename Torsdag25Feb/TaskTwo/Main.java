class Main{

    public static boolean happy = true;

    public static void main(String [] args) {
        if (iAmHappy())
        {
            System.out.println("I clap my hands");
        }
        else
        {
            System.out.println("I don't clap my hands");
        }

        System.out.println(sum(5,10));
        System.out.println(stringToUppercase("this string will be full caps"));
        System.out.println(firstLetterUpperCase("this one checks if the frist letter of this string is uppercase, which it is not."));
    }


    public static boolean iAmHappy()
    {
        if (happy){
            return true;
        } else {
            return false;
        }

    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static String stringToUppercase(String s){
            return s.toUpperCase();
    }

    public static boolean firstLetterUpperCase(String s){
        if (Character.isUpperCase(s.charAt(0))){
            return true;
         }else {
            return false;
        }
    }
}