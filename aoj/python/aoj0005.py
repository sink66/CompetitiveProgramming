import sys


def gcd(m, n):
    if n == 0:
        return m
    new_n = m % n
    return gcd(n, new_n)


def lcm(gcd, a, b):
    return a * b // gcd


for line in sys.stdin.readlines():
    a, b = map(int, line.split())
    result_gcd = 0
    if a > b:
        result_gcd = gcd(a, b)
    else:
        result_gcd = gcd(b, a)

    print("{} {}".format(result_gcd, lcm(result_gcd, a, b)))
