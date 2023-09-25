class Solution {
    public boolean isPalindrome(int x) {
        String x_str = Integer.toString(x);
        int c1 = 0;
        int c2 = x_str.length()-1;
        if (x < 0) {
            return false;
        }
        for (int i = 0; i < x_str.length(); i++) {
            if (x_str.charAt(c1) != x_str.charAt(c2)) {
                return false;
            }
            c1++;
            c2--;
        }
        return true;
    }
}