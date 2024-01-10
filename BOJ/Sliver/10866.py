import sys
from collections import deque

input = sys.stdin.readline

deq = deque()
n = int(input())

for _ in range(n):
    command = input().split()
    
    if command[0] == "push_front":
        deq.appendleft(command[1])
    
    if command[0] == "push_back":
        deq.append(command[1])

    if command[0] == "pop_front":
        if len(deq) == 0:
            print(-1)
        else: 
            print(deq.popleft())

    if command[0] == "pop_back":
        if len(deq) == 0:
            print(-1)
        else: 
            print(deq.pop())
    
    if command[0] == "size":
        print(len(deq))
    
    if command[0] == "empty":
        print(1 if len(deq) == 0 else 0)

    if command[0] == "front":
        print(-1 if len(deq) == 0 else deq[0])
    
    if command[0] == "back":
        print(-1 if len(deq) == 0 else deq[-1])