N = gets.to_i

N.times do
  a, b, c = gets.split.map(&:to_i)
  if (a * a) + (b * b) == (c * c) || (b * b) + (c * c) == (a * a) || (c * c) + (a * a) == (b * b)
    puts "YES"
  else
    puts "NO"
  end
end