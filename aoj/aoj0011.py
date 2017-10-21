import sys

w = input()
n = input()

amida = list(range(1, int(w) + 1))

for line in sys.stdin.readlines():
    bar = line.split(",")
    amida[int(bar[0]) - 1], amida[int(bar[1]) - 1] = amida[int(bar[1]) - 1], amida[int(bar[0]) - 1]

for result in amida:
    print(result)
