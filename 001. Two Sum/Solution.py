class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        c1 = 0
        for i in nums:
            c2=0
            for j in nums:
                if c1 != c2:
                    if i + j == target:
                        return [c1, c2]
                c2+=1
            c1+=1