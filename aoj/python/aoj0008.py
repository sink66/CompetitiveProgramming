import sys

for line in sys.stdin.readlines():

    n = int(line)
    count = 0

    for a in range(10):
        for b in range(10):
            for c in range(10):
                for d in range(10):
                    if a + b + c + d == n:
                        count += 1
    print(count)
