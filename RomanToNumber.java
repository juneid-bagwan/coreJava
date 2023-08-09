import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
    public static int romanToInt(String s) {
        // Create a map to store the numeric values of Roman numerals
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = values.get(s.charAt(i));

            // If the current value is smaller than the previous value,
            // subtract it from the result; otherwise, add it to the result
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }

    public static void   main(String[] args) {
        String romanNumeral = "XXX";
        int number = romanToInt(romanNumeral);
        System.out.println(number); // Output: 24
    }
}
