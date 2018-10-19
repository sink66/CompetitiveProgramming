paper = Array.new(10).map {Array.new(10, 0)}

paper[1][0] += 1

paper.each do |paper|
  print paper
  puts "--"
end


# print paper[1]


puts -1.positive?
puts 1.positive?
puts -1.negative?
puts 1.negative?
puts 0.positive?
puts 0.negative?

puts -0.negative?
puts 0.positive?