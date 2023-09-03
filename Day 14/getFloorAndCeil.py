def getFloorAndCeil(arr, n, x):
    floor = -1
    ceil = -1

    for i in range(n):
        if arr[i] == x:
            return x, x  # x is present in the array, so floor and ceil are both x
        elif arr[i] < x:
            floor = max(floor, arr[i])
        elif arr[i] > x:
            ceil = min(ceil, arr[i]) if ceil != -1 else arr[i]

    return floor, ceil