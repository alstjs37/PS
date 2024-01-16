from collections import deque

n = int(input())
ballon = list(map(int, input().split()))

deq = deque(i for i in range(1, n+1))

ans = []

while len(deq) != 0:
    next_num = deq.popleft()
    ans.append(next_num)

    num = ballon[next_num-1]
    
    if num >= 0:
        deq.rotate(num-1)
    else:
        deq.rotate(num)

print(*ans)