# def dfs(vertex):
#     visited = []
#     for v in graph[vertex-1]:
        

graph_cond = list(map(int, input().split()))

graph = [[0 for _ in range(graph_cond[0])] for _ in range(graph_cond[0])]

for _ in range(graph_cond[1]):
    v, e = map(int, input().split())
    graph[v-1][e-1] = 1

# dfs(graph_cond[2])