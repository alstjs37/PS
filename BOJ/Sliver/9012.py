t = int(input())

for _ in range(t):
    parenthesis = list(input())
    
    stack = []
    for par in parenthesis:
        if par == "(":
            stack.append(par)
        
        if par == ")":
            if len(stack) != 0 and stack[-1] == "(":
                stack.pop()
            else:
                stack.append(par)

    print("YES" if len(stack) == 0 else "NO")