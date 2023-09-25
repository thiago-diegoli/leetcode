class Solution:
    def romanToInt(self, s: str) -> int:
        roman_dict = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        n, l = 0, 0
        for i in s[::-1]:
            if roman_dict[i] < l:
                n -= roman_dict[i]
            else:
                n += roman_dict[i]
            l = roman_dict[i]
        return n