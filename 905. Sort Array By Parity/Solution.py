class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        odds, evens = [], []
        for i in nums:
            if i % 2:
                odds.append(i)
            else:
                evens.append(i)
        evens.extend(odds)
        return evens