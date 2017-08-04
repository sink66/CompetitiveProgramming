import sys


def gcd(a, b):
    while b:
        a, b = b, a % b
    return a


def lcm(a, b):
    return a * b // gcd(a, b)


sets = sys.stdin.readlines()
for line in sets:
    a, b = map(int, line.split())
    print(gcd(a, b), lcm(a, b))
