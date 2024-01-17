from collections import deque

def dfs(start, visited):
    visited[start] = True
    print(start, end = ' ')

    for i in range(1, len(graph[start])):
        if graph[start][i] == 1 and not visited[i]:
            dfs(i, visited)

def bfs(start, visited):
    queue = deque()
    queue.append(start)

    while queue:
        value = queue.popleft()

        if not visited[value]:
            visited[value] = True
            print(value, end = ' ')

            for i in range(1, len(graph[value])):
                if graph[value][i] == 1 and not visited[i]:
                    queue.append(i)
    

n, m, v = map(int, input().split())

graph = [[0] * (n+1) for _ in range(n+1)]

for _ in range(m):
    vertex, edge = map(int, input().split())
    graph[vertex][edge] = graph[edge][vertex] = 1

visited = [False] * (n+1)
visited_bfs = [False] * (n+1)

dfs(v, visited)
print()
bfs(v, visited_bfs)
