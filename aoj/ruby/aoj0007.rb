n = gets.to_i

debt = 100000

n.times do
  debt += debt * 0.05
  tmp = debt % 1000
  if tmp > 0
    debt = debt - tmp + 1000
  end
end

puts debt.to_i