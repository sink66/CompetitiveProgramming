n = gets.to_i

ans = 1
n.times do |i|
  ans *= i+1
end
puts ans