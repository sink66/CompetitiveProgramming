list = Array.new(1000000)
for i in 2..list.size
  list[i] = 0
end
for i in 2..1000000
  if list[i] == 1
    next
  else
    j = i + i
    while j < list.size
      list[j] = 1
      j += i
    end
  end
end

while n = gets
  count = 0
  n = n.to_i

  for i in 2..n
    if list[i] == 0
      count += 1
    end
  end
  puts count
end