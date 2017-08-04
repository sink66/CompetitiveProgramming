N = input()
for i in range(int(N)):
    a, b, c = map(int, input().split())
    if(a*a) + (b*b) == (c*c):
        print("YES")
    elif(b*b) + (c*c) == (a*a):
        print("YES")
    elif(c*c) + (a*a) == (b*b):
        print("YES")
    else:
        print("NO")
