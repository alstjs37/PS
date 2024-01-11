from collections import deque

deq = deque()
result = []

n, k = map(int, input().split())

for i in range(1, n+1):
    deq.append(i)

while len(deq) != 0:
    deq.rotate(-(k-1))
    result.append(deq.popleft())

print("<", end="")
print(*result, sep=", ", end="")
print(">")