N = int(input())
T = [int(i) for i in input().split()]
M = int(input())
for i in range(M):
    P, X = map(int, input().split())
    result = 0
    for j in range(len(T)):
        if j == (P-1):
            result += X
        else:
            result += T[j]
    print(result)
