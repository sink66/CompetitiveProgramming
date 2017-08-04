import itertools

owner = ['P', 'Q', 'R']
doll = ['A', 'B', 'C', 'D', 'E', 'F']
doll_eye = ['黒', '茶', '青', '緑', 'ヘイゼル', 'グレイ']
doll_hair = ['ブラウン', 'ライトブラウン', 'ブロンド', 'アッシュブロンド', '黒', '赤']

result = {}

# 1

l = list(itertools.product(owner, doll, doll_eye, doll_hair))
p_list = []
q_list = []
r_list = []
for elm in l:
    if elm[0] == 'P':
        p_list.append(elm)
for elm in l:
    if elm[0] == 'Q':
        q_list.append(elm)
for elm in l:
    if elm[0] == 'R':
        r_list.append(elm)

# ２．Ｃの髪はブロンドで、Ｑがこの人形を持っている。
l2 = [i for i in l if not (i[1] == 'C' and (i[0] != 'Q' or i[3] != 'ブロンド'))]
l3 = [i for i in l2 if not (i[1] != 'C' and i[3] == 'ブロンド')]

# ３．青い目の人形の髪はアッシュブロンドで、この人形を持っているのはＲ。
l4 = [i for i in l3 if not (i[2] == '青' and (i[3] != 'アッシュブロンド' or i[0] != 'R'))]
l5 = [i for i in l4 if not (i[2] != '青' and i[3] == 'アッシュブロンド')]

# ４．ある者はＤと緑の目の人形の２つを持っている。
# うまく行かない
# 全探索する
# どうやって？

for i in l5:
    print(i)
