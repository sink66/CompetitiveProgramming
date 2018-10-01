stack = []

while input = gets do
  if input.to_i == 0
    puts stack.pop
  else
    stack << input.to_i
  end
end