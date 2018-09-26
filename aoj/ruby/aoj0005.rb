def gcd(m, n)
  if n == 0
    return m
  end
  new_n = m % n
  return gcd(n, new_n)
end

while line = gets
  a, b = line.split.map(&:to_i)

  result_gcd = 0
  if a < b
    result_gcd = gcd(b, a)
  else
    result_gcd = gcd(a, b)
  end

  lcm = (a * b / result_gcd)

  puts result_gcd.to_s + " " + lcm.to_s
end