package java;
import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "XX";
        int result = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanValues.get(s.charAt(i));
            if (curValue < prevValue) {
                total -= curValue;
            } else {
                total += curValue;
            }
            prevValue = curValue;
        }
        return total;
    }
}
