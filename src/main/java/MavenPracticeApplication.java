import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils
import java.util.Scanner;

public class MavenPracticeApplication {
    private static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

//        Flips the case of the string
//        Reverses the string
    }
    //        Tells whether or not what the user entered is a number
    public static boolean isString(String inputStr) {
        boolean output = false;
        if(NumberUtils.isCreatable(inputStr) && inputStr.split(" ").length == 0) {
            System.out.println("Your input " + "'" + inputStr + "'" + " is a valid Java number");
        } else {
            System.out.println("Your input " + "'" + inputStr + "'" + " is not a valid Java number");
            output = true;
        }
        return output;
    }
    //         END Tells whether or not what the user entered is a number
    //
    //        Flips the case of the string
    public static String flipString(String inputStr){
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
    public static String reverseString(String inputStr){
        String output = "";
        System.out.println("Input something: \t");
        String userInput = myScanner.nextLine();
        if(isString(userInput)) {
            output = StringUtils.swapCase(userInput);
            System.out.println("Your input was not a valid Java number. I reversed your string order!");
            System.out.println(output);
        } else {
            output = "Your input was a valid Java number. I did not reverse your string order.";
            System.out.println(output);
        }
        return output;

    }
}
