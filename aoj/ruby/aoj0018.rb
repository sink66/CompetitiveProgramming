line = gets.split.map(&:to_i)

puts line.sort!.reverse!.join(" ")

# puts gets.split.map(&:to_i).sort.reverse*' '