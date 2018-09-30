w = gets.to_i
n = gets.to_i

amida = (1..w).to_a

while line = gets do
  bar = line.split(",").map(&:to_i)
  tmp = amida[bar[0] - 1]
  amida[bar[0] - 1] = amida[bar[1] - 1]
  amida[bar[1] - 1] = tmp
end

puts amida