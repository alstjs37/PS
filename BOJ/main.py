string = list(input())
word = list(input())

stack = []

for str in string:
    stack.append(str)

    if word in str(stack):
        for _ in range(len(word)):
            stack.pop()

print("FRULA" if len(stack) == 0 else stack)


# print(type(str([1,2,3])))