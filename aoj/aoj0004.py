import sys

for line in sys.stdin.readlines():
    a, b, c, d, e, f = map(float, line.split())
    x = (c * e - f * b) / (a * e - d * b)
    y = (a * f - d * c) / (a * e - d * b)
    if (x == -0):
        x = 0
    elif (y == -0):
        y = 0
    print("{:0.3f} {:0.3f}".format(x, y))
