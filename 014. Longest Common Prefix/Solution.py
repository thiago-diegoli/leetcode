class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        counter = 0
        shortest = min(strs)
        if len(strs) == 1:
            return strs[0]
        for j in range(len(shortest)):
            letter = ''
            for i in strs:
                if letter and letter != i[counter]:
                    return shortest[:counter]
                letter = i[counter]
            counter += 1
        if counter:
            return shortest[:counter]
        else:
            return ''