import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
    String[] strings = {"et", "to", "tre","fire","fem"};
    int[] integers = {15,12,10,20};
    boolean[] booleans = {true,false,true,true,false};


    printStrings(strings);
    System.out.println(sumOfIntArray(integers));
    System.out.println(avgOfIntArray(integers));
    printIntArray(integers);
    sortArray(integers);
        System.out.println("");
    printIntArray(integers);
    }

    public static void printStrings(String [] s){
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    public static int sumOfIntArray(int[] ints){
        int sum = 0;

        for(int i = 0; i < ints.length; i++) {
            sum = sum + ints[i];
        }
        return sum;
    }
    public static int avgOfIntArray(int[] ints){
        int avg;
        avg = sumOfIntArray(ints)/ ints.length;
        return avg;

    }
    public static void sortArray(int [] arr){
        Arrays.sort(arr);
    }

    public static void printIntArray(int [] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}