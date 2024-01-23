def dfs(start, visited):
    visited[start] = True

    for i in range(1, len(graph[start])):
        if not visited[i] and graph[start][i] == 1:
            dfs(i, visited)
    return visited

computer = int(input())
n = int(input())

graph = [[0] * (computer + 1) for _ in range(computer+1)]

for _ in range(n):
    x, y = map(int, input().split())
    graph[x][y] = graph[y][x] = 1

visited = [False] * (computer + 1)
re = dfs(1, visited)

result = 0
for bool in re:
    if bool: result += 1

print(result-1)