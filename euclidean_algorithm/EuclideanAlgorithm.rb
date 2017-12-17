require 'time'

class EuclideanAlgorithm
  a = 221
  b = 143

  start_time = Time.now

  loop do
    r = a % b

    break if r == 0

    a = b
    b = r
  end

  puts "Greatest common factor is '#{b}'"

  end_time = Time.now

  puts "Exec time: #{(end_time - start_time) * 100000} ms"
end