package CphBusiness;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    private static final String[][] text = new String[12][1];
    private static final String[][] splitArray = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        Scanner scanner = new Scanner(file);


        int i = 0;
        while (scan.hasNextLine()) {
            text[i] = scan.nextLine().split(" ");
            System.out.println(text[i].length);
            i++;
        }


        int ij = 0;
        while (scanner.hasNextLine()) {
            splitArray[ij] = scanner.nextLine().split("\\.");
            System.out.println(splitArray[ij].length);
            ij++;
        }

        printWordsStartingWith("ø");
        printWordsOfLength(3);
        printWordsWithDoubleConsonant();
        findLongestSentence();

        printPartOfWord("kulturelle", 6, 4);
        printPartOfWord("kulturelle", 13, 5);
        printPartOfWord("københavn", 6, 4);

        printPalindrome("den laks skal ned");

    }

    //Task 4
    private static void printPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        if (s.contentEquals(reverse)) {
            System.out.println(reverse);
        }
    }

    //Task 3
    private static void printPartOfWord(String word, int indexOne, int lengthOfSubstring) {
        int indexTwo = indexOne + lengthOfSubstring;
        if ((indexOne + lengthOfSubstring) > word.length()) {
            indexTwo = word.length();
        }

        try {
            System.out.println(word.substring(indexOne, indexTwo));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index one is too high");
        }
    }

    //Task 2
    private static void findLongestSentence() {
        String longest = "";
        for (int i = 0; i < splitArray.length; i++) {
            for (String s : splitArray[i]) {
                if (s.length() > longest.length()) {
                    longest = s;
                }
            }
        }
        System.out.println(longest);
    }

    private static void printWordsOfLength(int length) {
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.length() == length) {
                    if (s.contains(".") || s.contains(",")) {

                    } else {
                        System.out.println(s);
                    }
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.startsWith(pattern) || s.startsWith(pattern.toUpperCase())) {
                    System.out.println(s);
                }
            }
        }
    }


    // Task 1
    private static void printWordsWithDoubleConsonant() {
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                checkForDoubleConsonant(s);
            }
        }
    }

    private static void checkForDoubleConsonant(String s) {
        for (char c = 'a'; c <= 'z'; c++) {
            String x = String.valueOf(c);
            x += x;
            if (x.contentEquals("aa") || x.contentEquals("ee") || x.contentEquals("ii") || x.contentEquals("oo") || x.contentEquals("uu") || x.contentEquals("yy") || x.contentEquals("ææ") || x.contentEquals("åå") || x.contentEquals("øø")) {
                return;
            } else if (s.contains(x)) {
                System.out.println(s);
            }
        }
    }
}
