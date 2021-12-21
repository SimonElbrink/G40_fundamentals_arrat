package se.lexicon;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
//        arrays();
//        iterating();
//        printingArrays();
//        sortingArraysExample();
//        searchANumber();


        int[] numbers = {1500,200,500,900,480,29593,25523,634634,2342342};

        int[] lessNumbers = Arrays.copyOf(numbers, 5);

        int[] moreNumbers = Arrays.copyOf(numbers, numbers.length + 3);

        moreNumbers[moreNumbers.length -1] = 65824;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(lessNumbers));
        System.out.println(Arrays.toString(moreNumbers));






    }

    private static void searchANumber() {
        int[] numbers = {1500,200,500,900,480,29593,25523,634634,2342342};

        Arrays.sort(numbers);

        int indexOf = Arrays.binarySearch(numbers, 1500);

        System.out.println("indexOf = " + indexOf);
    }

    private static void sortingArraysExample() {
        String[] sentence = {"Hello", "This", "Is", "a", "sentence"};
        System.out.println(Arrays.toString(sentence));

        Arrays.sort(sentence);
//        Arrays.sort(sentence, String.CASE_INSENSITIVE_ORDER);

        System.out.println(Arrays.toString(sentence));
    }


    public static void arrays(){

        int[] numbers; //created, but non-initialized

        double decimals[]; //created, but non-initialized

        char[] chars = new char[5]; // An array, with fixed size of 5 elements. (index of 0-4)

        // '\u0000'
        System.out.println("" + chars[0] + chars[1] + chars[2] + chars[3] + chars[4]);

        //https://unicode-table.com/en/
        chars[0] = '#';
        chars[1] = '\u0047';
        chars[2] = '\u0034';
        chars[3] = '\u0030';

        System.out.println("" + chars[0] + chars[1] + chars[2] + chars[3] + chars[4]);

        char[] javaWord = new char[] {'J', 'A', 'V', 'A'};

        //                      0       1       2    3        4
        String[] sentence = {"Hello", "This", "Is", "a", "sentence"};

//        char[] javaWord1 = char[]; // Compile time error.
        System.out.println(sentence[5]); // Runtime Error.
//        System.out.println(sentence[4]);

        System.out.println("sentence.length = " + sentence.length);

        System.out.println(sentence[sentence.length -1]);

    }

    public static void iterating(){

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
        }


        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int number : numbers){
            System.out.println(number);
        }

    }


    public static void printingArrays(){

        char[] javaWord = new char[] {'J', 'A', 'V', 'A'};

        System.out.print(javaWord[0]);
        System.out.print(javaWord[1]);
        System.out.print(javaWord[2]);
        System.out.print(javaWord[3]);

        System.out.println();

        System.out.println("" + javaWord[0] + javaWord[1] + javaWord[2] + javaWord[3]);


        for (char letter : javaWord) {
            System.out.print(letter);
        }

        System.out.println();
        String word = charArrayToString(javaWord);
        System.out.println(word);


        System.out.println(String.valueOf(javaWord));


    }

    private static String charArrayToString(char[] chars){
        String word ="";

        for (char letter : chars) {
            word = word.concat(String.valueOf(letter));
        }

//        return String.valueOf(chars);

        return word;
    }







}
