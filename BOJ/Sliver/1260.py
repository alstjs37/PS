from collections import deque

def dfs(start, visited, ans = []):
    ans.append(start)
    visited[start] = True

    for i in range(1, len(graph[start])):
        if graph[start][i] == 1 and not visited[i]:
            dfs(i, visited)

    return ans

def bfs(start, visited):
    queue = deque()
    queue.append(start)

    ans = []
    while queue:
        value = queue.popleft()

        if not visited[value]:
            ans.append(value) 
            visited[value] = True

            for i in range(1, len(graph[value])):
                if graph[value][i] == 1 and not visited[i]:
                    queue.append(i)
    
    return ans

n, m, v = map(int, input().split())

graph = [[0] * (n+1) for _ in range(n+1)]

for _ in range(m):
    vertex, edge = map(int, input().split())
    graph[vertex][edge] = graph[edge][vertex] = 1

visited = [False] * (n+1)
visited_bfs = [False] * (n+1)

print(*dfs(v, visited))
print(*bfs(v, visited_bfs))
