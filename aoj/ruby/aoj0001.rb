mountains = []
10.times do
  mountains << gets.to_i
end
mountains.sort!.reverse!
puts mountains[0]
puts mountains[1]
puts mountains[2]
