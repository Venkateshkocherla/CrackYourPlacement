class Permutation:
    def isPossible(self,a, b, n, k):
    # Your code goes here
        a.sort()
        b.sort(reverse = True)
        for i in range(n):
            if a[i]+b[i]<k:
                return False
        return True