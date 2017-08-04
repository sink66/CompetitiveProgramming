file = open('a.txt', 'r')

total = ave = cnt = 0

for i in file:
    for j in i.split(","):
        total += int(j.rstrip())
        cnt += 1

print("合計：" + str(total))
print("平均：" + str(total / cnt))
