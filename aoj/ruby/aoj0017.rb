alphabet = ('a'..'z').to_a
alphabet.unshift('A')

while line = gets
  26.times do |shift|
    ans = []
    shift += 1
    line.to_s.chomp.chars do |char|
      if char == '.' || char == ' '
        ans << char
      else
        num = alphabet.index(char) + shift
        if num > 26
          num -= 26
        end
        ans << alphabet[num]
      end
    end
    if ans.join.match("/the|this|that/") != nil
      puts ans.join
      ans.clear
      break
    end
  end

end