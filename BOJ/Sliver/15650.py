from itertools import combinations

n, m = map(int, input().split())

arr = [i+1 for i in range(n)]

for elem in list(combinations(arr, m)):
    print(" ".join(map(str, elem)))