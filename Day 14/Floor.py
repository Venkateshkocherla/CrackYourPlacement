class Floor:
    #User function Template for python3
    
    #Complete this function
    def findFloor(self,A,N,X):
        #Your code here
        for i in range(N-1,0,-1):
            if(A[i]<=X):
                return i
        return -1