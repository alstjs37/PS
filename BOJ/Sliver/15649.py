from itertools import permutations

n, m = map(int, input().split())

arr = [i+1 for i in range(n)]

for elem in list(permutations(arr, m)):
    print(" ".join(map(str, elem)))