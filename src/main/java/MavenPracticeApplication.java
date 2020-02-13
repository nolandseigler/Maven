import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Scanner;

public class MavenPracticeApplication {
    private static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
    boolean keepLooping = true;
    do {
        int userInt = 9;
        System.out.println("What would you like to do?");
        try {
            System.out.println("1. Flip String.");
            System.out.println("2. Reverse String.");
            System.out.println("3. Put my String down, flip it and reverse it.");
            System.out.println("4. Quit.");
            userInt = Integer.valueOf(myScanner.next());
            myScanner.nextLine();
        } catch(Exception e) {
            System.out.println("Please input an integer.");
        }
        switch(userInt) {
            case 1:
                flipString();
                break;
            case 2:
                reverseString();
                break;
            case 3:
                flipItAndReverseIt();
                break;
            case 4:
                System.out.printf("Thanks for using stringy");
                keepLooping = false;
                break;
        }
    } while(keepLooping);


    }
    //        Tells whether or not what the user entered is a number
    public static boolean isString(String inputStr) {
        boolean output = false;
        if(NumberUtils.isCreatable(inputStr)) {
        } else {
            output = true;
        }
        return output;
    }
    //         END Tells whether or not what the user entered is a number
    //
    //        Flips the case of the string
    public static String flipString(){
        String output = "";
        System.out.println("Input something: \t");
        String userInput = myScanner.nextLine();
        if(isString(userInput)) {
            output = StringUtils.swapCase(userInput);
            System.out.println("Your input was not a valid Java number. I flipped your string case!");
            System.out.println(output);
        } else {
            output = "Your input was a valid Java number. I did not flip your string case.";
            System.out.println(output);
        }
        return output;
    }
    //        END Flips the case of the string
    //
    //        Reverses the string
    public static String reverseString(){
        String output = "";
        System.out.println("Input something: \t");
        String userInput = myScanner.nextLine();
        if(isString(userInput)) {
            output = StringUtils.reverse(userInput);
            System.out.println("Your input was not a valid Java number. I reversed your string order!");
            System.out.println(output);
        } else {
            output = "Your input was a valid Java number. I did not reverse your string order.";
            System.out.println(output);
        }
        return output;
    }
    //        END Reverses the string
    //
    //        Flip and Reverse string
    public static String flipItAndReverseIt(){
        String output = "";
        System.out.println("Input something: \t");
        String userInput = myScanner.nextLine();
        if(isString(userInput)) {
            output = StringUtils.reverse(userInput);
            output = StringUtils.swapCase(userInput);
            System.out.println("Your input was not a valid Java number. I put your String down flipped it and reversed it!\nTi esrever dna ti pilf, nwod gnirts ruoy tup");
            System.out.println(output);
        } else {
            output = "Your input was a valid Java number. I did not reverse your string order.";
            System.out.println(output);
        }
        return output;
    }
}
