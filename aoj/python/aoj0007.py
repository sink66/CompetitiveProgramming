import math

n = int(input())
debt = 100000

for i in range(n):
    debt += debt*0.05
    debt /= 1000
    debt = math.ceil(debt)
    debt *= 1000

print(debt)
