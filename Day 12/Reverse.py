class Reverse:
    def reverseWords(self, s: str) -> str:
        r = s.strip().split()
        res = " ".join(r[::-1])
        return res
