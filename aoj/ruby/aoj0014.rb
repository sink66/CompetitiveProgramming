N = gets.to_i

N.times do
  result = gets.to_i + gets.to_i
  if result.to_s.size > 80
    puts "overflow"
  else
    puts result
  end
end