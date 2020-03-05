import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
    public static double intDivideToReal (int a, int b) throws ArithmeticException {
        try {
            double c = a /b;
            return c;
        } catch(ArithmeticException ae) {
            throw new Error("Error in intDivideToReal: Attempted to divide by zero");
        }
    }

    public static void main(String[] args) {
        intDivideToReal(2, 0);
    }
    public static String comp(int a, int b) {
        if(a == b) {
            return String.format("%d = %d", a, b);
        } else if(a < b) {
            return String.format("%d < %d", a, b);
        } else {
            return String.format("%d > %d", a, b);
        }
    }

    /**
     * Take a list of Integers and a target integer. Return any the index pairs from the array list that equal the target when summed. Example 1, 2, 3, 4 tgt = 5. [[0, 3], [1, 2]]
     * @param arrList
     * @param tgt
     * @return
     */
    public static List<ArrayList<Integer>> findAddInsIndex(ArrayList<Integer> arrList, int tgt) {
        List<ArrayList<Integer>> outputList = new ArrayList<>();
        for(int num : arrList) {
            if (arrList.indexOf(tgt - num) != -1) {
                ArrayList<Integer> addList = new ArrayList<>();
                addList.add(arrList.indexOf(num));
                addList.add(arrList.indexOf(tgt - num));
                outputList.add(addList);
            }
        }
        return outputList;
    }
    public static List<ArrayList<Integer>> findAddIns(ArrayList<Integer> arrList, int tgt) {
        List<ArrayList<Integer>> outputList = new ArrayList<>();
        for(int num : arrList) {
            if (arrList.indexOf(tgt - num) != -1) {
                ArrayList<Integer> addList = new ArrayList<>();
                addList.add(arrList.get(arrList.indexOf(num)));
                addList.add(arrList.get(arrList.indexOf(tgt - num)));
                outputList.add(addList);
            }
        }
        return outputList;
    }
    /**
     * Daily coding problem from the mailing list. take input array. multiply each index except the current index. save that as the value for that index on a new arr. return the new arr
     */
    public static int[] multElems(int[] arr) {
        int[] output = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int j = 0;
            int num = 1;
            while(j < arr.length) {
                if(i != j) {
                    num *= arr[j];
                }
                j++;
            }
            output[i] = num;
        }
        return output;
    }
    public static ArrayList<Integer> factors(int num) {
        ArrayList<Integer> output = new ArrayList<>();
        int i = 1;
        while(i <= num) {
            if(num % i == 0) {
                output.add(i);
            }
            i++;
        }
        return output;
    }
}
