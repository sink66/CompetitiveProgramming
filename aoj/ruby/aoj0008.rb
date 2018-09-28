while n = gets

  n = n.to_i
  count = 0

  for a in 0..9 do
    for b in 0..9 do
      for c in 0..9 do
        for d in 0..9 do
          if a + b + c + d == n
            count += 1
          end
        end
      end
    end
  end

  puts count

end