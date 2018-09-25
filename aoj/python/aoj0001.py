hills = [int(input()) for i in range(10)]
hills.sort()
hills.reverse()
for i in range(3):
    print(hills[i])