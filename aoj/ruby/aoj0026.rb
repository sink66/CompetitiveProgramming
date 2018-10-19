paper = Array.new(10).map {Array.new(10, 0)}

while line = gets
  x, y, s = line.split(",").map(&:to_i)

  # 滴下位置
  paper[x][y] += 1

  if s == 1

    # 上下左右

    # 上
    unless paper[x][y - 1].nil?
      paper[x][y - 1] += 1
    end
    # 下
    unless paper[x][y + 1].nil?
      paper[x][y + 1] += 1
    end
    # 左
    unless paper[x + 1][y].nil?
      paper[x + 1][y] += 1
    end
    # 下
    unless paper[x - 1][y].nil?
      paper[x - 1][y] += 1
    end

  elsif s == 2
    # 周囲一マス

    # 上
    unless paper[x][y - 1].nil?
      paper[x][y - 1] += 1
    end
    # 下
    unless paper[x][y + 1].nil?
      paper[x][y + 1] += 1
    end
    # 左
    unless paper[x + 1][y].nil?
      paper[x + 1][y] += 1
    end
    # 右
    unless paper[x - 1][y].nil?
      paper[x - 1][y] += 1
    end

    # 右上
    unless paper[x + 1][y - 1].nil?
      paper[x + 1][y - 1] += 1
    end
    # 右下
    unless paper[x + 1][y + 1].nil?
      paper[x + 1][y + 1] += 1
    end
    # 左上
    unless paper[x - 1][y - 1].nil?
      paper[x - 1][y - 1] += 1
    end
    # 左下
    unless paper[x - 1][y + 1].nil?
      paper[x - 1][y + 1] += 1
    end

  elsif s == 3
    # 周囲一マス+上下左右ニマス

    # 上
    unless paper[x][y - 1].nil?
      paper[x][y - 1] += 1
    end
    # 下
    unless paper[x][y + 1].nil?
      paper[x][y + 1] += 1
    end
    # 左
    unless paper[x + 1][y].nil?
      paper[x + 1][y] += 1
    end
    # 右
    unless paper[x - 1][y].nil?
      paper[x - 1][y] += 1
    end

    # 右上
    unless paper[x + 1][y - 1].nil?
      paper[x + 1][y - 1] += 1
    end
    # 右下
    unless paper[x + 1][y + 1].nil?
      paper[x + 1][y + 1] += 1
    end
    # 左上
    unless paper[x - 1][y - 1].nil?
      paper[x - 1][y - 1] += 1
    end
    # 左下
    unless paper[x - 1][y + 1].nil?
      paper[x - 1][y + 1] += 1
    end

    # 上ニマス目
    unless paper[x][y - 2].nil?
      paper[x][y - 2] += 1
    end
    # 下ニマス目
    unless paper[x][y + 2].nil?
      paper[x][y + 2] += 1
    end
    # 左ニマス目
    unless paper[x + 2][y].nil?
      paper[x + 2][y] += 1
    end
    # 右ニマス目
    unless paper[x - 2][y].nil?
      paper[x - 2][y] += 1
    end
  end

  paper.each do |a|
    p a
  end

end

puts paper.flatten.count(0)
puts paper.flatten.max
