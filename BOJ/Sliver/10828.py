import sys
from collections import deque

input = sys.stdin.readline

stack = deque()

n = int(input())

for _ in range(n):
    cmd = input().split()

    if cmd[0] == "push":
        stack.append(cmd[1])

    elif cmd[0] == "pop":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())

    elif cmd[0] == "size":
        print(len(stack))

    elif cmd[0] == "empty":
        print(1 if len(stack) == 0 else 0)

    elif cmd[0] == "top":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[-1])