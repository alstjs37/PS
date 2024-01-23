str = list(input())

ans = [-1] * 26
for i, elem in enumerate(str):
    index = ord(elem) - 97
    if ans[index] == -1: ans[index] = i

print(*ans)