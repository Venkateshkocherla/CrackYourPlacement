class FindPair
{
    public boolean findPair(int arr[], int size, int n)
    {
      Arrays.sort(arr);
        int i = 0;
        int j = 1;
        while (i < arr.length && j < arr.length) {
            if (i != j && arr[j] - arr[i] == n) {
                return true;
            }
            else if (arr[j] - arr[i] < n) {
                j++;
            }
            else {
                i++;
            }
        }
        return false;
    }
}