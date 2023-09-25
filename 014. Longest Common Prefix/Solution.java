class Solution {
    public String longestCommonPrefix(String[] strs) {
        int counter = 0;
        String letter;
        String shortest = "";
        String any = strs[0];
        for (int x = 0; x < strs.length; x++) {
                if (strs[x].length() <= any.length()) {
                    shortest = strs[x];
                    any = shortest;
                }
            }
        if (strs.length == 1) {
            return shortest;
        }
        for (int i = 0; i < shortest.length(); i++) {
            letter = "";
            for (int j = 0; j < strs.length; j++) {
                if (!letter.equals("") && letter.charAt(0) != strs[j].charAt(counter)) {
                    return shortest.substring(0, counter);
                }
                letter += strs[j].charAt(counter);
            }
            counter++;
        }
        if (counter != 0) {
            return shortest.substring(0, counter);
        }
        return "";
    }
}