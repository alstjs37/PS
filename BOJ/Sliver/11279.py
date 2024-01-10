## 느낀점
# 최대와 최소는 반대이다
# 1 2 3 의 최대는 3
# -1 -2 -3 의 최소는 -3
# 3 = -3 * -1

import heapq, sys

input = sys.stdin.readline

heap = []
n = int(input())

for _ in range(n):
    num = int(input()) * -1

    if num == 0: 
        if len(heap) == 0:
            print(0)
        else:
            print(heapq.heappop(heap)*-1)
    else:
        heapq.heappush(heap, num)