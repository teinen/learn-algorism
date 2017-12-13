require 'time'

class BubbleSort
  input_arr = [20, 13, 17, 15, 18, 16, 14, 19]

  # variables
  len = input_arr.size
  lastIdx = len - 1
  i = 0
  k = 0
  w = 0

  start_time = Time.now

  puts "=== Exec Bubble Sort in Ruby ==="

  while k < lastIdx
    i = lastIdx

    while i > k
      if input_arr[i - 1] > input_arr[i]
        w = input_arr[i - 1]
        input_arr[i - 1] = input_arr[i]
        input_arr[i] = w
      end
      i -= 1
    end

    k += 1
  end

  puts input_arr.to_s

  end_time = Time.now

  puts "Exec time: #{(end_time - start_time) * 100000} ms"
end