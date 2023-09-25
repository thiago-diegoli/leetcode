import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman_dict = new HashMap<>();  
        roman_dict.put('I', 1);
        roman_dict.put('V', 5);
        roman_dict.put('X', 10);
        roman_dict.put('L', 50);
        roman_dict.put('C', 100);
        roman_dict.put('D', 500);
        roman_dict.put('M', 1000);
        int result = 0;
        int l = 0;
        int roman_int;
        for (int i = s.length()-1; i > -1; i--) {
            roman_int = roman_dict.get(s.charAt(i));
            if (roman_int < l) {
                result -= roman_int;
            } else {
                result += roman_int;
            }
            l = roman_int;
        }
        return result;
    }
}
