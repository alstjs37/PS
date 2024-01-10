## 느낀점
# 이걸 기준으로 이걸 저장하고 싶어 -> tuple로 묶어서 저장한다음
# 인덱싱으로 원하는 값만 출력하면 됨
import sys, heapq

input = sys.stdin.readline

heap = []

for _ in range(int(input())):
    num = int(input())
    if num == 0:
        if len(heap) == 0:
            print(0)
        else:
            print(heapq.heappop(heap)[1])
    else:
        heapq.heappush(heap, (abs(num), num))