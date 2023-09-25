class Solution:
    def isValid(self, s: str) -> bool:
        openBracket = []
        bracketDict = {'{':'}', '(':')', '[':']'}
        for i in s:
            isOpen = False
            if i in ['{', '(', '[']:
                openBracket.append(i)
                isOpen = True
            else:
                if not isOpen:
                    try:
                        if bracketDict[openBracket[-1]] != i:
                            return False
                        else:
                            openBracket.pop()
                    except:
                        return False
                if not s.index(i):
                    return False
        return not len(openBracket)