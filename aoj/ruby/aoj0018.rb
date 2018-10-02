line = gets.split.map(&:to_i)

puts line.sort!.reverse!.join(" ")
