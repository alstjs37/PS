def dfs(v, visited, ans=[]):
    visited[v] = True
    ans.append(v)
    for i in range(len(graph[v])):
        if graph[v][i] == 1 and not visited[i]:
            dfs(i, visited, ans)

    return ans, visited

n, m, r = list(map(int, input().split()))

graph = [[0] * (n+1) for _ in range(n+1)]

for _ in range(m):
    u, v = map(int, input().split())
    graph[u][v] = 1

visited = [False] * (n+1)
a, v = dfs(r, visited)

for i in range(1, len(v)):
    if not v[i]:
        a.insert(i, 0)

print(*a, sep='\n')