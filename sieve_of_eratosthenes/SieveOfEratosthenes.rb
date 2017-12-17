require 'time'

class SieveOfEratosthenes
  arr = Array.new(100, 1)

  i = 0
  k = 2
  size = arr.size

  start_time = Time.now

  puts "=== Find Prime Numbers in Ruby ==="

  while (k * k) <= size
    i = k

    while (i * k) < size
      arr[k * i] = 0
      i += 1
    end

    begin
      k += 1
    end while arr[k] == 0
  end

  i = 2

  while i < size
    puts i if arr[i] == 1
    i += 1
  end

  end_time = Time.now

  puts "Exec time: #{(end_time - start_time) * 100000} ms"
end