from collections import deque

def in_range(x, y):
    return x >= 0 and x < n and y >= 0 and y < m

def bfs(x, y):
    queue = deque()
    queue.append((x, y))

    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if in_range(nx, ny) and graph[nx][ny] == 1:
                queue.append((nx, ny))
                graph[nx][ny] = graph[x][y] + 1

    return graph[n-1][m-1]


n, m = map(int, input().split())

graph = []
for _ in range(n):
    graph.append(list(map(int, input())))

print(bfs(0,0))