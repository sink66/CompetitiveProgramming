listtmp = [input() for i in range(5)]
a, b, c, d, p = map(int, listtmp)

x = p * a
y = 0
if p <= c:
    y = b
else:
    y = b + (d * (p-c))

if x > y:
    print(y)
else:
    print(x)
