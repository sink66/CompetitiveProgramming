import sys, math


def hurui(n):
    search_list = list(range(2, n+1))
    prime_list = []
    while search_list[0] <= math.sqrt(n):
        prime_list.append(search_list.pop(0))
        for i in search_list:
            if i % prime_list[-1] == 0:
                search_list.remove(i)

    prime_list.extend(search_list)
    return prime_list


for line in sys.stdin.readlines():
    n = int(line)
    result = hurui(n)
    print(len(result))
