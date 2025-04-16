public class Solution {
    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = value(s.charAt(i));
                        if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }

    private static int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral");
        }
    }

    public static void main(String[] args) {
        System.out.println("Input: III");
        System.out.println("Output: " + romanToInt("III"));
        System.out.println("Input: LVIII");
        System.out.println("Output: " + romanToInt("LVIII")); 
        System.out.println("Input: MCMXCIV");
        System.out.println("Output: " + romanToInt("MCMXCIV"));
    }
}
