while line = gets
  a = line.split.map(&:to_i)
  b = gets.split.map(&:to_i)

  hit = 0
  blow = 0

  0..4.times do |i|
    if a[i] == b[i]
      hit += 1
    elsif b.include?(a[i])
      blow += 1
    end
  end

  puts "#{hit} #{blow}"

end