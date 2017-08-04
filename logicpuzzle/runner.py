import itertools

runner = ['A', 'B', 'C', 'D', 'E', 'F', 'G']
all_list = list(itertools.permutations(runner))

for list in all_list:
    # ア AはBよりは後に、Gより先にゴールした。
    if list.index('G') > list.index('A') > list.index('B'):
        # イ Bは1番目にゴールしなかった。
        if list.index('B') != 0:
            # ウ Dは5番目にゴールしなかった。
            if list.index('D') != 4:
                # エ Cの次にEがゴールした。
                if list.index('C') + 1 == list.index('E'):
                    # オ Fの直前にDがゴールした。
                    if list.index('F') - 1 == list.index('D'):
                        # カ EとFの間に3人がゴールした。
                        a = list.index('E') - list.index('F')
                        b = list.index('F') - list.index('E')
                        if (a == -4 and b == 4) or (b == -4 or a == 4):
                            print(list)
